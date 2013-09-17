package ie.cit.pro.services;

import ie.cit.pro.domain.dao.DataRepository;
import ie.cit.pro.domain.fb.FbWeld;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class FbServiceImpl implements FbService {

	private DataRepository repo;

	// Constructor
	public FbServiceImpl(DataRepository repo) {
		this.repo = repo;
	}
	
	// Get Weld
	public FbWeld getFbWeld(String id) {
		FbWeld fbWeld = new FbWeld();
		fbWeld.setId(id);
		return repo.findById(fbWeld);
	}

	// Get All Welds
	public List<FbWeld> getAllFbWelds() {
		return repo.getAllFbWelds();
	}

	// Create New Weld
	public FbWeld createFbWeld(FbWeld fbWeld) {
		repo.add(fbWeld);// Add the weld to the Array
		return fbWeld;
	}

	// Delete Weld
	@Transactional
	public void deleteFbWeld(String id) {
		FbWeld fbWeld = new FbWeld();
		fbWeld.setId(id);
		fbWeld = repo.findById(fbWeld);
		if (fbWeld != null) {
			repo.delete(fbWeld);
		}
	}

	// If this method was not transactional there would be 2 sessions to the DB
	@Transactional
	public void updateFbWeld(FbWeld fbWeld) {
		//System.out.println("WeldServiceImpl.updateWeld() About to update weld ID: " + weld.getId());
		FbWeld updateWeld = repo.findById(fbWeld);// Session 1 to DB (if not											// transactional)
		if (updateWeld != null) {
			repo.update(fbWeld);// Session 2 to DB (if not transactional)
		}
	}
}
