package ie.cit.adf.web;

import ie.cit.adf.services.WeldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeldController {
	
	@Autowired
	private WeldService weldService;
	
	@RequestMapping("index")
	public String index(Model model){
		System.out.print(weldService.getAllWelds().get(0).getIsonum());
		model.addAttribute("welds", weldService.getAllWelds());
		return "welds.jsp";
	}
	
	@RequestMapping("create")
	public String create(@RequestParam String isonum, Model model){
		weldService.createNewWeld(isonum);
		model.addAttribute("welds", weldService.getAllWelds());
		return "welds.jsp";
	}


	
}
