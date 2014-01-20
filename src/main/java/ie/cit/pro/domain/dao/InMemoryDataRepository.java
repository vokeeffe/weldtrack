package ie.cit.pro.domain.dao;

import ie.cit.pro.domain.au.AuAuthority;
import ie.cit.pro.domain.au.AuGroup;
import ie.cit.pro.domain.au.AuGroupAuthority;
import ie.cit.pro.domain.au.AuGroupMember;
import ie.cit.pro.domain.au.AuUser;
import ie.cit.pro.domain.cj.CjContract;
import ie.cit.pro.domain.cj.CjJob;
import ie.cit.pro.domain.fb.FbFitting;
import ie.cit.pro.domain.fb.FbIsometric;
import ie.cit.pro.domain.fb.FbPipediam;
import ie.cit.pro.domain.fb.FbSpool;
import ie.cit.pro.domain.fb.FbWeld;
import ie.cit.pro.domain.fb.FbWeldType;
import ie.cit.pro.domain.fb.FbWelder;
import ie.cit.pro.domain.sy.SySecfield;
import ie.cit.pro.domain.sy.SySection;
import ie.cit.pro.domain.tn.TnCompany;
import ie.cit.pro.domain.tn.TnTenant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.access.annotation.Secured;

public class InMemoryDataRepository implements DataRepository {

	private Map<String, FbWeldType> fbWeldTypeMap = new HashMap<String, FbWeldType>();
	private Map<String, FbWeld> fbWeldMap = new HashMap<String, FbWeld>();
	private Map<String, FbWelder> fbWelderMap = new HashMap<String, FbWelder>();
	private Map<String, FbIsometric> fbIsometricMap = new HashMap<String, FbIsometric>();
	private Map<String, FbSpool> fbSpoolMap = new HashMap<String, FbSpool>();
	private Map<String, FbPipediam> fbPipediamMap = new HashMap<String, FbPipediam>();
	private Map<String, FbFitting> fbFittingMap = new HashMap<String, FbFitting>();
	private Map<String, CjContract> cjContractMap = new HashMap<String, CjContract>();
	private Map<String, CjJob> cjJobMap = new HashMap<String, CjJob>();
	private Map<String, TnTenant> tnTenantMap = new HashMap<String, TnTenant>();
	private Map<String, TnCompany> tnCompanyMap = new HashMap<String, TnCompany>();
	private Map<String, SySecfield> sySecfieldMap = new HashMap<String, SySecfield>();
	private Map<String, SySection> sySectionMap = new HashMap<String, SySection>();
	private Map<String, AuUser> auUserMap = new HashMap<String, AuUser>();
	private Map<String, AuAuthority> auAuthorityMap = new HashMap<String, AuAuthority>();
	private Map<String, AuGroup> auGroupMap = new HashMap<String, AuGroup>();
	private Map<String, AuGroupAuthority> auGroupAuthorityMap = new HashMap<String, AuGroupAuthority>();
	private Map<String, AuGroupMember> auGroupMemberMap = new HashMap<String, AuGroupMember>();	
	/***************************SY_SECFIELD***************************/
	public List<SySecfield> getSySecfieldsByCode(List<SySecfield> sySecfields){

		return null;
	}
	
	/***************************SY_SECTION***************************/
	public List<SySection> getSySectionsByCode(List<SySection> sySections){

		return null;
	}
	
	/***************************SY_USERS***************************/
	public List<AuUser> getAuUsersByLogin(List<AuUser> auUsers) {
	return null;
	}
	
	/***************************FB_WELD***************************/
	public List<FbWeld> getFbObjects(List<FbWeld> fbWelds){
		return null;
	}
	
	/*##########################GENERIC##########################*/

	/***************************FB_WELDTYPE***************************/
	public FbWeldType findById(FbWeldType fbWeldType) {
	return fbWeldTypeMap.get(fbWeldType.getId());
	}

