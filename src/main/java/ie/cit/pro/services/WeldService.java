package ie.cit.pro.services;

import java.util.List;

import ie.cit.pro.domain.Weld;

public interface WeldService {

	List<Weld> getAllWelds();

	Weld createNewWeld(Weld weld);
	
	void delete(String weldId);
	
	Weld get(String weldId);
	
	void updateWeld(Weld weld);
	
}
