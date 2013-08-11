package ie.cit.pro.domain;

import java.util.Date;
import java.util.UUID;
//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "weld")
public class Weld {
	
	private String id;
	private Integer ktn;
	private Integer kco;
	private String wty_code;
	private String wld_num; //weld number
	private String spl_num; //spool number
	private String iso_num; //isometric number
	private String pdr_size; //pipe diameter in mm
	private boolean wld_fw; //indicates if the weld is a field weld
	private String wdr_num;//the code that identifies the welder who welded the pipe
	private Date wld_wdate;
	private String fit_fitting1;
	private String fit_fitting2;
	private String wld_heat1;
	private String wld_heat2;
	
	public Weld(){
		id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getType() {
		return wty_code;
	}
	public void setType(String type) {
		this.wty_code = type;
	}
	public String getWeldnum() {
		return wld_num;
	}
	public void setWeldnum(String weldnum) {
		this.wld_num = weldnum;
	}
	public String getSpoolnum() {
		return spl_num;
	}
	public void setSpoolnum(String spoolnum) {
		this.spl_num = spoolnum;
	}
	public String getIsonum() {
		return iso_num;
	}
	public void setIsonum(String isonum) {
		this.iso_num = isonum;
	}
	public String getSize() {
		return pdr_size;
	}
	public void setSize(String size) {
		this.pdr_size = size;
	}
	public boolean isFw() {
		return wld_fw;
	}
	public void setFw(boolean fw) {
		this.wld_fw = fw;
	}
	public String getWeldernum() {
		return wdr_num;
	}
	public void setWeldernum(String weldernum) {
		this.wdr_num = weldernum;
	}
	public Date getDate_welded() {
		return wld_wdate;
	}
	public void setDate_welded(Date date_welded) {
		this.wld_wdate = date_welded;
	}
	public String getFitting1() {
		return fit_fitting1;
	}
	public void setFitting1(String fitting1) {
		this.fit_fitting1 = fitting1;
	}
	public String getFitting2() {
		return fit_fitting2;
	}
	public void setFitting2(String fitting2) {
		this.fit_fitting2 = fitting2;
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