	public List<FbWeldType> getAllFbWeldTypes() {
	return new ArrayList<FbWeldType>(fbWeldTypeMap.values());
	}

	public void add(FbWeldType fbWeldType) {
	fbWeldTypeMap.put(fbWeldType.getId(), fbWeldType);
	}

	public void delete(FbWeldType fbWeldType) {
	fbWeldTypeMap.remove(fbWeldType.getId());
	}

	public void update(FbWeldType fbWeldType) {
	fbWeldTypeMap.put(fbWeldType.getId(), fbWeldType);
	}
	/***************************FB_WELD***************************/
	public FbWeld findById(FbWeld fbWeld) {
	return fbWeldMap.get(fbWeld.getId());
	}

	public List<FbWeld> getAllFbWelds() {
	return new ArrayList<FbWeld>(fbWeldMap.values());
	}

	public void add(FbWeld fbWeld) {
	fbWeldMap.put(fbWeld.getId(), fbWeld);
	}

	public void delete(FbWeld fbWeld) {
	fbWeldMap.remove(fbWeld.getId());
	}

	public void update(FbWeld fbWeld) {
	fbWeldMap.put(fbWeld.getId(), fbWeld);
	}
	/***************************FB_WELDER***************************/
	public FbWelder findById(FbWelder fbWelder) {
	return fbWelderMap.get(fbWelder.getId());
	}

	public List<FbWelder> getAllFbWelders() {
	return new ArrayList<FbWelder>(fbWelderMap.values());
	}

	public void add(FbWelder fbWelder) {
	fbWelderMap.put(fbWelder.getId(), fbWelder);
	}

	public void delete(FbWelder fbWelder) {
	fbWelderMap.remove(fbWelder.getId());
	}

	public void update(FbWelder fbWelder) {
	fbWelderMap.put(fbWelder.getId(), fbWelder);
	}
	/***************************FB_ISOMETRIC***************************/
	public FbIsometric findById(FbIsometric fbIsometric) {
	return fbIsometricMap.get(fbIsometric.getId());
	}

	public List<FbIsometric> getAllFbIsometrics() {
	return new ArrayList<FbIsometric>(fbIsometricMap.values());
	}

	public void add(FbIsometric fbIsometric) {
	fbIsometricMap.put(fbIsometric.getId(), fbIsometric);
	}

	public void delete(FbIsometric fbIsometric) {
	fbIsometricMap.remove(fbIsometric.getId());
	}

	public void update(FbIsometric fbIsometric) {
	fbIsometricMap.put(fbIsometric.getId(), fbIsometric);
	}
	/***************************FB_SPOOL***************************/
	public FbSpool findById(FbSpool fbSpool) {
	return fbSpoolMap.get(fbSpool.getId());
	}

	public List<FbSpool> getAllFbSpools() {
	return new ArrayList<FbSpool>(fbSpoolMap.values());
	}

	public void add(FbSpool fbSpool) {
	fbSpoolMap.put(fbSpool.getId(), fbSpool);
	}

	public void delete(FbSpool fbSpool) {
	fbSpoolMap.remove(fbSpool.getId());
	}

	public void update(FbSpool fbSpool) {
	fbSpoolMap.put(fbSpool.getId(), fbSpool);
	}
	/***************************FB_PIPEDIAM***************************/
	public FbPipediam findById(FbPipediam fbPipediam) {
	return fbPipediamMap.get(fbPipediam.getId());
	}

	public List<FbPipediam> getAllFbPipediams() {
	return new ArrayList<FbPipediam>(fbPipediamMap.values());
	}

	public void add(FbPipediam fbPipediam) {
	fbPipediamMap.put(fbPipediam.getId(), fbPipediam);
	}

	public void delete(FbPipediam fbPipediam) {
	fbPipediamMap.remove(fbPipediam.getId());
	}

	public void update(FbPipediam fbPipediam) {
	fbPipediamMap.put(fbPipediam.getId(), fbPipediam);
	}
	/***************************FB_FITTING***************************/
	public FbFitting findById(FbFitting fbFitting) {
	return fbFittingMap.get(fbFitting.getId());
	}

