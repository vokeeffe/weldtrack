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
import ie.cit.pro.domain.sy.Authorities;
import ie.cit.pro.domain.sy.GroupAuthorities;
import ie.cit.pro.domain.sy.GroupMembers;
import ie.cit.pro.domain.sy.Groups;
import ie.cit.pro.domain.sy.SySecfield;
import ie.cit.pro.domain.sy.SySection;
import ie.cit.pro.domain.sy.Users;
import ie.cit.pro.domain.tn.TnCompany;
import ie.cit.pro.domain.tn.TnTenant;

import java.util.List;

public interface DataRepository {
	
	
	
	/***************************SY_SECFIELD***************************/
	List<SySecfield> getSySecfieldsByCode(List<SySecfield> sySecfields);
	
	/***************************SY_SECTION***************************/
	List<SySection> getSySectionsByCode(List<SySection> sySections);
	
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

	/***************************USERS***************************/
	Users findById(Users users);
	List<Users> getAllUserss();
	void add(Users users);
	void delete(Users users);
	void update(Users users);

	/***************************AUTHORITIES***************************/
	Authorities findById(Authorities authorities);
	List<Authorities> getAllAuthoritiess();
	void add(Authorities authorities);
	void delete(Authorities authorities);
	void update(Authorities authorities);

	/***************************GROUPS***************************/
	Groups findById(Groups groups);
	List<Groups> getAllGroupss();
	void add(Groups groups);
	void delete(Groups groups);
	void update(Groups groups);

	/***************************GROUP_AUTHORITIES***************************/
	GroupAuthorities findById(GroupAuthorities groupAuthorities);
	List<GroupAuthorities> getAllGroupAuthoritiess();
	void add(GroupAuthorities groupAuthorities);
	void delete(GroupAuthorities groupAuthorities);
	void update(GroupAuthorities groupAuthorities);

	/***************************GROUP_MEMBERS***************************/
	GroupMembers findById(GroupMembers groupMembers);
	List<GroupMembers> getAllGroupMemberss();
	void add(GroupMembers groupMembers);
	void delete(GroupMembers groupMembers);
	void update(GroupMembers groupMembers);


}

