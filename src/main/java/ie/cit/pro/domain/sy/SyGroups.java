package ie.cit.pro.domain.sy;

import java.util.Date;
import java.util.UUID;

public class SyGroups {

	private String id;
	private String sgr_a_createdby;
	private Date  sgr_a_createddate;
	private String  sgr_a_modifiedby;
	private Date  sgr_a_modifieddate;
	private String sgr_group_name;

	public SyGroups(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSgr_a_createdby() {
		return sgr_a_createdby;
	}

	public void setSgr_a_createdby(String sgr_a_createdby) {
		this.sgr_a_createdby = sgr_a_createdby;
	}

	public Date getSgr_a_createddate() {
		return sgr_a_createddate;
	}

	public void setSgr_a_createddate(Date sgr_a_createddate) {
		this.sgr_a_createddate = sgr_a_createddate;
	}

	public String getSgr_a_modifiedby() {
		return sgr_a_modifiedby;
	}

	public void setSgr_a_modifiedby(String sgr_a_modifiedby) {
		this.sgr_a_modifiedby = sgr_a_modifiedby;
	}

	public Date getSgr_a_modifieddate() {
		return sgr_a_modifieddate;
	}

	public void setSgr_a_modifieddate(Date sgr_a_modifieddate) {
		this.sgr_a_modifieddate = sgr_a_modifieddate;
	}

	public String getSgr_group_name() {
		return sgr_group_name;
	}

	public void setSgr_group_name(String sgr_group_name) {
		this.sgr_group_name = sgr_group_name;
	}
}
