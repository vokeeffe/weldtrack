package ie.cit.pro.domain.sy;

import java.util.Date;
import java.util.UUID;

public class Users {

	private String id;
	private String usr_a_createdby;
	private Date  usr_a_createddate;
	private String  usr_a_modifiedby;
	private Date  usr_a_modifieddate;
	private String username;
	private String password;
	private boolean enabled;

	public Users(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsr_a_createdby() {
		return usr_a_createdby;
	}

	public void setUsr_a_createdby(String usr_a_createdby) {
		this.usr_a_createdby = usr_a_createdby;
	}

	public Date getUsr_a_createddate() {
		return usr_a_createddate;
	}

	public void setUsr_a_createddate(Date usr_a_createddate) {
		this.usr_a_createddate = usr_a_createddate;
	}

	public String getUsr_a_modifiedby() {
		return usr_a_modifiedby;
	}

	public void setUsr_a_modifiedby(String usr_a_modifiedby) {
		this.usr_a_modifiedby = usr_a_modifiedby;
	}

	public Date getUsr_a_modifieddate() {
		return usr_a_modifieddate;
	}

	public void setUsr_a_modifieddate(Date usr_a_modifieddate) {
		this.usr_a_modifieddate = usr_a_modifieddate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
