package ie.cit.pro.web;

import ie.cit.pro.domain.fb.FbWeld;
import ie.cit.pro.domain.sy.SySecfield;
import ie.cit.pro.services.FbService;

import java.util.ArrayList;
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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@Controller
@RequestMapping("api/1")//Every method in the Controller mapped to api/1... (1 is version of API)
@XmlRootElement(namespace = "ie.cit.pro.web")
public class FbRestController {

	@Autowired
	private FbService fbService;
	  // XmLElementWrapper generates a wrapper element around XML representation
	  @XmlElementWrapper(name = "fb_weld_list")
	  // XmlElement sets the name of the entities
	  @XmlElement(name = "fb_weld")
	private List<FbWeld> fbWeldList;
	
	//curl -X GET -i http://vinny:Password1@localhost:8080/weldtrack/api/1/fb_weld
	//curl -X GET -i http://vinny:Password1@weldtrack.cfapps.io/api/1/fb_weld
	@RequestMapping(value = "/fb_weld", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<FbWeld> welds(){

		  //fbWeldList = new ArrayList<FbWeld>();
		 fbWeldList = fbService.getAllFbWelds();
		 return fbWeldList;
	}
	
	//curl -X GET -i http://vinny:Password1@localhost:8080/weldtrack/api/1/weld/{id}
	//curl -X GET -i http://vinny:Password1@weldtrack.cfapps.io/api/1/fb_weld/{ca8bdbcb-b414-47fc-b1b9-fc2af200f343}
	@RequestMapping(value = "fb_weld/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public FbWeld weld(@PathVariable String id) {
		FbWeld weld = fbService.getFbWeld(id);
		if (weld == null){
			throw new NotFoundException();
		}
		return weld;
	}

	//curl -X POST -i http://vinny:Password1@localhost:8080/weldtrack/api/1/weld -H "Content-Type: application/json" -d '{"type":"butt","weldnum":"1","spoolnum":"1","isonum":"1003","size":80,"fw":false,"weldernum":100,"date_welded":null,"fitting1":"1","fitting2":"2"}'
	@RequestMapping(value = "weld", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public void create(@RequestBody FbWeld weld, HttpServletRequest req,
			HttpServletResponse resp) {
		fbService.createFbWeld(weld);
		StringBuffer url = req.getRequestURL().append("/{id}");
		UriTemplate uriTemplate = new UriTemplate(url.toString());
		resp.addHeader("location", uriTemplate.expand(weld.getId()).toASCIIString());
	}
	
	//curl -X DELETE -i http://vinny:Password1@localhost:8080/weldtrack/api/1/weld/{id}
	@RequestMapping(value = "weld/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		fbService.deleteFbWeld(id);
	}

	//curl -X PUT -i http://vinny:Password1@localhost:8080/weldtrack/api/1/weld/{id} -H "Accept: application/json" -H "Content-Type: application/json" -d '{"type":"butt","weldnum":"1","spoolnum":"1","isonum":"1004","size":100,"fw":false,"weldernum":100,"date_welded":"2013-05-01","fitting1":"1","fitting2":"2"}'	@RequestMapping(value = "weld/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@PathVariable String id, @RequestBody FbWeld weld) {
		FbWeld existing = fbService.getFbWeld(id);
		if (existing == null){
			System.out.println("WeldRestController.update().NotFoundException");
			throw new NotFoundException();	
		}
		weld.setId(id);
		fbService.updateFbWeld(weld);
	}
}

@ResponseStatus(HttpStatus.NOT_FOUND)
class NotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
}
