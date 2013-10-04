package ie.cit.pro.domain.sy;

import java.util.Date;
import java.util.UUID;

public class SyAuthority {

	private String id;
	private String sau_a_createdby;
	private Date  sau_a_createddate;
	private String  sau_a_modifiedby;
	private Date  sau_a_modifieddate;
	private String sur_login;
	private String sau_authority;

	public SyAuthority(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSau_a_createdby() {
		return sau_a_createdby;
	}

	public void setSau_a_createdby(String sau_a_createdby) {
		this.sau_a_createdby = sau_a_createdby;
	}

	public Date getSau_a_createddate() {
		return sau_a_createddate;
	}

	public void setSau_a_createddate(Date sau_a_createddate) {
		this.sau_a_createddate = sau_a_createddate;
	}

	public String getSau_a_modifiedby() {
		return sau_a_modifiedby;
	}

	public void setSau_a_modifiedby(String sau_a_modifiedby) {
		this.sau_a_modifiedby = sau_a_modifiedby;
	}

	public Date getSau_a_modifieddate() {
		return sau_a_modifieddate;
	}

	public void setSau_a_modifieddate(Date sau_a_modifieddate) {
		this.sau_a_modifieddate = sau_a_modifieddate;
	}

	public String getSur_login() {
		return sur_login;
	}

	public void setSur_login(String sur_login) {
		this.sur_login = sur_login;
	}

	public String getSau_authority() {
		return sau_authority;
	}

	public void setSau_authority(String sau_authority) {
		this.sau_authority = sau_authority;
	}
}
