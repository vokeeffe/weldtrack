package ie.cit.adf.domain.dao;

import ie.cit.adf.domain.Weld;

import java.util.List;

public interface WeldRepository {
	
	Weld findById(String id);

	List<Weld> getAll();

	void add(Weld weld);

	void delete(String weldId);

	void update(Weld weld);

}