	public List<FbFitting> getAllFbFittings() {
	return new ArrayList<FbFitting>(fbFittingMap.values());
	}

	public void add(FbFitting fbFitting) {
	fbFittingMap.put(fbFitting.getId(), fbFitting);
	}

	public void delete(FbFitting fbFitting) {
	fbFittingMap.remove(fbFitting.getId());
	}

	public void update(FbFitting fbFitting) {
	fbFittingMap.put(fbFitting.getId(), fbFitting);
	}
	/***************************CJ_CONTRACT***************************/
	public CjContract findById(CjContract cjContract) {
	return cjContractMap.get(cjContract.getId());
	}

	public List<CjContract> getAllCjContracts() {
	return new ArrayList<CjContract>(cjContractMap.values());
	}

	public void add(CjContract cjContract) {
	cjContractMap.put(cjContract.getId(), cjContract);
	}

	public void delete(CjContract cjContract) {
	cjContractMap.remove(cjContract.getId());
	}

	public void update(CjContract cjContract) {
	cjContractMap.put(cjContract.getId(), cjContract);
	}
	/***************************CJ_JOB***************************/
	public CjJob findById(CjJob cjJob) {
	return cjJobMap.get(cjJob.getId());
	}

	public List<CjJob> getAllCjJobs() {
	return new ArrayList<CjJob>(cjJobMap.values());
	}

	public void add(CjJob cjJob) {
	cjJobMap.put(cjJob.getId(), cjJob);
	}

	public void delete(CjJob cjJob) {
	cjJobMap.remove(cjJob.getId());
	}

	public void update(CjJob cjJob) {
	cjJobMap.put(cjJob.getId(), cjJob);
	}
	/***************************TN_TENANT***************************/
	public TnTenant findById(TnTenant tnTenant) {
	return tnTenantMap.get(tnTenant.getId());
	}

	public List<TnTenant> getAllTnTenants() {
	return new ArrayList<TnTenant>(tnTenantMap.values());
	}

	public void add(TnTenant tnTenant) {
	tnTenantMap.put(tnTenant.getId(), tnTenant);
	}

	public void delete(TnTenant tnTenant) {
	tnTenantMap.remove(tnTenant.getId());
	}

	public void update(TnTenant tnTenant) {
	tnTenantMap.put(tnTenant.getId(), tnTenant);
	}
	/***************************TN_COMPANY***************************/
	public TnCompany findById(TnCompany tnCompany) {
	return tnCompanyMap.get(tnCompany.getId());
	}

	public List<TnCompany> getAllTnCompanys() {
	return new ArrayList<TnCompany>(tnCompanyMap.values());
	}

	public void add(TnCompany tnCompany) {
	tnCompanyMap.put(tnCompany.getId(), tnCompany);
	}

	public void delete(TnCompany tnCompany) {
	tnCompanyMap.remove(tnCompany.getId());
	}

	public void update(TnCompany tnCompany) {
	tnCompanyMap.put(tnCompany.getId(), tnCompany);
	}
	/***************************SY_SECFIELD***************************/
	public SySecfield findById(SySecfield sySecfield) {
	return sySecfieldMap.get(sySecfield.getId());
	}

	public List<SySecfield> getAllSySecfields() {
	return new ArrayList<SySecfield>(sySecfieldMap.values());
	}

	public void add(SySecfield sySecfield) {
	sySecfieldMap.put(sySecfield.getId(), sySecfield);
	}

	public void delete(SySecfield sySecfield) {
	sySecfieldMap.remove(sySecfield.getId());
	}

	public void update(SySecfield sySecfield) {
	sySecfieldMap.put(sySecfield.getId(), sySecfield);
	}
	/***************************SY_SECTION***************************/
	public SySection findById(SySection sySection) {
	return sySectionMap.get(sySection.getId());
	}

