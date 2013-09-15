package ie.cit.pro.domain.dao;

import ie.cit.pro.domain.fb.Weld;
import ie.cit.pro.domain.sy.SySecfield;
import ie.cit.pro.domain.sy.SySection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryDataRepository implements DataRepository {

	private Map<String, Weld> data = new HashMap<String, Weld>();

	public Weld findById(Weld weld) {
		return data.get(weld.getId());
	}

	public List<Weld> getAllWelds() {
		return new ArrayList<Weld>(data.values());
	}

	public void add(Weld weld) {
		System.out.println("About to create weld in Memory with isonum: "
				+ weld.getIsonum());
		data.put(weld.getId(), weld);
	}

	public void delete(Weld weld) {
		data.remove(weld.getId());
	}

	public void update(Weld weld) {
		data.put(weld.getId(), weld);
	}
	
	SySecfield findById(SySecfield sySecfield);
	void add(SySecfield sySecfield);
	void update(SySecfield sySecfield);
	
	SySection findById(SySection sySection);
	void add(SySection sySection);
	void update(SySection sySection);

}
