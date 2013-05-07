package ie.cit.adf.services;

import java.util.List;

import ie.cit.adf.domain.Weld;

public interface WeldService {

	List<Weld> getAllWelds();

	void createNewWeld(String isonum);
	
}
