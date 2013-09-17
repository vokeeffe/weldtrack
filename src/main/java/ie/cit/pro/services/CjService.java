package ie.cit.pro.services;

import java.util.List;

import ie.cit.pro.domain.cj.CjContract;
import ie.cit.pro.domain.cj.CjJob;

public interface CjService {

	/***************************CJ_CONTRACT***************************/
	CjContract getCjContract(String id);
	List<CjContract> getAllCjContracts();
	CjContract createCjContract(CjContract cjContract);
	void deleteCjContract(String id);
	void updateCjContract(CjContract cjContract);
	/***************************CJ_JOB***************************/
	CjJob getCjJob(String id);
	List<CjJob> getAllCjJobs();
	CjJob createCjJob(CjJob cjJob);
	void deleteCjJob(String id);
	void updateCjJob(CjJob cjJob);
	
}
