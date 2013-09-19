package ie.cit.pro.sysdomain.fn;

import java.util.List;

public class FnFind {
	
	private String id;
	private List<FnFind> fnFindElements;
	private String base_entity;
	boolean omit;
	
	public boolean isOmit() {
		return omit;
	}
	public void setOmit(boolean omit) {
		this.omit = omit;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<FnFind> getFnFindElements() {
		return fnFindElements;
	}
	public void setFnFindElements(List<FnFind> fnFindElements) {
		this.fnFindElements = fnFindElements;
	}
	public String getBase_entity() {
		return base_entity;
	}
	public void setBase_entity(String base_entity) {
		this.base_entity = base_entity;
	}


}
