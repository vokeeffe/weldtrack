package ie.cit.pro.services;

import ie.cit.pro.domain.dao.DataRepository;
import ie.cit.pro.domain.fb.FbFitting;
import ie.cit.pro.domain.fb.FbIsometric;
import ie.cit.pro.domain.fb.FbPipediam;
import ie.cit.pro.domain.fb.FbSpool;
import ie.cit.pro.domain.fb.FbWeld;
import ie.cit.pro.domain.fb.FbWeldType;
import ie.cit.pro.domain.fb.FbWelder;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class FbServiceImpl implements FbService {

	private DataRepository repo;

	// Constructor
	public FbServiceImpl(DataRepository repo) {
		this.repo = repo;
	}
	
	/***************************FB_WELDTYPE***************************/
	public FbWeldType getFbWeldType(String id) {
	FbWeldType fbWeldType = new FbWeldType();
	fbWeldType.setId(id);
	return repo.findById(fbWeldType);
	}

	public List<FbWeldType> getAllFbWeldTypes() {
	return repo.getAllFbWeldTypes();
	}

	public FbWeldType createFbWeldType(FbWeldType fbWeldType) {
	repo.add(fbWeldType);
	return fbWeldType;
	}

	@Transactional
	public void deleteFbWeldType(String id) {
	FbWeldType fbWeldType = new FbWeldType();
	fbWeldType.setId(id);
	fbWeldType = repo.findById(fbWeldType);
	if (fbWeldType != null) {
		repo.delete(fbWeldType);
		}
	}

	@Transactional
	public void updateFbWeldType(FbWeldType fbWeldType) {
	if (repo.findById(fbWeldType) != null) {
		repo.update(fbWeldType);
	}
	}


	/***************************FB_WELD***************************/
	public FbWeld getFbWeld(String id) {
	FbWeld fbWeld = new FbWeld();
	fbWeld.setId(id);
	return repo.findById(fbWeld);
	}

	public List<FbWeld> getAllFbWelds() {
	return repo.getAllFbWelds();
	}

	public FbWeld createFbWeld(FbWeld fbWeld) {
	repo.add(fbWeld);
	return fbWeld;
	}

	@Transactional
	public void deleteFbWeld(String id) {
	FbWeld fbWeld = new FbWeld();
	fbWeld.setId(id);
	fbWeld = repo.findById(fbWeld);
	if (fbWeld != null) {
		repo.delete(fbWeld);
		}
	}

	@Transactional
	public void updateFbWeld(FbWeld fbWeld) {
	if (repo.findById(fbWeld) != null) {
		repo.update(fbWeld);
	}
	}


	/***************************FB_WELDER***************************/
	public FbWelder getFbWelder(String id) {
	FbWelder fbWelder = new FbWelder();
	fbWelder.setId(id);
	return repo.findById(fbWelder);
	}

	public List<FbWelder> getAllFbWelders() {
	return repo.getAllFbWelders();
	}

	public FbWelder createFbWelder(FbWelder fbWelder) {
	repo.add(fbWelder);
	return fbWelder;
	}

	@Transactional
	public void deleteFbWelder(String id) {
	FbWelder fbWelder = new FbWelder();
	fbWelder.setId(id);
	fbWelder = repo.findById(fbWelder);
	if (fbWelder != null) {
		repo.delete(fbWelder);
		}
	}

	@Transactional
	public void updateFbWelder(FbWelder fbWelder) {
	if (repo.findById(fbWelder) != null) {
		repo.update(fbWelder);
	}
	}


	/***************************FB_ISOMETRIC***************************/
	public FbIsometric getFbIsometric(String id) {
	FbIsometric fbIsometric = new FbIsometric();
	fbIsometric.setId(id);
	return repo.findById(fbIsometric);
	}

	public List<FbIsometric> getAllFbIsometrics() {
	return repo.getAllFbIsometrics();
	}

	public FbIsometric createFbIsometric(FbIsometric fbIsometric) {
	repo.add(fbIsometric);
	return fbIsometric;
	}

	@Transactional
	public void deleteFbIsometric(String id) {
	FbIsometric fbIsometric = new FbIsometric();
	fbIsometric.setId(id);
	fbIsometric = repo.findById(fbIsometric);
	if (fbIsometric != null) {
		repo.delete(fbIsometric);
		}
	}

	@Transactional
	public void updateFbIsometric(FbIsometric fbIsometric) {
	if (repo.findById(fbIsometric) != null) {
		repo.update(fbIsometric);
	}
	}


	/***************************FB_SPOOL***************************/
	public FbSpool getFbSpool(String id) {
	FbSpool fbSpool = new FbSpool();
	fbSpool.setId(id);
	return repo.findById(fbSpool);
	}

	public List<FbSpool> getAllFbSpools() {
	return repo.getAllFbSpools();
	}

	public FbSpool createFbSpool(FbSpool fbSpool) {
	repo.add(fbSpool);
	return fbSpool;
	}

	@Transactional
	public void deleteFbSpool(String id) {
	FbSpool fbSpool = new FbSpool();
	fbSpool.setId(id);
	fbSpool = repo.findById(fbSpool);
	if (fbSpool != null) {
		repo.delete(fbSpool);
		}
	}

	@Transactional
	public void updateFbSpool(FbSpool fbSpool) {
	if (repo.findById(fbSpool) != null) {
		repo.update(fbSpool);
	}
	}


	/***************************FB_PIPEDIAM***************************/
	public FbPipediam getFbPipediam(String id) {
	FbPipediam fbPipediam = new FbPipediam();
	fbPipediam.setId(id);
	return repo.findById(fbPipediam);
	}

	public List<FbPipediam> getAllFbPipediams() {
	return repo.getAllFbPipediams();
	}

	public FbPipediam createFbPipediam(FbPipediam fbPipediam) {
	repo.add(fbPipediam);
	return fbPipediam;
	}

	@Transactional
	public void deleteFbPipediam(String id) {
	FbPipediam fbPipediam = new FbPipediam();
	fbPipediam.setId(id);
	fbPipediam = repo.findById(fbPipediam);
	if (fbPipediam != null) {
		repo.delete(fbPipediam);
		}
	}

	@Transactional
	public void updateFbPipediam(FbPipediam fbPipediam) {
	if (repo.findById(fbPipediam) != null) {
		repo.update(fbPipediam);
	}
	}


	/***************************FB_FITTING***************************/
	public FbFitting getFbFitting(String id) {
	FbFitting fbFitting = new FbFitting();
	fbFitting.setId(id);
	return repo.findById(fbFitting);
	}

	public List<FbFitting> getAllFbFittings() {
	return repo.getAllFbFittings();
	}

	public FbFitting createFbFitting(FbFitting fbFitting) {
	repo.add(fbFitting);
	return fbFitting;
	}

	@Transactional
	public void deleteFbFitting(String id) {
	FbFitting fbFitting = new FbFitting();
	fbFitting.setId(id);
	fbFitting = repo.findById(fbFitting);
	if (fbFitting != null) {
		repo.delete(fbFitting);
		}
	}

	@Transactional
	public void updateFbFitting(FbFitting fbFitting) {
	if (repo.findById(fbFitting) != null) {
		repo.update(fbFitting);
	}
	}


}
