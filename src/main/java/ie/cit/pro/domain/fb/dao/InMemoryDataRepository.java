package ie.cit.pro.domain.fb.dao;

import ie.cit.pro.domain.fb.Weld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryDataRepository implements DataRepository {

	private Map<String, Weld> data = new HashMap<String, Weld>();

	public Weld findById(Weld weld) {
		return data.get(id);
	}

	public List<Weld> getAllWelds() {
		return new ArrayList<Weld>(data.values());
	}

	public void add(Weld weld) {
		System.out.println("About to create weld in Memory with isonum: "
				+ weld.getIsonum());
		data.put(weld.getId(), weld);
	}

	public void delete(String weldId) {
		data.remove(weldId);
	}

	public void update(Weld weld) {
		data.put(weld.getId(), weld);
	}

}
