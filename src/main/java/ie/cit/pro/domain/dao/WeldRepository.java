package ie.cit.pro.domain.dao;

import ie.cit.pro.domain.Weld;

import java.util.List;

public interface WeldRepository {
	
	Weld findById(String id);

	List<Weld> getAll();

	void add(Weld weld);

	void delete(String weldId);

	void update(Weld weld);

}