	public List<SySection> getAllSySections() {
	return new ArrayList<SySection>(sySectionMap.values());
	}

	public void add(SySection sySection) {
	sySectionMap.put(sySection.getId(), sySection);
	}

	public void delete(SySection sySection) {
	sySectionMap.remove(sySection.getId());
	}

	public void update(SySection sySection) {
	sySectionMap.put(sySection.getId(), sySection);
	}
	/***************************AU_USER***************************/
	public AuUser findById(AuUser auUser) {
	return auUserMap.get(auUser.getId());
	}

	public List<AuUser> getAllAuUsers() {
	return new ArrayList<AuUser>(auUserMap.values());
	}

	public void add(AuUser auUser) {
	auUserMap.put(auUser.getId(), auUser);
	}

	public void delete(AuUser auUser) {
	auUserMap.remove(auUser.getId());
	}

	public void update(AuUser auUser) {
	auUserMap.put(auUser.getId(), auUser);
	}
	/***************************AU_AUTHORITY***************************/
	public AuAuthority findById(AuAuthority auAuthority) {
	return auAuthorityMap.get(auAuthority.getId());
	}

	public List<AuAuthority> getAllAuAuthoritys() {
	return new ArrayList<AuAuthority>(auAuthorityMap.values());
	}

	public void add(AuAuthority auAuthority) {
	auAuthorityMap.put(auAuthority.getId(), auAuthority);
	}

	public void delete(AuAuthority auAuthority) {
	auAuthorityMap.remove(auAuthority.getId());
	}

	public void update(AuAuthority auAuthority) {
	auAuthorityMap.put(auAuthority.getId(), auAuthority);
	}
	/***************************AU_GROUP***************************/
	public AuGroup findById(AuGroup auGroup) {
	return auGroupMap.get(auGroup.getId());
	}

	public List<AuGroup> getAllAuGroups() {
	return new ArrayList<AuGroup>(auGroupMap.values());
	}

	public void add(AuGroup auGroup) {
	auGroupMap.put(auGroup.getId(), auGroup);
	}

	public void delete(AuGroup auGroup) {
	auGroupMap.remove(auGroup.getId());
	}

	public void update(AuGroup auGroup) {
	auGroupMap.put(auGroup.getId(), auGroup);
	}
	/***************************AU_GROUP_AUTHORITY***************************/
	public AuGroupAuthority findById(AuGroupAuthority auGroupAuthority) {
	return auGroupAuthorityMap.get(auGroupAuthority.getId());
	}

	public List<AuGroupAuthority> getAllAuGroupAuthoritys() {
	return new ArrayList<AuGroupAuthority>(auGroupAuthorityMap.values());
	}

	public void add(AuGroupAuthority auGroupAuthority) {
	auGroupAuthorityMap.put(auGroupAuthority.getId(), auGroupAuthority);
	}

	public void delete(AuGroupAuthority auGroupAuthority) {
	auGroupAuthorityMap.remove(auGroupAuthority.getId());
	}

	public void update(AuGroupAuthority auGroupAuthority) {
	auGroupAuthorityMap.put(auGroupAuthority.getId(), auGroupAuthority);
	}
	/***************************AU_GROUP_MEMBER***************************/
	public AuGroupMember findById(AuGroupMember auGroupMember) {
	return auGroupMemberMap.get(auGroupMember.getId());
	}

	public List<AuGroupMember> getAllAuGroupMembers() {
	return new ArrayList<AuGroupMember>(auGroupMemberMap.values());
	}

	public void add(AuGroupMember auGroupMember) {
	auGroupMemberMap.put(auGroupMember.getId(), auGroupMember);
	}

	public void delete(AuGroupMember auGroupMember) {
	auGroupMemberMap.remove(auGroupMember.getId());
	}

	public void update(AuGroupMember auGroupMember) {
	auGroupMemberMap.put(auGroupMember.getId(), auGroupMember);
	}
}
