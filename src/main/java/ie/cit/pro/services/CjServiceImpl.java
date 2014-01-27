package ie.cit.pro.services;

import ie.cit.pro.domain.cj.CjContract;
import ie.cit.pro.domain.cj.CjJob;
import ie.cit.pro.domain.dao.DataRepository;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class CjServiceImpl implements CjService {

	private DataRepository repo;

	// Constructor
	public CjServiceImpl(DataRepository repo) {
		this.repo = repo;
	}
	
	public CjServiceImpl() {

	}
	
	public DataRepository getRepo() {
		return repo;
	}

	public void setRepo(DataRepository repo) {
		this.repo = repo;
	}

	/***************************CJ_CONTRACT***************************/
	public CjContract getCjContract(String id) {
	CjContract cjContract = new CjContract();
	cjContract.setId(id);
	return repo.findById(cjContract);
	}

	public List<CjContract> getAllCjContracts() {
	return repo.getAllCjContracts();
	}

	public CjContract createCjContract(CjContract cjContract) {
	repo.add(cjContract);
	return cjContract;
	}

	@Transactional
	public void deleteCjContract(String id) {
	CjContract cjContract = new CjContract();
	cjContract.setId(id);
	cjContract = repo.findById(cjContract);
	if (cjContract != null) {
		repo.delete(cjContract);
		}
	}

	@Transactional
	public void updateCjContract(CjContract cjContract) {
	if (repo.findById(cjContract) != null) {
		repo.update(cjContract);
	}
	}


	/***************************CJ_JOB***************************/
	public CjJob getCjJob(String id) {
	CjJob cjJob = new CjJob();
	cjJob.setId(id);
	return repo.findById(cjJob);
	}

	public List<CjJob> getAllCjJobs() {
	return repo.getAllCjJobs();
	}

	public CjJob createCjJob(CjJob cjJob) {
	repo.add(cjJob);
	return cjJob;
	}

	@Transactional
	public void deleteCjJob(String id) {
	CjJob cjJob = new CjJob();
	cjJob.setId(id);
	cjJob = repo.findById(cjJob);
	if (cjJob != null) {
		repo.delete(cjJob);
		}
	}

	@Transactional
	public void updateCjJob(CjJob cjJob) {
	if (repo.findById(cjJob) != null) {
		repo.update(cjJob);
	}
	}


}
