package ie.cit.adf.domain;

import java.util.Date;
import java.util.UUID;
//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "weld")
public class Weld {
	
	private String id;
	private String weld_type; //weld type, e.g. butt, socket, etc...
	private String weldnum; //weld number
	private String spoolnum; //spool number
	private String isonum; //isometric number
	private int size; //pipe diameter in mm
	private boolean fw; //indicates if the weld is a field weld
	private String weldernum;//the code that identifies the welder who welded the pipe
	private Date date_welded;
	private String fitting1;
	private String fitting2;
	
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
		return weld_type;
	}
	public void setType(String type) {
		this.weld_type = type;
	}
	public String getWeldnum() {
		return weldnum;
	}
	public void setWeldnum(String weldnum) {
		this.weldnum = weldnum;
	}
	public String getSpoolnum() {
		return spoolnum;
	}
	public void setSpoolnum(String spoolnum) {
		this.spoolnum = spoolnum;
	}
	public String getIsonum() {
		return isonum;
	}
	public void setIsonum(String isonum) {
		this.isonum = isonum;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isFw() {
		return fw;
	}
	public void setFw(boolean fw) {
		this.fw = fw;
	}
	public String getWeldernum() {
		return weldernum;
	}
	public void setWeldernum(String weldernum) {
		this.weldernum = weldernum;
	}
	public Date getDate_welded() {
		return date_welded;
	}
	public void setDate_welded(Date date_welded) {
		this.date_welded = date_welded;
	}
	public String getFitting1() {
		return fitting1;
	}
	public void setFitting1(String fitting1) {
		this.fitting1 = fitting1;
	}
	public String getFitting2() {
		return fitting2;
	}
	public void setFitting2(String fitting2) {
		this.fitting2 = fitting2;
	}
}
