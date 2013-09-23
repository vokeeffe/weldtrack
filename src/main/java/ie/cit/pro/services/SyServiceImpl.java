package ie.cit.pro.services;

import ie.cit.pro.domain.dao.DataRepository;
import ie.cit.pro.domain.sy.SySecfield;
import ie.cit.pro.domain.sy.SySection;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class SyServiceImpl implements SyService {

	private DataRepository repo;

	// Constructor
	public SyServiceImpl(DataRepository repo) {
		this.repo = repo;
	}
	
	/***************************SY_SECFIELD***************************/
	public SySecfield getSySecfield(String id) {
	SySecfield sySecfield = new SySecfield();
	sySecfield.setId(id);
	return repo.findById(sySecfield);
	}

	public List<SySecfield> getAllSySecfields() {
	return repo.getAllSySecfields();
	}

	public SySecfield createSySecfield(SySecfield sySecfield) {
	repo.add(sySecfield);
	return sySecfield;
	}

	@Transactional
	public void deleteSySecfield(String id) {
	SySecfield sySecfield = new SySecfield();
	sySecfield.setId(id);
	sySecfield = repo.findById(sySecfield);
	if (sySecfield != null) {
		repo.delete(sySecfield);
		}
	}

	@Transactional
	public void updateSySecfield(SySecfield sySecfield) {
	if (repo.findById(sySecfield) != null) {
		repo.update(sySecfield);
	}
	}
	
	public List<SySecfield> getSySecfieldsByCode(List<SySecfield> sySecfields)
	{
		
		return repo.getSySecfieldsByCode(sySecfields);
		
	}


	/***************************SY_SECTION***************************/
	public SySection getSySection(String id) {
	SySection sySection = new SySection();
	sySection.setId(id);
	return repo.findById(sySection);
	}

	public List<SySection> getAllSySections() {
	return repo.getAllSySections();
	}

	public SySection createSySection(SySection sySection) {
	repo.add(sySection);
	return sySection;
	}

	@Transactional
	public void deleteSySection(String id) {
	SySection sySection = new SySection();
	sySection.setId(id);
	sySection = repo.findById(sySection);
	if (sySection != null) {
		repo.delete(sySection);
		}
	}

	@Transactional
	public void updateSySection(SySection sySection) {
		if (repo.findById(sySection) != null)
		{
			repo.update(sySection);
		}
	}
	
	public List<SySection> getSySectionsByCode(List<SySection> sySections){
		
		return repo.getSySectionsByCode(sySections);
		
	}



}
