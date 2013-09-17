package ie.cit.pro.domain.tn;

import java.util.Date;
import java.util.UUID;

public class TnTenant {

	private String id;
	private String tnt_a_createdby;
	private Date  tnt_a_createddate;
	private String  tnt_a_modifiedby;
	private Date  tnt_a_modifieddate;
	private Integer ktn;
	private String tnt_name;
	
	public TnTenant(){
		id = UUID.randomUUID().toString();
		}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTnt_a_createdby() {
		return tnt_a_createdby;
	}
	public void setTnt_a_createdby(String tnt_a_createdby) {
		this.tnt_a_createdby = tnt_a_createdby;
	}
	public Date getTnt_a_createddate() {
		return tnt_a_createddate;
	}
	public void setTnt_a_createddate(Date tnt_a_createddate) {
		this.tnt_a_createddate = tnt_a_createddate;
	}
	public String getTnt_a_modifiedby() {
		return tnt_a_modifiedby;
	}
	public void setTnt_a_modifiedby(String tnt_a_modifiedby) {
		this.tnt_a_modifiedby = tnt_a_modifiedby;
	}
	public Date getTnt_a_modifieddate() {
		return tnt_a_modifieddate;
	}
	public void setTnt_a_modifieddate(Date tnt_a_modifieddate) {
		this.tnt_a_modifieddate = tnt_a_modifieddate;
	}
	public Integer getKtn() {
		return ktn;
	}
	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}
	public String getTnt_name() {
		return tnt_name;
	}
	public void setTnt_name(String tnt_name) {
		this.tnt_name = tnt_name;
	}
	
}
