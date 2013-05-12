package ie.cit.adf.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import ie.cit.adf.domain.Weld;
import ie.cit.adf.services.WeldService;

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
	private WeldService weldService;
	
	@InitBinder //Allow Empty dates when binding to the Weld object
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    dateFormat.setLenient(false);

	    // true passed to CustomDateEditor constructor means convert empty String to null
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping("index")
	public String index(Model model){
		model.addAttribute("welds", weldService.getAllWelds());
		return "welds.jsp";
	}

	@RequestMapping("create")
	public String create(@ModelAttribute ("weld") Weld weld, Model model){
		weldService.createNewWeld(weld);
		model.addAttribute("welds", weldService.getAllWelds());
		return "welds.jsp";
	}
	
	@RequestMapping("update")
	public String update(@ModelAttribute ("weld") Weld weld, @RequestParam String weldId, Model model){
		weld.setId(weldId);
		weldService.updateWeld(weld);
		model.addAttribute("welds", weldService.getAllWelds());
		return "welds.jsp";
	}
	
}
