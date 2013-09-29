package ie.cit.pro.domain.sy;

import java.util.Date;
import java.util.UUID;

public class GroupAuthorities {

	private String id;
	private String gra_a_createdby;
	private Date  gra_a_createddate;
	private String  gra_a_modifiedby;
	private Date  gra_a_modifieddate;
	private Integer group_id;
	private String authority;

	public GroupAuthorities(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGra_a_createdby() {
		return gra_a_createdby;
	}

	public void setGra_a_createdby(String gra_a_createdby) {
		this.gra_a_createdby = gra_a_createdby;
	}

	public Date getGra_a_createddate() {
		return gra_a_createddate;
	}

	public void setGra_a_createddate(Date gra_a_createddate) {
		this.gra_a_createddate = gra_a_createddate;
	}

	public String getGra_a_modifiedby() {
		return gra_a_modifiedby;
	}

	public void setGra_a_modifiedby(String gra_a_modifiedby) {
		this.gra_a_modifiedby = gra_a_modifiedby;
	}

	public Date getGra_a_modifieddate() {
		return gra_a_modifieddate;
	}

	public void setGra_a_modifieddate(Date gra_a_modifieddate) {
		this.gra_a_modifieddate = gra_a_modifieddate;
	}

	public Integer getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
}
