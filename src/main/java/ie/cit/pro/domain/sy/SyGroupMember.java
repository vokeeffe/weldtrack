package ie.cit.pro.domain.sy;

import java.util.Date;
import java.util.UUID;

public class SyGroupMember {

	private String id;
	private String sgm_a_createdby;
	private Date  sgm_a_createddate;
	private String  sgm_a_modifiedby;
	private Date  sgm_a_modifieddate;
	private Integer  ktn;
	private String sur_login;
	private String sgr_group_name;

	public SyGroupMember(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSgm_a_createdby() {
		return sgm_a_createdby;
	}

	public void setSgm_a_createdby(String sgm_a_createdby) {
		this.sgm_a_createdby = sgm_a_createdby;
	}

	public Date getSgm_a_createddate() {
		return sgm_a_createddate;
	}

	public void setSgm_a_createddate(Date sgm_a_createddate) {
		this.sgm_a_createddate = sgm_a_createddate;
	}

	public String getSgm_a_modifiedby() {
		return sgm_a_modifiedby;
	}

	public void setSgm_a_modifiedby(String sgm_a_modifiedby) {
		this.sgm_a_modifiedby = sgm_a_modifiedby;
	}

	public Date getSgm_a_modifieddate() {
		return sgm_a_modifieddate;
	}

	public void setSgm_a_modifieddate(Date sgm_a_modifieddate) {
		this.sgm_a_modifieddate = sgm_a_modifieddate;
	}

	public Integer getKtn() {
		return ktn;
	}

	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}

	public String getSur_login() {
		return sur_login;
	}

	public void setSur_login(String sur_login) {
		this.sur_login = sur_login;
	}

	public String getSgr_group_name() {
		return sgr_group_name;
	}

	public void setSgr_group_name(String sgr_group_name) {
		this.sgr_group_name = sgr_group_name;
	}


}
