package ie.cit.pro.domain.sy;

import java.util.Date;
import java.util.UUID;

public class SyGroups {

	private String id;
	private String grp_a_createdby;
	private Date  grp_a_createddate;
	private String  grp_a_modifiedby;
	private Date  grp_a_modifieddate;
	private String group_name;

	public SyGroups(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGrp_a_createdby() {
		return grp_a_createdby;
	}

	public void setGrp_a_createdby(String grp_a_createdby) {
		this.grp_a_createdby = grp_a_createdby;
	}

	public Date getGrp_a_createddate() {
		return grp_a_createddate;
	}

	public void setGrp_a_createddate(Date grp_a_createddate) {
		this.grp_a_createddate = grp_a_createddate;
	}

	public String getGrp_a_modifiedby() {
		return grp_a_modifiedby;
	}

	public void setGrp_a_modifiedby(String grp_a_modifiedby) {
		this.grp_a_modifiedby = grp_a_modifiedby;
	}

	public Date getGrp_a_modifieddate() {
		return grp_a_modifieddate;
	}

	public void setGrp_a_modifieddate(Date grp_a_modifieddate) {
		this.grp_a_modifieddate = grp_a_modifieddate;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	
}
