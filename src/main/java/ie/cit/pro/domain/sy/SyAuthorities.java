package ie.cit.pro.domain.sy;

import java.util.Date;
import java.util.UUID;

public class SyAuthorities {

	private String id;
	private String aut_a_createdby;
	private Date  aut_a_createddate;
	private String  aut_a_modifiedby;
	private Date  aut_a_modifieddate;
	private String username;
	private String authority;

	public SyAuthorities(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAut_a_createdby() {
		return aut_a_createdby;
	}

	public void setAut_a_createdby(String aut_a_createdby) {
		this.aut_a_createdby = aut_a_createdby;
	}

	public Date getAut_a_createddate() {
		return aut_a_createddate;
	}

	public void setAut_a_createddate(Date aut_a_createddate) {
		this.aut_a_createddate = aut_a_createddate;
	}

	public String getAut_a_modifiedby() {
		return aut_a_modifiedby;
	}

	public void setAut_a_modifiedby(String aut_a_modifiedby) {
		this.aut_a_modifiedby = aut_a_modifiedby;
	}

	public Date getAut_a_modifieddate() {
		return aut_a_modifieddate;
	}

	public void setAut_a_modifieddate(Date aut_a_modifieddate) {
		this.aut_a_modifieddate = aut_a_modifieddate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
}
