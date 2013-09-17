package ie.cit.pro.services;

import java.util.List;

import ie.cit.pro.domain.tn.TnCompany;
import ie.cit.pro.domain.tn.TnTenant;

public interface TnService {

	/***************************TN_TENANT***************************/
	TnTenant getTnTenant(String id);
	List<TnTenant> getAllTnTenants();
	TnTenant createTnTenant(TnTenant tnTenant);
	void deleteTnTenant(String id);
	void updateTnTenant(TnTenant tnTenant);
	/***************************TN_COMPANY***************************/
	TnCompany getTnCompany(String id);
	List<TnCompany> getAllTnCompanys();
	TnCompany createTnCompany(TnCompany tnCompany);
	void deleteTnCompany(String id);
	void updateTnCompany(TnCompany tnCompany);
	
}
