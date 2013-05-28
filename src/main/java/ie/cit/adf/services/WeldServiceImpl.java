package ie.cit.adf.services;

import ie.cit.adf.domain.Weld;
import ie.cit.adf.domain.dao.WeldRepository;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class WeldServiceImpl implements WeldService {

	private WeldRepository repo;

	// Constructor
	public WeldServiceImpl(WeldRepository repo) {
		this.repo = repo;
	}

	// Get All Welds
	public List<Weld> getAllWelds() {
		// TODO Auto-generated method stub
		return repo.getAll();
	}

	// Get Weld
	public Weld get(String weldId) {

		return repo.findById(weldId);
	}

	// Create New Weld
	public Weld createNewWeld(Weld weld) {

		repo.add(weld);// Add the weld to the Array
		return weld;
	}

	// Delete Weld
	@Transactional
	public void delete(String weldId) {

		Weld weld = repo.findById(weldId);
		if (weld != null) {
			repo.delete(weldId);
		}
	}

	// If this method was not transactional there would be 2 sessions to the DB
	// (repo)
	@Transactional
	public void updateWeld(Weld weld) {
		//System.out.println("WeldServiceImpl.updateWeld() About to update weld ID: " + weld.getId());
		Weld updateWeld = repo.findById(weld.getId());// Session 1 to DB (if not
											// transactional)
		if (updateWeld != null) {
			repo.update(weld);// Session 2 to DB (if not transactional)
		}

	}

}
