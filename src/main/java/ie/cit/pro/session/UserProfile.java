package ie.cit.pro.session;

import ie.cit.pro.services.SyServiceImpl;

import java.util.Date;
import java.util.UUID;

public class UserProfile {
	
	private String login;
	private String sur_password;
	private boolean sur_enabled;
	private Integer ktn;
	private Integer kco_prime;
	private String kco_list;
	private String sur_name;

	public UserProfile(SyServiceImpl syServiceImpl){
		//syServiceImpl.
		
		}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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
