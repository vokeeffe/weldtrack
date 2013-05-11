package ie.cit.adf.services;

import java.util.List;

import ie.cit.adf.domain.Weld;

public interface WeldService {

	List<Weld> getAllWelds();

	Weld createNewWeld(String isonum);
	
	void delete(String weldId);
	
	Weld get(String weldId);
	
	void updateWeld(String weldId);
	
}
