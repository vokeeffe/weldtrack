package ie.cit.pro.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import ie.cit.pro.domain.fb.FbWeld;
import ie.cit.pro.services.FbService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeldController {
	
	@Autowired
	private FbService weldService;
	
	@InitBinder //Allow Empty dates when binding to the Weld object
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    dateFormat.setLenient(false);

	    // true passed to CustomDateEditor constructor means convert empty String to null
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping("index")
	public String index(Model model){
		model.addAttribute("welds", weldService.getAllFbWelds());
		return "welds.jsp";
	}

	@RequestMapping("create")
	public String create(@ModelAttribute ("weld") FbWeld weld, Model model){
		weldService.createFbWeld(weld);
		model.addAttribute("welds", weldService.getAllFbWelds());
		return "welds.jsp";
	}
	
	@RequestMapping("update")
	public String update(@ModelAttribute ("weld") FbWeld weld, @RequestParam String weldId, Model model){
		weld.setId(weldId);
		weldService.updateFbWeld(weld);
		model.addAttribute("welds", weldService.getAllFbWelds());
		return "welds.jsp";
	}
	
	@RequestMapping("static")
	public String static_page(Model model){
		model.addAttribute("welds", weldService.getAllFbWelds());
		return "static_page.html";
	}
	
}
