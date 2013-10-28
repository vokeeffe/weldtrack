package ie.cit.pro.domain.au;

import java.util.Date;
import java.util.UUID;

public class AuAuthority {

	private String id;
	private String aau_a_createdby;
	private Date  aau_a_createddate;
	private String  aau_a_modifiedby;
	private Date  aau_a_modifieddate;
	private Integer  ktn;
	private String aus_login;
	private String aau_authority;

	public AuAuthority(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAau_a_createdby() {
		return aau_a_createdby;
	}

	public void setAau_a_createdby(String aau_a_createdby) {
		this.aau_a_createdby = aau_a_createdby;
	}

	public Date getAau_a_createddate() {
		return aau_a_createddate;
	}

	public void setAau_a_createddate(Date aau_a_createddate) {
		this.aau_a_createddate = aau_a_createddate;
	}

	public String getAau_a_modifiedby() {
		return aau_a_modifiedby;
	}

	public void setAau_a_modifiedby(String aau_a_modifiedby) {
		this.aau_a_modifiedby = aau_a_modifiedby;
	}

	public Date getAau_a_modifieddate() {
		return aau_a_modifieddate;
	}

	public void setAau_a_modifieddate(Date aau_a_modifieddate) {
		this.aau_a_modifieddate = aau_a_modifieddate;
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

	public String getAau_authority() {
		return aau_authority;
	}

	public void setAau_authority(String aau_authority) {
		this.aau_authority = aau_authority;
	}
}
