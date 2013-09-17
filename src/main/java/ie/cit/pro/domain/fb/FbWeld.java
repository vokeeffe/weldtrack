package ie.cit.pro.domain.fb;

import java.util.Date;
import java.util.UUID;
//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "weld")
public class FbWeld {
	
	private String id;
	private String wld_a_createdby;
	private Date  wld_a_createddate;
	private String  wld_a_modifiedby;
	private Date  wld_a_modifieddate;
	private Integer ktn;
	private Integer kco;
	private String wty_code;
	private String wld_num;
	private String spl_num;
	private String iso_num;
	private String pdr_size;
	private boolean wld_fw;
	private String wdr_num;
	private Date wld_wdate;
	private String fit_fitting1;
	private String fit_fitting2;
	private String wld_heat1;
	private String wld_heat2;
	
	public FbWeld(){
		id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWld_a_createdby() {
		return wld_a_createdby;
	}

	public void setWld_a_createdby(String wld_a_createdby) {
		this.wld_a_createdby = wld_a_createdby;
	}

	public Date getWld_a_createddate() {
		return wld_a_createddate;
	}

	public void setWld_a_createddate(Date wld_a_createddate) {
		this.wld_a_createddate = wld_a_createddate;
	}

	public String getWld_a_modifiedby() {
		return wld_a_modifiedby;
	}

	public void setWld_a_modifiedby(String wld_a_modifiedby) {
		this.wld_a_modifiedby = wld_a_modifiedby;
	}

	public Date getWld_a_modifieddate() {
		return wld_a_modifieddate;
	}

	public void setWld_a_modifieddate(Date wld_a_modifieddate) {
		this.wld_a_modifieddate = wld_a_modifieddate;
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

	public String getWty_code() {
		return wty_code;
	}

	public void setWty_code(String wty_code) {
		this.wty_code = wty_code;
	}

	public String getWld_num() {
		return wld_num;
	}

	public void setWld_num(String wld_num) {
		this.wld_num = wld_num;
	}

	public String getSpl_num() {
		return spl_num;
	}

	public void setSpl_num(String spl_num) {
		this.spl_num = spl_num;
	}

	public String getIso_num() {
		return iso_num;
	}

	public void setIso_num(String iso_num) {
		this.iso_num = iso_num;
	}

	public String getPdr_size() {
		return pdr_size;
	}

	public void setPdr_size(String pdr_size) {
		this.pdr_size = pdr_size;
	}

	public boolean isWld_fw() {
		return wld_fw;
	}

	public void setWld_fw(boolean wld_fw) {
		this.wld_fw = wld_fw;
	}

	public String getWdr_num() {
		return wdr_num;
	}

	public void setWdr_num(String wdr_num) {
		this.wdr_num = wdr_num;
	}

	public Date getWld_wdate() {
		return wld_wdate;
	}

	public void setWld_wdate(Date wld_wdate) {
		this.wld_wdate = wld_wdate;
	}

	public String getFit_fitting1() {
		return fit_fitting1;
	}

	public void setFit_fitting1(String fit_fitting1) {
		this.fit_fitting1 = fit_fitting1;
	}

	public String getFit_fitting2() {
		return fit_fitting2;
	}

	public void setFit_fitting2(String fit_fitting2) {
		this.fit_fitting2 = fit_fitting2;
	}

	public String getWld_heat1() {
		return wld_heat1;
	}

	public void setWld_heat1(String wld_heat1) {
		this.wld_heat1 = wld_heat1;
	}

	public String getWld_heat2() {
		return wld_heat2;
	}

	public void setWld_heat2(String wld_heat2) {
		this.wld_heat2 = wld_heat2;
	}

}
