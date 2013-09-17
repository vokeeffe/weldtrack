package ie.cit.pro.domain.cj;

import java.util.Date;
import java.util.UUID;

public class CjJob {

	private String id;
	private String job_a_createdby;
	private Date  job_a_createddate;
	private String  job_a_modifiedby;
	private Date  job_a_modifieddate;
	private Integer ktn;
	private Integer kco;
	private String con_num;
	private String job_num;
	private String job_name;
	
	public CjJob(){
		id = UUID.randomUUID().toString();
		}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJob_a_createdby() {
		return job_a_createdby;
	}
	public void setJob_a_createdby(String job_a_createdby) {
		this.job_a_createdby = job_a_createdby;
	}
	public Date getJob_a_createddate() {
		return job_a_createddate;
	}
	public void setJob_a_createddate(Date job_a_createddate) {
		this.job_a_createddate = job_a_createddate;
	}
	public String getJob_a_modifiedby() {
		return job_a_modifiedby;
	}
	public void setJob_a_modifiedby(String job_a_modifiedby) {
		this.job_a_modifiedby = job_a_modifiedby;
	}
	public Date getJob_a_modifieddate() {
		return job_a_modifieddate;
	}
	public void setJob_a_modifieddate(Date job_a_modifieddate) {
		this.job_a_modifieddate = job_a_modifieddate;
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
	public String getJob_num() {
		return job_num;
	}
	public void setJob_num(String job_num) {
		this.job_num = job_num;
	}
	public String getJob_name() {
		return job_name;
	}
	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}
	
}
