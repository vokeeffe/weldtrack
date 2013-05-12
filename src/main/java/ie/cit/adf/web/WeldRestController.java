package ie.cit.adf.web;

import ie.cit.adf.domain.Weld;
import ie.cit.adf.services.WeldService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.util.UriTemplate;

@Controller
@RequestMapping("api/1")//Every method in the Controller mapped to api/1... (1 is version of API)
public class WeldRestController {

	@Autowired
	private WeldService weldService;
	
	//curl -X GET -i http://vinny:Password1@localhost:8080/weldtrack/api/1/weld
	@RequestMapping(value = "weld", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<Weld> welds(){
		return weldService.getAllWelds();
	}
	
	//curl -X GET -i http://vinny:Password1@localhost:8080/weldtrack/api/1/weld/{id}
	@RequestMapping(value = "weld/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Weld weld(@PathVariable String id) {
		Weld weld = weldService.get(id);
		if (weld == null){
			throw new NotFoundException();
		}
		return weld;
	}

	//curl -X POST -i http://vinny:Password1@localhost:8080/weldtrack/api/1/weld -H "Content-Type: application/json" -d '{"type":"butt","weldnum":"1","spoolnum":"1","isonum":"1003","size":80,"fw":false,"weldernum":100,"date_welded":null,"fitting1":"1","fitting2":"2"}'
	@RequestMapping(value = "weld", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public void create(@RequestBody Weld weld, HttpServletRequest req,
			HttpServletResponse resp) {
		weldService.createNewWeld(weld);
		StringBuffer url = req.getRequestURL().append("/{id}");
		UriTemplate uriTemplate = new UriTemplate(url.toString());
		resp.addHeader("location", uriTemplate.expand(weld.getId()).toASCIIString());
	}
	
	//curl -X DELETE -i http://vinny:Password1@localhost:8080/weldtrack/api/1/weld/{id}
	@RequestMapping(value = "weld/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		weldService.delete(id);
	}

	//curl -X PUT -i http://vinny:Password1@localhost:8080/weldtrack/api/1/weld/{id} -H "Accept: application/json" -H "Content-Type: application/json" -d '{"type":"butt","weldnum":"1","spoolnum":"1","isonum":"1004","size":100,"fw":false,"weldernum":100,"date_welded":"2013-05-01","fitting1":"1","fitting2":"2"}'	@RequestMapping(value = "weld/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@PathVariable String id, @RequestBody Weld weld) {
		Weld existing = weldService.get(id);
		if (existing == null){
			System.out.println("WeldRestController.update().NotFoundException");
			throw new NotFoundException();	
		}
		weld.setId(id);
		weldService.updateWeld(weld);
	}
}

@ResponseStatus(HttpStatus.NOT_FOUND)
class NotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
}
