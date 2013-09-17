package ie.cit.pro.domain.fb;

import java.util.Date;
import java.util.UUID;

public class FbIsometric {
	
	private String id;
	private String iso_a_createdby;
	private Date  iso_a_createddate;
	private String  iso_a_modifiedby;
	private Date  iso_a_modifieddate;
	private Integer ktn;
	private Integer kco;
	private String con_num;
	private String job_num;
	private String iso_num;
	private Integer iso_revno;
	private String iso_revcode;
	
	public FbIsometric(){
		id = UUID.randomUUID().toString();
		}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIso_a_createdby() {
		return iso_a_createdby;
	}
	public void setIso_a_createdby(String iso_a_createdby) {
		this.iso_a_createdby = iso_a_createdby;
	}
	public Date getIso_a_createddate() {
		return iso_a_createddate;
	}
	public void setIso_a_createddate(Date iso_a_createddate) {
		this.iso_a_createddate = iso_a_createddate;
	}
	public String getIso_a_modifiedby() {
		return iso_a_modifiedby;
	}
	public void setIso_a_modifiedby(String iso_a_modifiedby) {
		this.iso_a_modifiedby = iso_a_modifiedby;
	}
	public Date getIso_a_modifieddate() {
		return iso_a_modifieddate;
	}
	public void setIso_a_modifieddate(Date iso_a_modifieddate) {
		this.iso_a_modifieddate = iso_a_modifieddate;
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
	public String getIso_num() {
		return iso_num;
	}
	public void setIso_num(String iso_num) {
		this.iso_num = iso_num;
	}
	public Integer getIso_revno() {
		return iso_revno;
	}
	public void setIso_revno(Integer iso_revno) {
		this.iso_revno = iso_revno;
	}
	public String getIso_revcode() {
		return iso_revcode;
	}
	public void setIso_revcode(String iso_revcode) {
		this.iso_revcode = iso_revcode;
	}
	
}
