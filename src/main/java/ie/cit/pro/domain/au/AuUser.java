package ie.cit.pro.domain.au;

import java.util.Date;
import java.util.UUID;

public class AuUser {

	private String id;
	private String aus_a_createdby;
	private Date  aus_a_createddate;
	private String  aus_a_modifiedby;
	private Date  aus_a_modifieddate;
	private Integer  ktn;
	private String aus_login;
	private String aus_password;
	private boolean aus_enabled;
	private Integer kco_prime;
	private String kco_list;
	private String aus_name;

	public AuUser(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAus_a_createdby() {
		return aus_a_createdby;
	}

	public void setAus_a_createdby(String aus_a_createdby) {
		this.aus_a_createdby = aus_a_createdby;
	}

	public Date getAus_a_createddate() {
		return aus_a_createddate;
	}

	public void setAus_a_createddate(Date aus_a_createddate) {
		this.aus_a_createddate = aus_a_createddate;
	}

	public String getAus_a_modifiedby() {
		return aus_a_modifiedby;
	}

	public void setAus_a_modifiedby(String aus_a_modifiedby) {
		this.aus_a_modifiedby = aus_a_modifiedby;
	}

	public Date getAus_a_modifieddate() {
		return aus_a_modifieddate;
	}

	public void setAus_a_modifieddate(Date aus_a_modifieddate) {
		this.aus_a_modifieddate = aus_a_modifieddate;
	}

	public Integer getKtn() {
		return ktn;
	}

	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}

	public String getAus_login() {
		return aus_login;
	}

	public void setAus_login(String aus_login) {
		this.aus_login = aus_login;
	}

	public String getAus_password() {
		return aus_password;
	}

	public void setAus_password(String aus_password) {
		this.aus_password = aus_password;
	}

	public boolean isAus_enabled() {
		return aus_enabled;
	}

	public void setAus_enabled(boolean aus_enabled) {
		this.aus_enabled = aus_enabled;
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

	public String getAus_name() {
		return aus_name;
	}

	public void setAus_name(String aus_name) {
		this.aus_name = aus_name;
	}
}
