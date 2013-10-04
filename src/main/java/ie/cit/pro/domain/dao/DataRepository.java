package ie.cit.pro.domain.dao;

import ie.cit.pro.domain.cj.CjContract;
import ie.cit.pro.domain.cj.CjJob;
import ie.cit.pro.domain.fb.FbFitting;
import ie.cit.pro.domain.fb.FbIsometric;
import ie.cit.pro.domain.fb.FbPipediam;
import ie.cit.pro.domain.fb.FbSpool;
import ie.cit.pro.domain.fb.FbWeld;
import ie.cit.pro.domain.fb.FbWeldType;
import ie.cit.pro.domain.fb.FbWelder;
import ie.cit.pro.domain.sy.SyAuthority;
import ie.cit.pro.domain.sy.SyGroupAuthority;
import ie.cit.pro.domain.sy.SyGroupMember;
import ie.cit.pro.domain.sy.SyGroup;
import ie.cit.pro.domain.sy.SySecfield;
import ie.cit.pro.domain.sy.SySection;
import ie.cit.pro.domain.sy.SyUser;
import ie.cit.pro.domain.tn.TnCompany;
import ie.cit.pro.domain.tn.TnTenant;

import java.util.List;

public interface DataRepository {
	
	
	
	/***************************SY_SECFIELD***************************/
	List<SySecfield> getSySecfieldsByCode(List<SySecfield> sySecfields);
	
	/***************************SY_SECTION***************************/
	List<SySection> getSySectionsByCode(List<SySection> sySections);
	
	/***************************SY_USERS***************************/
	List<SyUser> getSyUsersByLogin(List<SyUser> syUsers);
	
	/*##########################GENERIC##########################*/
	
	/***************************FB_WELDTYPE***************************/
	FbWeldType findById(FbWeldType fbWeldType);
	List<FbWeldType> getAllFbWeldTypes();
	void add(FbWeldType fbWeldType);
	void delete(FbWeldType fbWeldType);
	void update(FbWeldType fbWeldType);

	/***************************FB_WELD***************************/
	FbWeld findById(FbWeld fbWeld);
	List<FbWeld> getAllFbWelds();
	void add(FbWeld fbWeld);
	void delete(FbWeld fbWeld);
	void update(FbWeld fbWeld);

	/***************************FB_WELDER***************************/
	FbWelder findById(FbWelder fbWelder);
	List<FbWelder> getAllFbWelders();
	void add(FbWelder fbWelder);
	void delete(FbWelder fbWelder);
	void update(FbWelder fbWelder);

	/***************************FB_ISOMETRIC***************************/
	FbIsometric findById(FbIsometric fbIsometric);
	List<FbIsometric> getAllFbIsometrics();
	void add(FbIsometric fbIsometric);
	void delete(FbIsometric fbIsometric);
	void update(FbIsometric fbIsometric);

	/***************************FB_SPOOL***************************/
	FbSpool findById(FbSpool fbSpool);
	List<FbSpool> getAllFbSpools();
	void add(FbSpool fbSpool);
	void delete(FbSpool fbSpool);
	void update(FbSpool fbSpool);

	/***************************FB_PIPEDIAM***************************/
	FbPipediam findById(FbPipediam fbPipediam);
	List<FbPipediam> getAllFbPipediams();
	void add(FbPipediam fbPipediam);
	void delete(FbPipediam fbPipediam);
	void update(FbPipediam fbPipediam);

	/***************************FB_FITTING***************************/
	FbFitting findById(FbFitting fbFitting);
	List<FbFitting> getAllFbFittings();
	void add(FbFitting fbFitting);
	void delete(FbFitting fbFitting);
	void update(FbFitting fbFitting);

	/***************************CJ_CONTRACT***************************/
	CjContract findById(CjContract cjContract);
	List<CjContract> getAllCjContracts();
	void add(CjContract cjContract);
	void delete(CjContract cjContract);
	void update(CjContract cjContract);

	/***************************CJ_JOB***************************/
	CjJob findById(CjJob cjJob);
	List<CjJob> getAllCjJobs();
	void add(CjJob cjJob);
	void delete(CjJob cjJob);
	void update(CjJob cjJob);

	/***************************TN_TENANT***************************/
	TnTenant findById(TnTenant tnTenant);
	List<TnTenant> getAllTnTenants();
	void add(TnTenant tnTenant);
	void delete(TnTenant tnTenant);
	void update(TnTenant tnTenant);

	/***************************TN_COMPANY***************************/
	TnCompany findById(TnCompany tnCompany);
	List<TnCompany> getAllTnCompanys();
	void add(TnCompany tnCompany);
	void delete(TnCompany tnCompany);
	void update(TnCompany tnCompany);

	/***************************SY_SECFIELD***************************/
	SySecfield findById(SySecfield sySecfield);
	List<SySecfield> getAllSySecfields();
	void add(SySecfield sySecfield);
	void delete(SySecfield sySecfield);
	void update(SySecfield sySecfield);

	/***************************SY_SECTION***************************/
	SySection findById(SySection sySection);
	List<SySection> getAllSySections();
	void add(SySection sySection);
	void delete(SySection sySection);
	void update(SySection sySection);

	/***************************SY_USER***************************/
	SyUser findById(SyUser syUser);
	List<SyUser> getAllSyUsers();
	void add(SyUser syUser);
	void delete(SyUser syUser);
	void update(SyUser syUser);

	/***************************SY_AUTHORITY***************************/
	SyAuthority findById(SyAuthority syAuthority);
	List<SyAuthority> getAllSyAuthoritys();
	void add(SyAuthority syAuthority);
	void delete(SyAuthority syAuthority);
	void update(SyAuthority syAuthority);

	/***************************SY_GROUP***************************/
	SyGroup findById(SyGroup syGroup);
	List<SyGroup> getAllSyGroups();
	void add(SyGroup syGroup);
	void delete(SyGroup syGroup);
	void update(SyGroup syGroup);

	/***************************SY_GROUP_AUTHORITY***************************/
	SyGroupAuthority findById(SyGroupAuthority syGroupAuthority);
	List<SyGroupAuthority> getAllSyGroupAuthoritys();
	void add(SyGroupAuthority syGroupAuthority);
	void delete(SyGroupAuthority syGroupAuthority);
	void update(SyGroupAuthority syGroupAuthority);

	/***************************SY_GROUP_MEMBER***************************/
	SyGroupMember findById(SyGroupMember syGroupMember);
	List<SyGroupMember> getAllSyGroupMembers();
	void add(SyGroupMember syGroupMember);
	void delete(SyGroupMember syGroupMember);
	void update(SyGroupMember syGroupMember);

}

