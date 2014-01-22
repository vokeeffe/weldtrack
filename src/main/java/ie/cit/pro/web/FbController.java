package ie.cit.pro.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
		return "fb.jsp";
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
		JSONObject sySectionJSONstr = JSONObject.fromObject( sySection ); 
		System.out.println(sySectionJSONstr);
		
		model.addAttribute("stn_btable", sySection.getStn_btable());
		model.addAttribute("sy_section_jsonstr", sySectionJSONstr);
		model.addAttribute("sy_secfields", syService.getSySecfieldsByCode(sySecfields));
		
		fbService.setFbDomainObject(sySection.getStn_btable());
		
		System.out.println("Adding Attribute: " + MainArea);
		//model.addAttribute("btable", fbService.getAllFbDomainObjects());
		model.addAttribute("btable", fbService.getAllFbWelds());
		
		return "fb.jsp";
	}

	@RequestMapping("create/fbweld")
	public String create(@ModelAttribute ("btable") FbWeld fbWeld, Model model){
		fbWeld.setId(UUID.randomUUID().toString());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getFbDomainObjectName(): " + fbWeld.getFbDomainObjectName());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getId(): " + fbWeld.getId());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getFit_fitting1(): " + fbWeld.getFit_fitting1());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getFit_fitting2(): " + fbWeld.getFit_fitting2());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getIso_num(): " + fbWeld.getIso_num());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getPdr_size(): " + fbWeld.getPdr_size());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getSpl_num(): " + fbWeld.getSpl_num());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getWdr_num(): " + fbWeld.getWdr_num());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getWld_a_createdby(): " + fbWeld.getWld_a_createdby());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getWld_a_modifiedby(): " + fbWeld.getWld_a_modifiedby());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getWld_heat1(): " + fbWeld.getWld_heat1());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getWld_heat2(): " + fbWeld.getWld_heat2());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getWld_num(): " + fbWeld.getWld_num());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getWty_code(): " + fbWeld.getWty_code());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getKco(): " + fbWeld.getKco());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getKtn(): " + fbWeld.getKtn());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getWld_a_createddate(): " + fbWeld.getWld_a_createddate());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getWld_a_modifieddate(): " + fbWeld.getWld_a_modifieddate());
		System.out.println("$$$$££££££££@@@@@ fbWeld.getWld_wdate(): " + fbWeld.getWld_wdate());


		
		fbService.createFbWeld(fbWeld);
		model.addAttribute("btable", fbService.getAllFbWelds());
		return "weldtrack/fb.jsp";
	}

	
	@RequestMapping("find")
	public String find(@ModelAttribute ("fb_welds") FbWeld fbWeld, Model model){
		fbService.createFbWeld(fbWeld);
		model.addAttribute("fb_welds", fbService.getAllFbWelds());
		return "fb.jsp";
	}
	
	@RequestMapping("update")
	public String update(@ModelAttribute ("fb_welds") FbWeld fbWeld, @RequestParam String weldId, Model model){
		fbWeld.setId(weldId);
		fbService.updateFbWeld(fbWeld);
		model.addAttribute("fb_welds", fbService.getAllFbWelds());
		return "fb.jsp";
	}
	
	@RequestMapping("static")
	public String static_page(Model model){
		model.addAttribute("fb_welds", fbService.getAllFbWelds());
		return "static_page.html";
	}
	
}
