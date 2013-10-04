package ie.cit.pro.domain.sy;

import java.util.Date;
import java.util.UUID;

public class SyUser {

	private String id;
	private String sus_a_createdby;
	private Date  sus_a_createddate;
	private String  sus_a_modifiedby;
	private Date  sus_a_modifieddate;
	private String sur_login;
	private String sur_password;
	private boolean sur_enabled;
	private Integer ktn;
	private Integer kco_prime;
	private String kco_list;
	private String sur_name;

	public SyUser(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSus_a_createdby() {
		return sus_a_createdby;
	}

	public void setSus_a_createdby(String sus_a_createdby) {
		this.sus_a_createdby = sus_a_createdby;
	}

	public Date getSus_a_createddate() {
		return sus_a_createddate;
	}

	public void setSus_a_createddate(Date sus_a_createddate) {
		this.sus_a_createddate = sus_a_createddate;
	}

	public String getSus_a_modifiedby() {
		return sus_a_modifiedby;
	}

	public void setSus_a_modifiedby(String sus_a_modifiedby) {
		this.sus_a_modifiedby = sus_a_modifiedby;
	}

	public Date getSus_a_modifieddate() {
		return sus_a_modifieddate;
	}

	public void setSus_a_modifieddate(Date sus_a_modifieddate) {
		this.sus_a_modifieddate = sus_a_modifieddate;
	}

	public String getSur_login() {
		return sur_login;
	}

	public void setSur_login(String sur_login) {
		this.sur_login = sur_login;
	}

	public String getSur_password() {
		return sur_password;
	}

	public void setSur_password(String sur_password) {
		this.sur_password = sur_password;
	}

	public boolean isSur_enabled() {
		return sur_enabled;
	}

	public void setSur_enabled(boolean sur_enabled) {
		this.sur_enabled = sur_enabled;
	}

	public Integer getKtn() {
		return ktn;
	}

	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}

	public Integer getKco_prime() {
		return kco_prime;
	}

	public void setKco_prime(Integer kco_prime) {
		this.kco_prime = kco_prime;
	}

	public String getKco_list() {
		return kco_list;
	}

	public void setKco_list(String kco_list) {
		this.kco_list = kco_list;
	}

	public String getSur_name() {
		return sur_name;
	}

	public void setSur_name(String sur_name) {
		this.sur_name = sur_name;
	}
}
