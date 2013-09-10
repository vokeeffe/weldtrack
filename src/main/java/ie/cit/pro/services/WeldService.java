package ie.cit.pro.services;

import java.util.List;

import ie.cit.pro.domain.fb.Weld;

public interface WeldService {

	List<Weld> getAll();
	Weld createNew(Weld weld);
	void delete(String weldId);
	Weld get(String weldId);
	void update(Weld weld);
	
	
	
}
