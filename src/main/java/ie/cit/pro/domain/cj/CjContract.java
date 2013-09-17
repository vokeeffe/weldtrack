package ie.cit.pro.domain.cj;

import java.util.Date;
import java.util.UUID;

public class CjContract {

	private String id;
	private String con_a_createdby;
	private Date  con_a_createddate;
	private String  con_a_modifiedby;
	private Date  con_a_modifieddate;
	private Integer ktn;
	private Integer kco;
	private String con_num;
	private String con_name;
	
	public CjContract(){
		id = UUID.randomUUID().toString();
		}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCon_a_createdby() {
		return con_a_createdby;
	}
	public void setCon_a_createdby(String con_a_createdby) {
		this.con_a_createdby = con_a_createdby;
	}
	public Date getCon_a_createddate() {
		return con_a_createddate;
	}
	public void setCon_a_createddate(Date con_a_createddate) {
		this.con_a_createddate = con_a_createddate;
	}
	public String getCon_a_modifiedby() {
		return con_a_modifiedby;
	}
	public void setCon_a_modifiedby(String con_a_modifiedby) {
		this.con_a_modifiedby = con_a_modifiedby;
	}
	public Date getCon_a_modifieddate() {
		return con_a_modifieddate;
	}
	public void setCon_a_modifieddate(Date con_a_modifieddate) {
		this.con_a_modifieddate = con_a_modifieddate;
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
	public String getCon_num() {
		return con_num;
	}
	public void setCon_num(String con_num) {
		this.con_num = con_num;
	}
	public String getCon_name() {
		return con_name;
	}
	public void setCon_name(String con_name) {
		this.con_name = con_name;
	}
	
}
