package ie.cit.adf.web;

import ie.cit.adf.domain.Weld;
import ie.cit.adf.services.WeldService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api/1")//Every method in the Controller mapped to api/1... (1 is version of API)
public class WeldRestController {

	@Autowired
	private WeldService weldService;
	
	@ResponseBody
	@RequestMapping("weld") // URL will be http://server/port/weldtrack/api/1/weld
	public List<Weld> welds(){
		return weldService.getAllWelds();
	}
	
}
