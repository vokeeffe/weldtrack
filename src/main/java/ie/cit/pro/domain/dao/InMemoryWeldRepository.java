package ie.cit.pro.domain.dao;

import ie.cit.pro.domain.Weld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryWeldRepository implements WeldRepository {

	private Map<String, Weld> data = new HashMap<String, Weld>();

	public Weld findById(String id) {
		return data.get(id);
	}

	public List<Weld> getAll() {
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
