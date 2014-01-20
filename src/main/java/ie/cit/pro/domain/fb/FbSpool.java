package ie.cit.pro.domain.fb;

import java.util.Date;
import java.util.UUID;

public class FbSpool  extends FbDomainObject{

	private String id;
	private String spl_a_createdby;
	private Date  spl_a_createddate;
	private String  spl_a_modifiedby;
	private Date  spl_a_modifieddate;
	private Integer ktn;
	private Integer kco;
	private String iso_num;
	private String spl_num;
	
	public FbSpool(){
		id = UUID.randomUUID().toString();
		}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSpl_a_createdby() {
		return spl_a_createdby;
	}
	public void setSpl_a_createdby(String spl_a_createdby) {
		this.spl_a_createdby = spl_a_createdby;
	}
	public Date getSpl_a_createddate() {
		return spl_a_createddate;
	}
	public void setSpl_a_createddate(Date spl_a_createddate) {
		this.spl_a_createddate = spl_a_createddate;
	}
	public String getSpl_a_modifiedby() {
		return spl_a_modifiedby;
	}
	public void setSpl_a_modifiedby(String spl_a_modifiedby) {
		this.spl_a_modifiedby = spl_a_modifiedby;
	}
	public Date getSpl_a_modifieddate() {
		return spl_a_modifieddate;
	}
	public void setSpl_a_modifieddate(Date spl_a_modifieddate) {
		this.spl_a_modifieddate = spl_a_modifieddate;
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
	public String getIso_num() {
		return iso_num;
	}
	public void setIso_num(String iso_num) {
		this.iso_num = iso_num;
	}
	public String getSpl_num() {
		return spl_num;
	}
	public void setSpl_num(String spl_num) {
		this.spl_num = spl_num;
	}
	
}
