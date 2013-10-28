package ie.cit.pro.domain.au;

import java.util.Date;
import java.util.UUID;

public class AuGroupAuthority {

	private String id;
	private String aga_a_createdby;
	private Date  aga_a_createddate;
	private String  aga_a_modifiedby;
	private Date  aga_a_modifieddate;
	private Integer  ktn;
	private String agr_group_name;
	private String aga_authority;

	public AuGroupAuthority(){
		id = UUID.randomUUID().toString();
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAga_a_createdby() {
		return aga_a_createdby;
	}

	public void setAga_a_createdby(String aga_a_createdby) {
		this.aga_a_createdby = aga_a_createdby;
	}

	public Date getAga_a_createddate() {
		return aga_a_createddate;
	}

	public void setAga_a_createddate(Date aga_a_createddate) {
		this.aga_a_createddate = aga_a_createddate;
	}

	public String getAga_a_modifiedby() {
		return aga_a_modifiedby;
	}

	public void setAga_a_modifiedby(String aga_a_modifiedby) {
		this.aga_a_modifiedby = aga_a_modifiedby;
	}

	public Date getAga_a_modifieddate() {
		return aga_a_modifieddate;
	}

	public void setAga_a_modifieddate(Date aga_a_modifieddate) {
		this.aga_a_modifieddate = aga_a_modifieddate;
	}

	public Integer getKtn() {
		return ktn;
	}

	public void setKtn(Integer ktn) {
		this.ktn = ktn;
	}

	public String getAgr_group_name() {
		return agr_group_name;
	}

	public void setAgr_group_name(String agr_group_name) {
		this.agr_group_name = agr_group_name;
	}

	public String getAga_authority() {
		return aga_authority;
	}

	public void setAga_authority(String aga_authority) {
		this.aga_authority = aga_authority;
	}
}
