package ie.cit.pro.domain.sy;

import java.util.Date;
import java.util.UUID;

public class GroupMembers {

	private String id;
	private String grm_a_createdby;
	private Date  grm_a_createddate;
	private String  grm_a_modifiedby;
	private Date  grm_a_modifieddate;
	private String username;
	private Integer group_id;

	public GroupMembers(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGrm_a_createdby() {
		return grm_a_createdby;
	}

	public void setGrm_a_createdby(String grm_a_createdby) {
		this.grm_a_createdby = grm_a_createdby;
	}

	public Date getGrm_a_createddate() {
		return grm_a_createddate;
	}

	public void setGrm_a_createddate(Date grm_a_createddate) {
		this.grm_a_createddate = grm_a_createddate;
	}

	public String getGrm_a_modifiedby() {
		return grm_a_modifiedby;
	}

	public void setGrm_a_modifiedby(String grm_a_modifiedby) {
		this.grm_a_modifiedby = grm_a_modifiedby;
	}

	public Date getGrm_a_modifieddate() {
		return grm_a_modifieddate;
	}

	public void setGrm_a_modifieddate(Date grm_a_modifieddate) {
		this.grm_a_modifieddate = grm_a_modifieddate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}
	
}
