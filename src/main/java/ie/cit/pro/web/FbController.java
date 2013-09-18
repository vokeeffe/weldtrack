package ie.cit.pro.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import ie.cit.pro.domain.fb.FbWeld;
import ie.cit.pro.services.FbService;
import ie.cit.pro.services.SyService;

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
public class FbController {
	
	@Autowired
	private FbService fbService;
	
	@Autowired
	private SyService syService;
	
	@InitBinder //Allow Empty dates when binding to the Weld object
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    dateFormat.setLenient(false);

	    // true passed to CustomDateEditor constructor means convert empty String to null
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping("index")
	public String index(Model model){
		model.addAttribute("welds", fbService.getAllFbWelds());
		return "welds.jsp";
	}
	
	@RequestMapping("%WFBWLD101")
	public String index(Model model){
		//syService.get
		model.addAttribute("welds", fbService.getAllFbWelds());
		return "welds.jsp";
	}

	@RequestMapping("create")
	public String create(@ModelAttribute ("weld") FbWeld fbWeld, Model model){
		fbService.createFbWeld(fbWeld);
		model.addAttribute("welds", fbService.getAllFbWelds());
		return "welds.jsp";
	}
	
	@RequestMapping("update")
	public String update(@ModelAttribute ("weld") FbWeld fbWeld, @RequestParam String weldId, Model model){
		fbWeld.setId(weldId);
		fbService.updateFbWeld(fbWeld);
		model.addAttribute("welds", fbService.getAllFbWelds());
		return "welds.jsp";
	}
	
	@RequestMapping("static")
	public String static_page(Model model){
		model.addAttribute("welds", fbService.getAllFbWelds());
		return "static_page.html";
	}
	
}
