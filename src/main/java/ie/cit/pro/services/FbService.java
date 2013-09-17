package ie.cit.pro.services;

import java.util.List;

import ie.cit.pro.domain.fb.FbWeld;

public interface FbService {

	FbWeld getFbWeld(String id);
	List<FbWeld> getAllFbWelds();
	FbWeld createFbWeld(FbWeld fbWeld);
	void deleteFbWeld(String id);
	void updateFbWeld(FbWeld fbWeld);
	
}
