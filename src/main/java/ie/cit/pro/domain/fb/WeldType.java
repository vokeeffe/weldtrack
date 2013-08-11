package ie.cit.pro.domain.fb;

import java.util.Date;
//import java.util.Date;
import java.util.UUID;

public class WeldType {

	private String id;
	private String wty_a_createdby;
	private Date wld_a_createddate;
	private String wty_a_modifiedby;
	private Date wld_a_modifieddate;
	private Integer ktn;
	private String wty_code;
	private String wty_name;
	
	public WeldType(){
		id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWty_a_createdby() {
		return wty_a_createdby;
	}

	public void setWty_a_createdby(String wty_a_createdby) {
		this.wty_a_createdby = wty_a_createdby;
	}

	public Date getWld_a_createddate() {
		return wld_a_createddate;
	}

	public void setWld_a_createddate(Date wld_a_createddate) {
		this.wld_a_createddate = wld_a_createddate;
	}

	public String getWty_a_modifiedby() {
		return wty_a_modifiedby;
	}

	public void setWty_a_modifiedby(String wty_a_modifiedby) {
		this.wty_a_modifiedby = wty_a_modifiedby;
	}

	public Date getWld_a_modifieddate() {
		return wld_a_modifieddate;
	}

	public void setWld_a_modifieddate(Date wld_a_modifieddate) {
		this.wld_a_modifieddate = wld_a_modifieddate;
	}

	public Integer getKtn() {
		return ktn;
	}

	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}
	
	public String getWty_code() {
		return wty_code;
	}
	public void setWty_code(String wty_code) {
		this.wty_code = wty_code;
	}
	public String getWty_name() {
		return wty_name;
	}
	public void setWty_name(String wty_name) {
		this.wty_name = wty_name;
	}

}
