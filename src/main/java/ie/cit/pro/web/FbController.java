package ie.cit.pro.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ie.cit.pro.domain.fb.FbDomainObject;
import ie.cit.pro.domain.fb.FbWeld;
import ie.cit.pro.domain.sy.SySecfield;
import ie.cit.pro.domain.sy.SySection;
import ie.cit.pro.services.FbService;
import ie.cit.pro.services.SyService;
import ie.cit.pro.sysdomain.fn.FnFind;
import ie.cit.pro.sysdomain.fn.FnFindElement;

import net.sf.json.JSONObject;

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
		model.addAttribute("fb_welds", fbService.getAllFbWelds());
		return "fbservice.jsp";
	}
	    
	@RequestMapping(value = "system", params = {"MainArea","SideArea"})
	public String weldtrack(Model model, HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "MainArea", required = false) String MainArea)
	{
		
		System.out.println("Entering: " + MainArea);
		//Retrieve the section information
		List<SySection> sySections = new ArrayList<SySection>();
		SySection sySection = new SySection();
		sySection.setStn_code(MainArea);
		sySections.add(sySection);
		
		//Retrieve the section information
		List<SySecfield> sySecfields = new ArrayList<SySecfield>();
		SySecfield sySecfield = new SySecfield();
		sySecfield.setStn_code(MainArea);
		sySecfields.add(sySecfield);
		
		sySection = syService.getSySectionsByCode(sySections).get(0);
		sySection.getStn_bservice();
		JSONObject sySectionJSONstr = JSONObject.fromObject( sySection ); 
		System.out.println(sySectionJSONstr);
		model.addAttribute("sy_section_jsonstr", sySectionJSONstr);
		model.addAttribute("sy_secfields", syService.getSySecfieldsByCode(sySecfields));
		
		fbService.setFbDomainObject(sySection.getStn_btable());
		
		System.out.println("Adding Attribute: " + MainArea);
		//model.addAttribute("btable", fbService.getAllFbDomainObjects());
		model.addAttribute("btable", fbService.getAllFbWelds());
		
		return "welds.jsp";
	}

	@RequestMapping("create/fbweld")
	public String create(@ModelAttribute ("btable") FbWeld fbWeld, Model model){

		fbService.createFbWeld(fbWeld);
		model.addAttribute("fb_welds", fbService.getAllFbWelds());
		return "fbservice.jsp";
	}
	
	@RequestMapping("find")
	public String find(@ModelAttribute ("fb_welds") FbWeld fbWeld, Model model){
		fbService.createFbWeld(fbWeld);
		model.addAttribute("fb_welds", fbService.getAllFbWelds());
		return "fbservice.jsp";
	}
	
	@RequestMapping("update")
	public String update(@ModelAttribute ("fb_welds") FbWeld fbWeld, @RequestParam String weldId, Model model){
		fbWeld.setId(weldId);
		fbService.updateFbWeld(fbWeld);
		model.addAttribute("fb_welds", fbService.getAllFbWelds());
		return "fbservice.jsp";
	}
	
	@RequestMapping("static")
	public String static_page(Model model){
		model.addAttribute("fb_welds", fbService.getAllFbWelds());
		return "static_page.html";
	}
	
}
