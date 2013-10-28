package ie.cit.pro.domain.au;

import java.util.Date;
import java.util.UUID;

public class AuGroup {

	private String id;
	private String agr_a_createdby;
	private Date  agr_a_createddate;
	private String  agr_a_modifiedby;
	private Date  agr_a_modifieddate;
	private Integer  ktn;
	private String agr_group_name;

	public AuGroup(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAgr_a_createdby() {
		return agr_a_createdby;
	}

	public void setAgr_a_createdby(String agr_a_createdby) {
		this.agr_a_createdby = agr_a_createdby;
	}

	public Date getAgr_a_createddate() {
		return agr_a_createddate;
	}

	public void setAgr_a_createddate(Date agr_a_createddate) {
		this.agr_a_createddate = agr_a_createddate;
	}

	public String getAgr_a_modifiedby() {
		return agr_a_modifiedby;
	}

	public void setAgr_a_modifiedby(String agr_a_modifiedby) {
		this.agr_a_modifiedby = agr_a_modifiedby;
	}

	public Date getAgr_a_modifieddate() {
		return agr_a_modifieddate;
	}

	public void setAgr_a_modifieddate(Date agr_a_modifieddate) {
		this.agr_a_modifieddate = agr_a_modifieddate;
	}

	public Integer getKtn() {
		return ktn;
	}

	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}

	public String getAgr_group_name() {
		return agr_group_name;
	}

	public void setAgr_group_name(String agr_group_name) {
		this.agr_group_name = agr_group_name;
	}
}
