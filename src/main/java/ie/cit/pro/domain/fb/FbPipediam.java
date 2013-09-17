package ie.cit.pro.domain.fb;

import java.util.Date;
import java.util.UUID;

public class FbPipediam {

	private String id;
	private String pdr_a_createdby;
	private Date  pdr_a_createddate;
	private String  pdr_a_modifiedby;
	private Date  pdr_a_modifieddate;
	private Integer ktn;
	private String pdr_size;
	private String pdr_desc;
	private Double pdr_nb;
	
	public FbPipediam(){
		id = UUID.randomUUID().toString();
		}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPdr_a_createdby() {
		return pdr_a_createdby;
	}
	public void setPdr_a_createdby(String pdr_a_createdby) {
		this.pdr_a_createdby = pdr_a_createdby;
	}
	public Date getPdr_a_createddate() {
		return pdr_a_createddate;
	}
	public void setPdr_a_createddate(Date pdr_a_createddate) {
		this.pdr_a_createddate = pdr_a_createddate;
	}
	public String getPdr_a_modifiedby() {
		return pdr_a_modifiedby;
	}
	public void setPdr_a_modifiedby(String pdr_a_modifiedby) {
		this.pdr_a_modifiedby = pdr_a_modifiedby;
	}
	public Date getPdr_a_modifieddate() {
		return pdr_a_modifieddate;
	}
	public void setPdr_a_modifieddate(Date pdr_a_modifieddate) {
		this.pdr_a_modifieddate = pdr_a_modifieddate;
	}
	public Integer getKtn() {
		return ktn;
	}
	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}
	public String getPdr_size() {
		return pdr_size;
	}
	public void setPdr_size(String pdr_size) {
		this.pdr_size = pdr_size;
	}
	public String getPdr_desc() {
		return pdr_desc;
	}
	public void setPdr_desc(String pdr_desc) {
		this.pdr_desc = pdr_desc;
	}
	public Double getPdr_nb() {
		return pdr_nb;
	}
	public void setPdr_nb(Double pdr_nb) {
		this.pdr_nb = pdr_nb;
	}
	
}
