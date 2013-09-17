package ie.cit.pro.domain.fb;

import java.util.Date;
import java.util.UUID;

public class FbWelder {

	private String id;
	private String wdr_a_createdby;
	private Date  wdr_a_createddate;
	private String  wdr_a_modifiedby;
	private Date  wdr_a_modifieddate;
	private Integer ktn;
	private Integer kco;
	private String wdr_num;
	private String wdr_name;
	private String wdr_status;
	private boolean wdr_active;
	
	public FbWelder(){
		id = UUID.randomUUID().toString();
		}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWdr_a_createdby() {
		return wdr_a_createdby;
	}
	public void setWdr_a_createdby(String wdr_a_createdby) {
		this.wdr_a_createdby = wdr_a_createdby;
	}
	public Date getWdr_a_createddate() {
		return wdr_a_createddate;
	}
	public void setWdr_a_createddate(Date wdr_a_createddate) {
		this.wdr_a_createddate = wdr_a_createddate;
	}
	public String getWdr_a_modifiedby() {
		return wdr_a_modifiedby;
	}
	public void setWdr_a_modifiedby(String wdr_a_modifiedby) {
		this.wdr_a_modifiedby = wdr_a_modifiedby;
	}
	public Date getWdr_a_modifieddate() {
		return wdr_a_modifieddate;
	}
	public void setWdr_a_modifieddate(Date wdr_a_modifieddate) {
		this.wdr_a_modifieddate = wdr_a_modifieddate;
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
	public String getWdr_num() {
		return wdr_num;
	}
	public void setWdr_num(String wdr_num) {
		this.wdr_num = wdr_num;
	}
	public String getWdr_name() {
		return wdr_name;
	}
	public void setWdr_name(String wdr_name) {
		this.wdr_name = wdr_name;
	}
	public String getWdr_status() {
		return wdr_status;
	}
	public void setWdr_status(String wdr_status) {
		this.wdr_status = wdr_status;
	}
	public boolean isWdr_active() {
		return wdr_active;
	}
	public void setWdr_active(boolean wdr_active) {
		this.wdr_active = wdr_active;
	}
	
}
