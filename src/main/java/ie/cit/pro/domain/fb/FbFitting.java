package ie.cit.pro.domain.fb;

import java.util.Date;
import java.util.UUID;

public class FbFitting {

	private String id;
	private String fit_a_createdby;
	private Date  fit_a_createddate;
	private String  fit_a_modifiedby;
	private Date  fit_a_modifieddate;
	private Integer ktn;
	private String fit_code;
	private String fit_name;
	
	public FbFitting(){
		id = UUID.randomUUID().toString();
		}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFit_a_createdby() {
		return fit_a_createdby;
	}
	public void setFit_a_createdby(String fit_a_createdby) {
		this.fit_a_createdby = fit_a_createdby;
	}
	public Date getFit_a_createddate() {
		return fit_a_createddate;
	}
	public void setFit_a_createddate(Date fit_a_createddate) {
		this.fit_a_createddate = fit_a_createddate;
	}
	public String getFit_a_modifiedby() {
		return fit_a_modifiedby;
	}
	public void setFit_a_modifiedby(String fit_a_modifiedby) {
		this.fit_a_modifiedby = fit_a_modifiedby;
	}
	public Date getFit_a_modifieddate() {
		return fit_a_modifieddate;
	}
	public void setFit_a_modifieddate(Date fit_a_modifieddate) {
		this.fit_a_modifieddate = fit_a_modifieddate;
	}
	public Integer getKtn() {
		return ktn;
	}
	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}
	public String getFit_code() {
		return fit_code;
	}
	public void setFit_code(String fit_code) {
		this.fit_code = fit_code;
	}
	public String getFit_name() {
		return fit_name;
	}
	public void setFit_name(String fit_name) {
		this.fit_name = fit_name;
	}
	
}
