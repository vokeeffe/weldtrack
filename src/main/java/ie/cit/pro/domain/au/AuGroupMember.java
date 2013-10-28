package ie.cit.pro.domain.au;

import java.util.Date;
import java.util.UUID;

public class AuGroupMember {

	private String id;
	private String agm_a_createdby;
	private Date  agm_a_createddate;
	private String  agm_a_modifiedby;
	private Date  agm_a_modifieddate;
	private Integer  ktn;
	private String aus_login;
	private String agr_group_name;

	public AuGroupMember(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAgm_a_createdby() {
		return agm_a_createdby;
	}

	public void setAgm_a_createdby(String agm_a_createdby) {
		this.agm_a_createdby = agm_a_createdby;
	}

	public Date getAgm_a_createddate() {
		return agm_a_createddate;
	}

	public void setAgm_a_createddate(Date agm_a_createddate) {
		this.agm_a_createddate = agm_a_createddate;
	}

	public String getAgm_a_modifiedby() {
		return agm_a_modifiedby;
	}

	public void setAgm_a_modifiedby(String agm_a_modifiedby) {
		this.agm_a_modifiedby = agm_a_modifiedby;
	}

	public Date getAgm_a_modifieddate() {
		return agm_a_modifieddate;
	}

	public void setAgm_a_modifieddate(Date agm_a_modifieddate) {
		this.agm_a_modifieddate = agm_a_modifieddate;
	}

	public Integer getKtn() {
		return ktn;
	}

	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}

	public String getAus_login() {
		return aus_login;
	}

	public void setAus_login(String aus_login) {
		this.aus_login = aus_login;
	}

	public String getAgr_group_name() {
		return agr_group_name;
	}

	public void setAgr_group_name(String agr_group_name) {
		this.agr_group_name = agr_group_name;
	}
	
}
