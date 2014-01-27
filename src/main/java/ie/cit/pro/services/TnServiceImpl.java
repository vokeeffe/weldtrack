package ie.cit.pro.services;

import ie.cit.pro.domain.dao.DataRepository;
import ie.cit.pro.domain.tn.TnCompany;
import ie.cit.pro.domain.tn.TnTenant;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class TnServiceImpl implements TnService {

	private DataRepository repo;

	// Constructor
	public TnServiceImpl(DataRepository repo) {
		this.repo = repo;
	}
	
	public TnServiceImpl() {
		
	}
	
	public DataRepository getRepo() {
		return repo;
	}

	public void setRepo(DataRepository repo) {
		this.repo = repo;
	}

	/***************************TN_TENANT***************************/
	public TnTenant getTnTenant(String id) {
	TnTenant tnTenant = new TnTenant();
	tnTenant.setId(id);
	return repo.findById(tnTenant);
	}

	public List<TnTenant> getAllTnTenants() {
	return repo.getAllTnTenants();
	}

	public TnTenant createTnTenant(TnTenant tnTenant) {
	repo.add(tnTenant);
	return tnTenant;
	}

	@Transactional
	public void deleteTnTenant(String id) {
	TnTenant tnTenant = new TnTenant();
	tnTenant.setId(id);
	tnTenant = repo.findById(tnTenant);
	if (tnTenant != null) {
		repo.delete(tnTenant);
		}
	}

	@Transactional
	public void updateTnTenant(TnTenant tnTenant) {
	if (repo.findById(tnTenant) != null) {
		repo.update(tnTenant);
	}
	}


	/***************************TN_COMPANY***************************/
	public TnCompany getTnCompany(String id) {
	TnCompany tnCompany = new TnCompany();
	tnCompany.setId(id);
	return repo.findById(tnCompany);
	}

	public List<TnCompany> getAllTnCompanys() {
	return repo.getAllTnCompanys();
	}

	public TnCompany createTnCompany(TnCompany tnCompany) {
	repo.add(tnCompany);
	return tnCompany;
	}

	@Transactional
	public void deleteTnCompany(String id) {
	TnCompany tnCompany = new TnCompany();
	tnCompany.setId(id);
	tnCompany = repo.findById(tnCompany);
	if (tnCompany != null) {
		repo.delete(tnCompany);
		}
	}

	@Transactional
	public void updateTnCompany(TnCompany tnCompany) {
	if (repo.findById(tnCompany) != null) {
		repo.update(tnCompany);
	}
	}


}
