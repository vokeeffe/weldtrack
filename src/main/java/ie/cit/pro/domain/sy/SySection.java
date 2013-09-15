package ie.cit.pro.domain.sy;

import java.util.Date;

public class SySection {

	private String id;
	private String stn_a_createdby;
	private Date  stn_a_createddate;
	private String  stn_a_modifiedby;
	private Date  stn_a_modifieddate;
	private String stn_code;
	private String mf_function;
	private String stn_hservice;
	private String stn_bservice;
	private Integer stn_brows;
	private String stn_btitle;
	private String stn_form;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStn_a_createdby() {
		return stn_a_createdby;
	}
	public void setStn_a_createdby(String stn_a_createdby) {
		this.stn_a_createdby = stn_a_createdby;
	}
	public Date getStn_a_createddate() {
		return stn_a_createddate;
	}
	public void setStn_a_createddate(Date stn_a_createddate) {
		this.stn_a_createddate = stn_a_createddate;
	}
	public String getStn_a_modifiedby() {
		return stn_a_modifiedby;
	}
	public void setStn_a_modifiedby(String stn_a_modifiedby) {
		this.stn_a_modifiedby = stn_a_modifiedby;
	}
	public Date getStn_a_modifieddate() {
		return stn_a_modifieddate;
	}
	public void setStn_a_modifieddate(Date stn_a_modifieddate) {
		this.stn_a_modifieddate = stn_a_modifieddate;
	}
	private String stn_form_method;
	private String stn_script;
	private Integer ktn;
	private String stn_form_action;
	
	public String getStn_code() {
		return stn_code;
	}
	public void setStn_code(String stn_code) {
		this.stn_code = stn_code;
	}
	public String getMf_function() {
		return mf_function;
	}
	public void setMf_function(String mf_function) {
		this.mf_function = mf_function;
	}
	public String getStn_hservice() {
		return stn_hservice;
	}
	public void setStn_hservice(String stn_hservice) {
		this.stn_hservice = stn_hservice;
	}
	public String getStn_bservice() {
		return stn_bservice;
	}
	public void setStn_bservice(String stn_bservice) {
		this.stn_bservice = stn_bservice;
	}
	public Integer getStn_brows() {
		return stn_brows;
	}
	public void setStn_brows(Integer stn_brows) {
		this.stn_brows = stn_brows;
	}
	public String getStn_btitle() {
		return stn_btitle;
	}
	public void setStn_btitle(String stn_btitle) {
		this.stn_btitle = stn_btitle;
	}
	public String getStn_form() {
		return stn_form;
	}
	public void setStn_form(String stn_form) {
		this.stn_form = stn_form;
	}
	public String getStn_form_method() {
		return stn_form_method;
	}
	public void setStn_form_method(String stn_form_method) {
		this.stn_form_method = stn_form_method;
	}
	public String getStn_script() {
		return stn_script;
	}
	public void setStn_script(String stn_script) {
		this.stn_script = stn_script;
	}
	public Integer getKtn() {
		return ktn;
	}
	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}
	public String getStn_form_action() {
		return stn_form_action;
	}
	public void setStn_form_action(String stn_form_action) {
		this.stn_form_action = stn_form_action;
	}

	
}
