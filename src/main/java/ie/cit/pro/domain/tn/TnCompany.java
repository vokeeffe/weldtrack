package ie.cit.pro.domain.tn;

import java.util.Date;
import java.util.UUID;

public class TnCompany {

	private String id;
	private String tco_a_createdby;
	private Date  tco_a_createddate;
	private String  tco_a_modifiedby;
	private Date  tco_a_modifieddate;
	private Integer ktn;
	private Integer kco;
	private String tco_name;
	
	public TnCompany(){
		id = UUID.randomUUID().toString();
		}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTco_a_createdby() {
		return tco_a_createdby;
	}
	public void setTco_a_createdby(String tco_a_createdby) {
		this.tco_a_createdby = tco_a_createdby;
	}
	public Date getTco_a_createddate() {
		return tco_a_createddate;
	}
	public void setTco_a_createddate(Date tco_a_createddate) {
		this.tco_a_createddate = tco_a_createddate;
	}
	public String getTco_a_modifiedby() {
		return tco_a_modifiedby;
	}
	public void setTco_a_modifiedby(String tco_a_modifiedby) {
		this.tco_a_modifiedby = tco_a_modifiedby;
	}
	public Date getTco_a_modifieddate() {
		return tco_a_modifieddate;
	}
	public void setTco_a_modifieddate(Date tco_a_modifieddate) {
		this.tco_a_modifieddate = tco_a_modifieddate;
	}
	public Integer getKtn() {
		return ktn;
	}
	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}
	public Integer getKco() {
		return kco;
	}
	public void setKco(Integer kco) {
		this.kco = kco;
	}
	public String getTco_name() {
		return tco_name;
	}
	public void setTco_name(String tco_name) {
		this.tco_name = tco_name;
	}
	
}
