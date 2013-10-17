package ie.cit.pro.domain.sy;

import java.util.Date;
import java.util.UUID;

public class SyGroupAuthority {

	private String id;
	private String sga_a_createdby;
	private Date  sga_a_createddate;
	private String  sga_a_modifiedby;
	private Date  sga_a_modifieddate;
	private Integer  ktn;
	private String sgr_group_name;
	private String sga_authority;

	public SyGroupAuthority(){
		id = UUID.randomUUID().toString();
		}
	
	public Integer getKtn() {
		return ktn;
	}

	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSga_a_createdby() {
		return sga_a_createdby;
	}

	public void setSga_a_createdby(String sga_a_createdby) {
		this.sga_a_createdby = sga_a_createdby;
	}

	public Date getSga_a_createddate() {
		return sga_a_createddate;
	}

	public void setSga_a_createddate(Date sga_a_createddate) {
		this.sga_a_createddate = sga_a_createddate;
	}

	public String getSga_a_modifiedby() {
		return sga_a_modifiedby;
	}

	public void setSga_a_modifiedby(String sga_a_modifiedby) {
		this.sga_a_modifiedby = sga_a_modifiedby;
	}

	public Date getSga_a_modifieddate() {
		return sga_a_modifieddate;
	}

	public void setSga_a_modifieddate(Date sga_a_modifieddate) {
		this.sga_a_modifieddate = sga_a_modifieddate;
	}

	public String getSgr_group_name() {
		return sgr_group_name;
	}

	public void setSgr_group_name(String sgr_group_name) {
		this.sgr_group_name = sgr_group_name;
	}

	public String getSga_authority() {
		return sga_authority;
	}

	public void setSga_authority(String sga_authority) {
		this.sga_authority = sga_authority;
	}
}
