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
	public Weld createNewWeld(String isonum) {

		Weld weld = new Weld();
		weld.setType("butt");
		weld.setFitting1("1"); // Pipe
		weld.setFitting2("2"); // 90 Elbow
		weld.setFw(false); // shop weld
		weld.setIsonum(isonum); // Isometric Number
		weld.setSpoolnum("1");
		weld.setWeldnum("1");
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
	public void updateWeld(String weldId) {

		Weld weld = repo.findById(weldId);// Session 1 to DB (if not
											// transactional)
		if (weld != null) {
			repo.update(weld);// Session 2 to DB (if not transactional)
		}

	}

}
