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
import ie.cit.pro.domain.sy.SySecfield;
import ie.cit.pro.domain.sy.SySection;
import ie.cit.pro.domain.tn.TnCompany;
import ie.cit.pro.domain.tn.TnTenant;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.access.annotation.Secured;
//import org.springframework.security.access.annotation.Secured;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextHolder;

@Secured("ROLE_USER")//Secures all of the methods in the class.
public class JdbcDataRepository implements DataRepository {

	private JdbcTemplate jdbcTemplate;

	private FbWeldTypeMapper fbWeldTypeMapper = new FbWeldTypeMapper();
	private FbWeldMapper fbWeldMapper = new FbWeldMapper();
	private FbWelderMapper fbWelderMapper = new FbWelderMapper();
	private FbIsometricMapper fbIsometricMapper = new FbIsometricMapper();
	private FbSpoolMapper fbSpoolMapper = new FbSpoolMapper();
	private FbPipediamMapper fbPipediamMapper = new FbPipediamMapper();
	private FbFittingMapper fbFittingMapper = new FbFittingMapper();
	private CjContractMapper cjContractMapper = new CjContractMapper();
	private CjJobMapper cjJobMapper = new CjJobMapper();
	private TnTenantMapper tnTenantMapper = new TnTenantMapper();
	private TnCompanyMapper tnCompanyMapper = new TnCompanyMapper();
	private SySecfieldMapper sySecfieldMapper = new SySecfieldMapper();
	private SySectionMapper sySectionMapper = new SySectionMapper();

	public JdbcDataRepository(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private String getCurrentUser() {
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}
	
	
	/***************************FB_WELDTYPE***************************/
@Secured({"ROLE_USER", "ROLE_GUEST"})
	public FbWeldType findById(FbWeldType fbWeldType) {
	return jdbcTemplate.queryForObject("SELECT * FROM fb_weldtype WHERE ID=?", fbWeldTypeMapper, fbWeldType.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<FbWeldType> getAllFbWeldTypes(){
	return jdbcTemplate.query("SELECT * FROM fb_weldtype", fbWeldTypeMapper);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void add(FbWeldType fbWeldType) {
	jdbcTemplate.update("INSERT INTO fb_weldtype (id, wty_a_createdby, wty_a_createddate) VALUES(?,?,?)", fbWeldType.getId(), this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()));
	this.update(fbWeldType);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void delete(FbWeldType fbWeldType) {
	jdbcTemplate.update("DELETE FROM fb_weldtype WHERE ID=?", fbWeldType.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void update(FbWeldType fbWeldType) {
	jdbcTemplate.update("UPDATE fb_weldtype SET wty_a_modifiedby=?, wty_a_modifieddate=?, " + 
	"ktn=?, wty_code=?, wty_name=?, wty_sort=? WHERE id=?",
	this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()), fbWeldType.getKtn(), fbWeldType.getWty_code(), fbWeldType.getWty_name(), fbWeldType.getWty_sort(), fbWeldType.getId());
	}


	/***************************FB_WELD***************************/
@Secured({"ROLE_USER", "ROLE_GUEST"})
	public FbWeld findById(FbWeld fbWeld) {
	return jdbcTemplate.queryForObject("SELECT * FROM fb_weld WHERE ID=?", fbWeldMapper, fbWeld.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<FbWeld> getAllFbWelds(){
	return jdbcTemplate.query("SELECT * FROM fb_weld", fbWeldMapper);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void add(FbWeld fbWeld) {
	jdbcTemplate.update("INSERT INTO fb_weld (id, wld_a_createdby, wld_a_createddate) VALUES(?,?,?)", fbWeld.getId(), this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()));
	this.update(fbWeld);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void delete(FbWeld fbWeld) {
	jdbcTemplate.update("DELETE FROM fb_weld WHERE ID=?", fbWeld.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void update(FbWeld fbWeld) {
	jdbcTemplate.update("UPDATE fb_weld SET wld_a_modifiedby=?, wld_a_modifieddate=?, " + 
	"ktn=?, kco=?, wty_code=?, wld_num=?, spl_num=?, iso_num=?, pdr_size=?, wld_fw=?, wdr_num=?, wld_wdate=?, fit_fitting1=?, fit_fitting2=?, wld_heat1=?, wld_heat2=? WHERE id=?",
	this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()), fbWeld.getKtn(), fbWeld.getKco(), fbWeld.getWty_code(), fbWeld.getWld_num(), fbWeld.getSpl_num(), fbWeld.getIso_num(), fbWeld.getPdr_size(), fbWeld.isWld_fw(), fbWeld.getWdr_num(), fbWeld.getWld_wdate(), fbWeld.getFit_fitting1(), fbWeld.getFit_fitting2(), fbWeld.getWld_heat1(), fbWeld.getWld_heat2(), fbWeld.getId());
	}


	/***************************FB_WELDER***************************/
@Secured({"ROLE_USER", "ROLE_GUEST"})
	public FbWelder findById(FbWelder fbWelder) {
	return jdbcTemplate.queryForObject("SELECT * FROM fb_welder WHERE ID=?", fbWelderMapper, fbWelder.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<FbWelder> getAllFbWelders(){
	return jdbcTemplate.query("SELECT * FROM fb_welder", fbWelderMapper);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void add(FbWelder fbWelder) {
	jdbcTemplate.update("INSERT INTO fb_welder (id, wdr_a_createdby, wdr_a_createddate) VALUES(?,?,?)", fbWelder.getId(), this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()));
	this.update(fbWelder);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void delete(FbWelder fbWelder) {
	jdbcTemplate.update("DELETE FROM fb_welder WHERE ID=?", fbWelder.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void update(FbWelder fbWelder) {
	jdbcTemplate.update("UPDATE fb_welder SET wdr_a_modifiedby=?, wdr_a_modifieddate=?, " + 
	"ktn=?, kco=?, wdr_num=?, wdr_name=?, wdr_status=?, wdr_active=? WHERE id=?",
	this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()), fbWelder.getKtn(), fbWelder.getKco(), fbWelder.getWdr_num(), fbWelder.getWdr_name(), fbWelder.getWdr_status(), fbWelder.isWdr_active(), fbWelder.getId());
	}


	/***************************FB_ISOMETRIC***************************/
@Secured({"ROLE_USER", "ROLE_GUEST"})
	public FbIsometric findById(FbIsometric fbIsometric) {
	return jdbcTemplate.queryForObject("SELECT * FROM fb_isometric WHERE ID=?", fbIsometricMapper, fbIsometric.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<FbIsometric> getAllFbIsometrics(){
	return jdbcTemplate.query("SELECT * FROM fb_isometric", fbIsometricMapper);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void add(FbIsometric fbIsometric) {
	jdbcTemplate.update("INSERT INTO fb_isometric (id, iso_a_createdby, iso_a_createddate) VALUES(?,?,?)", fbIsometric.getId(), this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()));
	this.update(fbIsometric);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void delete(FbIsometric fbIsometric) {
	jdbcTemplate.update("DELETE FROM fb_isometric WHERE ID=?", fbIsometric.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void update(FbIsometric fbIsometric) {
	jdbcTemplate.update("UPDATE fb_isometric SET iso_a_modifiedby=?, iso_a_modifieddate=?, " + 
	"ktn=?, kco=?, con_num=?, job_num=?, iso_num=?, iso_revno=?, iso_revcode=? WHERE id=?",
	this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()), fbIsometric.getKtn(), fbIsometric.getKco(), fbIsometric.getCon_num(), fbIsometric.getJob_num(), fbIsometric.getIso_num(), fbIsometric.getIso_revno(), fbIsometric.getIso_revcode(), fbIsometric.getId());
	}


	/***************************FB_SPOOL***************************/
@Secured({"ROLE_USER", "ROLE_GUEST"})
	public FbSpool findById(FbSpool fbSpool) {
	return jdbcTemplate.queryForObject("SELECT * FROM fb_spool WHERE ID=?", fbSpoolMapper, fbSpool.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<FbSpool> getAllFbSpools(){
	return jdbcTemplate.query("SELECT * FROM fb_spool", fbSpoolMapper);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void add(FbSpool fbSpool) {
	jdbcTemplate.update("INSERT INTO fb_spool (id, spl_a_createdby, spl_a_createddate) VALUES(?,?,?)", fbSpool.getId(), this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()));
	this.update(fbSpool);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void delete(FbSpool fbSpool) {
	jdbcTemplate.update("DELETE FROM fb_spool WHERE ID=?", fbSpool.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void update(FbSpool fbSpool) {
	jdbcTemplate.update("UPDATE fb_spool SET spl_a_modifiedby=?, spl_a_modifieddate=?, " + 
	"ktn=?, kco=?, iso_num=?, spl_num=? WHERE id=?",
	this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()), fbSpool.getKtn(), fbSpool.getKco(), fbSpool.getIso_num(), fbSpool.getSpl_num(), fbSpool.getId());
	}


	/***************************FB_PIPEDIAM***************************/
@Secured({"ROLE_USER", "ROLE_GUEST"})
	public FbPipediam findById(FbPipediam fbPipediam) {
	return jdbcTemplate.queryForObject("SELECT * FROM fb_pipediam WHERE ID=?", fbPipediamMapper, fbPipediam.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<FbPipediam> getAllFbPipediams(){
	return jdbcTemplate.query("SELECT * FROM fb_pipediam", fbPipediamMapper);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void add(FbPipediam fbPipediam) {
	jdbcTemplate.update("INSERT INTO fb_pipediam (id, pdr_a_createdby, pdr_a_createddate) VALUES(?,?,?)", fbPipediam.getId(), this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()));
	this.update(fbPipediam);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void delete(FbPipediam fbPipediam) {
	jdbcTemplate.update("DELETE FROM fb_pipediam WHERE ID=?", fbPipediam.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void update(FbPipediam fbPipediam) {
	jdbcTemplate.update("UPDATE fb_pipediam SET pdr_a_modifiedby=?, pdr_a_modifieddate=?, " + 
	"ktn=?, pdr_size=?, pdr_desc=?, pdr_nb=? WHERE id=?",
	this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()), fbPipediam.getKtn(), fbPipediam.getPdr_size(), fbPipediam.getPdr_desc(), fbPipediam.getPdr_nb(), fbPipediam.getId());
	}


	/***************************FB_FITTING***************************/
@Secured({"ROLE_USER", "ROLE_GUEST"})
	public FbFitting findById(FbFitting fbFitting) {
	return jdbcTemplate.queryForObject("SELECT * FROM fb_fitting WHERE ID=?", fbFittingMapper, fbFitting.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<FbFitting> getAllFbFittings(){
	return jdbcTemplate.query("SELECT * FROM fb_fitting", fbFittingMapper);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void add(FbFitting fbFitting) {
	jdbcTemplate.update("INSERT INTO fb_fitting (id, fit_a_createdby, fit_a_createddate) VALUES(?,?,?)", fbFitting.getId(), this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()));
	this.update(fbFitting);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void delete(FbFitting fbFitting) {
	jdbcTemplate.update("DELETE FROM fb_fitting WHERE ID=?", fbFitting.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void update(FbFitting fbFitting) {
	jdbcTemplate.update("UPDATE fb_fitting SET fit_a_modifiedby=?, fit_a_modifieddate=?, " + 
	"ktn=?, fit_code=?, fit_name=? WHERE id=?",
	this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()), fbFitting.getKtn(), fbFitting.getFit_code(), fbFitting.getFit_name(), fbFitting.getId());
	}


	/***************************CJ_CONTRACT***************************/
@Secured({"ROLE_USER", "ROLE_GUEST"})
	public CjContract findById(CjContract cjContract) {
	return jdbcTemplate.queryForObject("SELECT * FROM cj_contract WHERE ID=?", cjContractMapper, cjContract.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<CjContract> getAllCjContracts(){
	return jdbcTemplate.query("SELECT * FROM cj_contract", cjContractMapper);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void add(CjContract cjContract) {
	jdbcTemplate.update("INSERT INTO cj_contract (id, con_a_createdby, con_a_createddate) VALUES(?,?,?)", cjContract.getId(), this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()));
	this.update(cjContract);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void delete(CjContract cjContract) {
	jdbcTemplate.update("DELETE FROM cj_contract WHERE ID=?", cjContract.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void update(CjContract cjContract) {
	jdbcTemplate.update("UPDATE cj_contract SET con_a_modifiedby=?, con_a_modifieddate=?, " + 
	"ktn=?, kco=?, con_num=?, con_name=? WHERE id=?",
	this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()), cjContract.getKtn(), cjContract.getKco(), cjContract.getCon_num(), cjContract.getCon_name(), cjContract.getId());
	}


	/***************************CJ_JOB***************************/
@Secured({"ROLE_USER", "ROLE_GUEST"})
	public CjJob findById(CjJob cjJob) {
	return jdbcTemplate.queryForObject("SELECT * FROM cj_job WHERE ID=?", cjJobMapper, cjJob.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<CjJob> getAllCjJobs(){
	return jdbcTemplate.query("SELECT * FROM cj_job", cjJobMapper);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void add(CjJob cjJob) {
	jdbcTemplate.update("INSERT INTO cj_job (id, job_a_createdby, job_a_createddate) VALUES(?,?,?)", cjJob.getId(), this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()));
	this.update(cjJob);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void delete(CjJob cjJob) {
	jdbcTemplate.update("DELETE FROM cj_job WHERE ID=?", cjJob.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void update(CjJob cjJob) {
	jdbcTemplate.update("UPDATE cj_job SET job_a_modifiedby=?, job_a_modifieddate=?, " + 
	"ktn=?, kco=?, con_num=?, job_num=?, job_name=? WHERE id=?",
	this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()), cjJob.getKtn(), cjJob.getKco(), cjJob.getCon_num(), cjJob.getJob_num(), cjJob.getJob_name(), cjJob.getId());
	}


	/***************************TN_TENANT***************************/
@Secured({"ROLE_USER", "ROLE_GUEST"})
	public TnTenant findById(TnTenant tnTenant) {
	return jdbcTemplate.queryForObject("SELECT * FROM tn_tenant WHERE ID=?", tnTenantMapper, tnTenant.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<TnTenant> getAllTnTenants(){
	return jdbcTemplate.query("SELECT * FROM tn_tenant", tnTenantMapper);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void add(TnTenant tnTenant) {
	jdbcTemplate.update("INSERT INTO tn_tenant (id, tnt_a_createdby, tnt_a_createddate) VALUES(?,?,?)", tnTenant.getId(), this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()));
	this.update(tnTenant);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void delete(TnTenant tnTenant) {
	jdbcTemplate.update("DELETE FROM tn_tenant WHERE ID=?", tnTenant.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void update(TnTenant tnTenant) {
	jdbcTemplate.update("UPDATE tn_tenant SET tnt_a_modifiedby=?, tnt_a_modifieddate=?, " + 
	"ktn=?, tnt_name=? WHERE id=?",
	this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()), tnTenant.getKtn(), tnTenant.getTnt_name(), tnTenant.getId());
	}


	/***************************TN_COMPANY***************************/
@Secured({"ROLE_USER", "ROLE_GUEST"})
	public TnCompany findById(TnCompany tnCompany) {
	return jdbcTemplate.queryForObject("SELECT * FROM tn_company WHERE ID=?", tnCompanyMapper, tnCompany.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<TnCompany> getAllTnCompanys(){
	return jdbcTemplate.query("SELECT * FROM tn_company", tnCompanyMapper);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void add(TnCompany tnCompany) {
	jdbcTemplate.update("INSERT INTO tn_company (id, tco_a_createdby, tco_a_createddate) VALUES(?,?,?)", tnCompany.getId(), this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()));
	this.update(tnCompany);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void delete(TnCompany tnCompany) {
	jdbcTemplate.update("DELETE FROM tn_company WHERE ID=?", tnCompany.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void update(TnCompany tnCompany) {
	jdbcTemplate.update("UPDATE tn_company SET tco_a_modifiedby=?, tco_a_modifieddate=?, " + 
	"ktn=?, kco=?, tco_name=? WHERE id=?",
	this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()), tnCompany.getKtn(), tnCompany.getKco(), tnCompany.getTco_name(), tnCompany.getId());
	}


	/***************************SY_SECFIELD***************************/
@Secured({"ROLE_USER", "ROLE_GUEST"})
	public SySecfield findById(SySecfield sySecfield) {
	return jdbcTemplate.queryForObject("SELECT * FROM sy_secfield WHERE ID=?", sySecfieldMapper, sySecfield.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<SySecfield> getAllSySecfields(){
	return jdbcTemplate.query("SELECT * FROM sy_secfield", sySecfieldMapper);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void add(SySecfield sySecfield) {
	jdbcTemplate.update("INSERT INTO sy_secfield (id, sfd_a_createdby, sfd_a_createddate) VALUES(?,?,?)", sySecfield.getId(), this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()));
	this.update(sySecfield);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void delete(SySecfield sySecfield) {
	jdbcTemplate.update("DELETE FROM sy_secfield WHERE ID=?", sySecfield.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void update(SySecfield sySecfield) {
	jdbcTemplate.update("UPDATE sy_secfield SET sfd_a_modifiedby=?, sfd_a_modifieddate=?, " + 
	"stn_code=?, sfd_wrap=?, sfd_width=?, sfd_visible=?, sfd_value=?, sfd_valid=?, sfd_update=?, sfd_tooltip=?, sfd_tab=?, sfd_src=?, sfd_sort=?, sfd_seq=?, sfd_rows=?, sfd_required=?, sfd_readonly=?, sfd_range_step=?, sfd_range_num=?, sfd_range_min=?, sfd_range_max=?, sfd_progress_value=?, sfd_progress_max=?, sfd_placeholder=?, sfd_param=?, sfd_options=?, sfd_onok=?, sfd_onchange=?, sfd_onblur=?, sfd_name=?, sfd_maxlength=?, sfd_lspan=?, sfd_lclass=?, sfd_label=?, sfd_input_type=?, sfd_img_src=?, sfd_id=?, sfd_hide=?, sfd_height=?, sfd_generate=?, sfd_format=?, sfd_form=?, sfd_disabled=?, sfd_default=?, sfd_column=?, sfd_code=?, sfd_class=?, sfd_calc=?, sfd_build=?, sfd_autofocus=?, sfd_autocomplete=?, sfd_append=?, sfd_align=?, sfd_addblank=?, sfd_add=?, mf_function=?, ktn=?, sfd_size=? WHERE id=?",
	this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()), sySecfield.getStn_code(), sySecfield.getSfd_wrap(), sySecfield.getSfd_width(), sySecfield.isSfd_visible(), sySecfield.getSfd_value(), sySecfield.getSfd_valid(), sySecfield.isSfd_update(), sySecfield.getSfd_tooltip(), sySecfield.getSfd_tab(), sySecfield.getSfd_src(), sySecfield.getSfd_sort(), sySecfield.getSfd_seq(), sySecfield.getSfd_rows(), sySecfield.getSfd_required(), sySecfield.getSfd_readonly(), sySecfield.getSfd_range_step(), sySecfield.getSfd_range_num(), sySecfield.getSfd_range_min(), sySecfield.getSfd_range_max(), sySecfield.getSfd_progress_value(), sySecfield.getSfd_progress_max(), sySecfield.getSfd_placeholder(), sySecfield.getSfd_param(), sySecfield.getSfd_options(), sySecfield.getSfd_onok(), sySecfield.getSfd_onchange(), sySecfield.getSfd_onblur(), sySecfield.getSfd_name(), sySecfield.getSfd_maxlength(), sySecfield.getSfd_lspan(), sySecfield.getSfd_lclass(), sySecfield.getSfd_label(), sySecfield.getSfd_input_type(), sySecfield.getSfd_img_src(), sySecfield.getSfd_id(), sySecfield.isSfd_hide(), sySecfield.getSfd_height(), sySecfield.getSfd_generate(), sySecfield.getSfd_format(), sySecfield.getSfd_form(), sySecfield.getSfd_disabled(), sySecfield.getSfd_default(), sySecfield.getSfd_column(), sySecfield.getSfd_code(), sySecfield.getSfd_class(), sySecfield.getSfd_calc(), sySecfield.getSfd_build(), sySecfield.getSfd_autofocus(), sySecfield.getSfd_autocomplete(), sySecfield.getSfd_append(), sySecfield.getSfd_align(), sySecfield.isSfd_addblank(), sySecfield.isSfd_add(), sySecfield.getMf_function(), sySecfield.getKtn(), sySecfield.getSfd_size(), sySecfield.getId());
	}


	/***************************SY_SECTION***************************/
@Secured({"ROLE_USER", "ROLE_GUEST"})
	public SySection findById(SySection sySection) {
	return jdbcTemplate.queryForObject("SELECT * FROM sy_section WHERE ID=?", sySectionMapper, sySection.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public List<SySection> getAllSySections(){
	return jdbcTemplate.query("SELECT * FROM sy_section", sySectionMapper);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void add(SySection sySection) {
	jdbcTemplate.update("INSERT INTO sy_section (id, stn_a_createdby, stn_a_createddate) VALUES(?,?,?)", sySection.getId(), this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()));
	this.update(sySection);
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void delete(SySection sySection) {
	jdbcTemplate.update("DELETE FROM sy_section WHERE ID=?", sySection.getId());
	}

@Secured({"ROLE_USER", "ROLE_GUEST"})
	public void update(SySection sySection) {
	jdbcTemplate.update("UPDATE sy_section SET stn_a_modifiedby=?, stn_a_modifieddate=?, " + 
	"stn_code=?, mf_function=?, stn_hservice=?, stn_bservice=?, stn_brows=?, stn_btitle=?, stn_form=?, stn_form_method=?, stn_script=?, ktn=?, stn_form_action=? WHERE id=?",
	this.getCurrentUser(), new java.sql.Timestamp(new java.util.Date().getTime()), sySection.getStn_code(), sySection.getMf_function(), sySection.getStn_hservice(), sySection.getStn_bservice(), sySection.getStn_brows(), sySection.getStn_btitle(), sySection.getStn_form(), sySection.getStn_form_method(), sySection.getStn_script(), sySection.getKtn(), sySection.getStn_form_action(), sySection.getId());
	}


	
}

/***************************FB_WELDTYPE***************************/
class FbWeldTypeMapper implements RowMapper<FbWeldType> {
public FbWeldType mapRow(ResultSet rs, int rowNum) throws SQLException {
FbWeldType fbWeldType = new FbWeldType();
fbWeldType.setId(rs.getString("id"));
fbWeldType.setWty_a_createdby(rs.getString("wty_a_createdby"));
fbWeldType.setWty_a_createddate(rs.getDate("wty_a_createddate"));
fbWeldType.setWty_a_modifiedby(rs.getString("wty_a_modifiedby"));
fbWeldType.setWty_a_modifieddate(rs.getDate("wty_a_modifieddate"));
fbWeldType.setKtn(rs.getInt ("ktn"));
fbWeldType.setWty_code(rs.getString("wty_code"));
fbWeldType.setWty_name(rs.getString("wty_name"));
fbWeldType.setWty_sort(rs.getInt ("wty_sort"));
return fbWeldType;
}
}
/***************************FB_WELD***************************/
class FbWeldMapper implements RowMapper<FbWeld> {
public FbWeld mapRow(ResultSet rs, int rowNum) throws SQLException {
FbWeld fbWeld = new FbWeld();
fbWeld.setId(rs.getString("id"));
fbWeld.setWld_a_createdby(rs.getString("wld_a_createdby"));
fbWeld.setWld_a_createddate(rs.getDate("wld_a_createddate"));
fbWeld.setWld_a_modifiedby(rs.getString("wld_a_modifiedby"));
fbWeld.setWld_a_modifieddate(rs.getDate("wld_a_modifieddate"));
fbWeld.setKtn(rs.getInt ("ktn"));
fbWeld.setKco(rs.getInt ("kco"));
fbWeld.setWty_code(rs.getString("wty_code"));
fbWeld.setWld_num(rs.getString("wld_num"));
fbWeld.setSpl_num(rs.getString("spl_num"));
fbWeld.setIso_num(rs.getString("iso_num"));
fbWeld.setPdr_size(rs.getString("pdr_size"));
fbWeld.setWld_fw(rs.getBoolean("wld_fw"));
fbWeld.setWdr_num(rs.getString("wdr_num"));
fbWeld.setWld_wdate(rs.getDate("wld_wdate"));
fbWeld.setFit_fitting1(rs.getString("fit_fitting1"));
fbWeld.setFit_fitting2(rs.getString("fit_fitting2"));
fbWeld.setWld_heat1(rs.getString("wld_heat1"));
fbWeld.setWld_heat2(rs.getString("wld_heat2"));
return fbWeld;
}
}
/***************************FB_WELDER***************************/
class FbWelderMapper implements RowMapper<FbWelder> {
public FbWelder mapRow(ResultSet rs, int rowNum) throws SQLException {
FbWelder fbWelder = new FbWelder();
fbWelder.setId(rs.getString("id"));
fbWelder.setWdr_a_createdby(rs.getString("wdr_a_createdby"));
fbWelder.setWdr_a_createddate(rs.getDate("wdr_a_createddate"));
fbWelder.setWdr_a_modifiedby(rs.getString("wdr_a_modifiedby"));
fbWelder.setWdr_a_modifieddate(rs.getDate("wdr_a_modifieddate"));
fbWelder.setKtn(rs.getInt ("ktn"));
fbWelder.setKco(rs.getInt ("kco"));
fbWelder.setWdr_num(rs.getString("wdr_num"));
fbWelder.setWdr_name(rs.getString("wdr_name"));
fbWelder.setWdr_status(rs.getString("wdr_status"));
fbWelder.setWdr_active(rs.getBoolean("wdr_active"));
return fbWelder;
}
}
/***************************FB_ISOMETRIC***************************/
class FbIsometricMapper implements RowMapper<FbIsometric> {
public FbIsometric mapRow(ResultSet rs, int rowNum) throws SQLException {
FbIsometric fbIsometric = new FbIsometric();
fbIsometric.setId(rs.getString("id"));
fbIsometric.setIso_a_createdby(rs.getString("iso_a_createdby"));
fbIsometric.setIso_a_createddate(rs.getDate("iso_a_createddate"));
fbIsometric.setIso_a_modifiedby(rs.getString("iso_a_modifiedby"));
fbIsometric.setIso_a_modifieddate(rs.getDate("iso_a_modifieddate"));
fbIsometric.setKtn(rs.getInt ("ktn"));
fbIsometric.setKco(rs.getInt ("kco"));
fbIsometric.setCon_num(rs.getString("con_num"));
fbIsometric.setJob_num(rs.getString("job_num"));
fbIsometric.setIso_num(rs.getString("iso_num"));
fbIsometric.setIso_revno(rs.getInt ("iso_revno"));
fbIsometric.setIso_revcode(rs.getString("iso_revcode"));
return fbIsometric;
}
}
/***************************FB_SPOOL***************************/
class FbSpoolMapper implements RowMapper<FbSpool> {
public FbSpool mapRow(ResultSet rs, int rowNum) throws SQLException {
FbSpool fbSpool = new FbSpool();
fbSpool.setId(rs.getString("id"));
fbSpool.setSpl_a_createdby(rs.getString("spl_a_createdby"));
fbSpool.setSpl_a_createddate(rs.getDate("spl_a_createddate"));
fbSpool.setSpl_a_modifiedby(rs.getString("spl_a_modifiedby"));
fbSpool.setSpl_a_modifieddate(rs.getDate("spl_a_modifieddate"));
fbSpool.setKtn(rs.getInt ("ktn"));
fbSpool.setKco(rs.getInt ("kco"));
fbSpool.setIso_num(rs.getString("iso_num"));
fbSpool.setSpl_num(rs.getString("spl_num"));
return fbSpool;
}
}
/***************************FB_PIPEDIAM***************************/
class FbPipediamMapper implements RowMapper<FbPipediam> {
public FbPipediam mapRow(ResultSet rs, int rowNum) throws SQLException {
FbPipediam fbPipediam = new FbPipediam();
fbPipediam.setId(rs.getString("id"));
fbPipediam.setPdr_a_createdby(rs.getString("pdr_a_createdby"));
fbPipediam.setPdr_a_createddate(rs.getDate("pdr_a_createddate"));
fbPipediam.setPdr_a_modifiedby(rs.getString("pdr_a_modifiedby"));
fbPipediam.setPdr_a_modifieddate(rs.getDate("pdr_a_modifieddate"));
fbPipediam.setKtn(rs.getInt ("ktn"));
fbPipediam.setPdr_size(rs.getString("pdr_size"));
fbPipediam.setPdr_desc(rs.getString("pdr_desc"));
fbPipediam.setPdr_nb(rs.getDouble("pdr_nb"));
return fbPipediam;
}
}
/***************************FB_FITTING***************************/
class FbFittingMapper implements RowMapper<FbFitting> {
public FbFitting mapRow(ResultSet rs, int rowNum) throws SQLException {
FbFitting fbFitting = new FbFitting();
fbFitting.setId(rs.getString("id"));
fbFitting.setFit_a_createdby(rs.getString("fit_a_createdby"));
fbFitting.setFit_a_createddate(rs.getDate("fit_a_createddate"));
fbFitting.setFit_a_modifiedby(rs.getString("fit_a_modifiedby"));
fbFitting.setFit_a_modifieddate(rs.getDate("fit_a_modifieddate"));
fbFitting.setKtn(rs.getInt ("ktn"));
fbFitting.setFit_code(rs.getString("fit_code"));
fbFitting.setFit_name(rs.getString("fit_name"));
return fbFitting;
}
}
/***************************CJ_CONTRACT***************************/
class CjContractMapper implements RowMapper<CjContract> {
public CjContract mapRow(ResultSet rs, int rowNum) throws SQLException {
CjContract cjContract = new CjContract();
cjContract.setId(rs.getString("id"));
cjContract.setCon_a_createdby(rs.getString("con_a_createdby"));
cjContract.setCon_a_createddate(rs.getDate("con_a_createddate"));
cjContract.setCon_a_modifiedby(rs.getString("con_a_modifiedby"));
cjContract.setCon_a_modifieddate(rs.getDate("con_a_modifieddate"));
cjContract.setKtn(rs.getInt ("ktn"));
cjContract.setKco(rs.getInt ("kco"));
cjContract.setCon_num(rs.getString("con_num"));
cjContract.setCon_name(rs.getString("con_name"));
return cjContract;
}
}
/***************************CJ_JOB***************************/
class CjJobMapper implements RowMapper<CjJob> {
public CjJob mapRow(ResultSet rs, int rowNum) throws SQLException {
CjJob cjJob = new CjJob();
cjJob.setId(rs.getString("id"));
cjJob.setJob_a_createdby(rs.getString("job_a_createdby"));
cjJob.setJob_a_createddate(rs.getDate("job_a_createddate"));
cjJob.setJob_a_modifiedby(rs.getString("job_a_modifiedby"));
cjJob.setJob_a_modifieddate(rs.getDate("job_a_modifieddate"));
cjJob.setKtn(rs.getInt ("ktn"));
cjJob.setKco(rs.getInt ("kco"));
cjJob.setCon_num(rs.getString("con_num"));
cjJob.setJob_num(rs.getString("job_num"));
cjJob.setJob_name(rs.getString("job_name"));
return cjJob;
}
}
/***************************TN_TENANT***************************/
class TnTenantMapper implements RowMapper<TnTenant> {
public TnTenant mapRow(ResultSet rs, int rowNum) throws SQLException {
TnTenant tnTenant = new TnTenant();
tnTenant.setId(rs.getString("id"));
tnTenant.setTnt_a_createdby(rs.getString("tnt_a_createdby"));
tnTenant.setTnt_a_createddate(rs.getDate("tnt_a_createddate"));
tnTenant.setTnt_a_modifiedby(rs.getString("tnt_a_modifiedby"));
tnTenant.setTnt_a_modifieddate(rs.getDate("tnt_a_modifieddate"));
tnTenant.setKtn(rs.getInt ("ktn"));
tnTenant.setTnt_name(rs.getString("tnt_name"));
return tnTenant;
}
}
/***************************TN_COMPANY***************************/
class TnCompanyMapper implements RowMapper<TnCompany> {
public TnCompany mapRow(ResultSet rs, int rowNum) throws SQLException {
TnCompany tnCompany = new TnCompany();
tnCompany.setId(rs.getString("id"));
tnCompany.setTco_a_createdby(rs.getString("tco_a_createdby"));
tnCompany.setTco_a_createddate(rs.getDate("tco_a_createddate"));
tnCompany.setTco_a_modifiedby(rs.getString("tco_a_modifiedby"));
tnCompany.setTco_a_modifieddate(rs.getDate("tco_a_modifieddate"));
tnCompany.setKtn(rs.getInt ("ktn"));
tnCompany.setKco(rs.getInt ("kco"));
tnCompany.setTco_name(rs.getString("tco_name"));
return tnCompany;
}
}
/***************************SY_SECFIELD***************************/
class SySecfieldMapper implements RowMapper<SySecfield> {
public SySecfield mapRow(ResultSet rs, int rowNum) throws SQLException {
SySecfield sySecfield = new SySecfield();
sySecfield.setId(rs.getString("id"));
sySecfield.setSfd_a_createdby(rs.getString("sfd_a_createdby"));
sySecfield.setSfd_a_createddate(rs.getDate("sfd_a_createddate"));
sySecfield.setSfd_a_modifiedby(rs.getString("sfd_a_modifiedby"));
sySecfield.setSfd_a_modifieddate(rs.getDate("sfd_a_modifieddate"));
sySecfield.setStn_code(rs.getString("stn_code"));
sySecfield.setSfd_wrap(rs.getString("sfd_wrap"));
sySecfield.setSfd_width(rs.getInt ("sfd_width"));
sySecfield.setSfd_visible(rs.getBoolean("sfd_visible"));
sySecfield.setSfd_value(rs.getString("sfd_value"));
sySecfield.setSfd_valid(rs.getString("sfd_valid"));
sySecfield.setSfd_update(rs.getBoolean("sfd_update"));
sySecfield.setSfd_tooltip(rs.getString("sfd_tooltip"));
sySecfield.setSfd_tab(rs.getString("sfd_tab"));
sySecfield.setSfd_src(rs.getString("sfd_src"));
sySecfield.setSfd_sort(rs.getInt ("sfd_sort"));
sySecfield.setSfd_seq(rs.getInt ("sfd_seq"));
sySecfield.setSfd_rows(rs.getInt ("sfd_rows"));
sySecfield.setSfd_required(rs.getString("sfd_required"));
sySecfield.setSfd_readonly(rs.getString("sfd_readonly"));
sySecfield.setSfd_range_step(rs.getInt ("sfd_range_step"));
sySecfield.setSfd_range_num(rs.getInt ("sfd_range_num"));
sySecfield.setSfd_range_min(rs.getInt ("sfd_range_min"));
sySecfield.setSfd_range_max(rs.getInt ("sfd_range_max"));
sySecfield.setSfd_progress_value(rs.getInt ("sfd_progress_value"));
sySecfield.setSfd_progress_max(rs.getInt ("sfd_progress_max"));
sySecfield.setSfd_placeholder(rs.getString("sfd_placeholder"));
sySecfield.setSfd_param(rs.getString("sfd_param"));
sySecfield.setSfd_options(rs.getString("sfd_options"));
sySecfield.setSfd_onok(rs.getString("sfd_onok"));
sySecfield.setSfd_onchange(rs.getString("sfd_onchange"));
sySecfield.setSfd_onblur(rs.getString("sfd_onblur"));
sySecfield.setSfd_name(rs.getString("sfd_name"));
sySecfield.setSfd_maxlength(rs.getInt ("sfd_maxlength"));
sySecfield.setSfd_lspan(rs.getInt ("sfd_lspan"));
sySecfield.setSfd_lclass(rs.getString("sfd_lclass"));
sySecfield.setSfd_label(rs.getString("sfd_label"));
sySecfield.setSfd_input_type(rs.getString("sfd_input_type"));
sySecfield.setSfd_img_src(rs.getString("sfd_img_src"));
sySecfield.setSfd_id(rs.getString("sfd_id"));
sySecfield.setSfd_hide(rs.getBoolean("sfd_hide"));
sySecfield.setSfd_height(rs.getInt ("sfd_height"));
sySecfield.setSfd_generate(rs.getString("sfd_generate"));
sySecfield.setSfd_format(rs.getString("sfd_format"));
sySecfield.setSfd_form(rs.getString("sfd_form"));
sySecfield.setSfd_disabled(rs.getString("sfd_disabled"));
sySecfield.setSfd_default(rs.getString("sfd_default"));
sySecfield.setSfd_column(rs.getInt ("sfd_column"));
sySecfield.setSfd_code(rs.getString("sfd_code"));
sySecfield.setSfd_class(rs.getString("sfd_class"));
sySecfield.setSfd_calc(rs.getString("sfd_calc"));
sySecfield.setSfd_build(rs.getString("sfd_build"));
sySecfield.setSfd_autofocus(rs.getString("sfd_autofocus"));
sySecfield.setSfd_autocomplete(rs.getString("sfd_autocomplete"));
sySecfield.setSfd_append(rs.getInt ("sfd_append"));
sySecfield.setSfd_align(rs.getString("sfd_align"));
sySecfield.setSfd_addblank(rs.getBoolean("sfd_addblank"));
sySecfield.setSfd_add(rs.getBoolean("sfd_add"));
sySecfield.setMf_function(rs.getString("mf_function"));
sySecfield.setKtn(rs.getInt ("ktn"));
sySecfield.setSfd_size(rs.getInt ("sfd_size"));
return sySecfield;
}
}
/***************************SY_SECTION***************************/
class SySectionMapper implements RowMapper<SySection> {
public SySection mapRow(ResultSet rs, int rowNum) throws SQLException {
SySection sySection = new SySection();
sySection.setId(rs.getString("id"));
sySection.setStn_a_createdby(rs.getString("stn_a_createdby"));
sySection.setStn_a_createddate(rs.getDate("stn_a_createddate"));
sySection.setStn_a_modifiedby(rs.getString("stn_a_modifiedby"));
sySection.setStn_a_modifieddate(rs.getDate("stn_a_modifieddate"));
sySection.setStn_code(rs.getString("stn_code"));
sySection.setMf_function(rs.getString("mf_function"));
sySection.setStn_hservice(rs.getString("stn_hservice"));
sySection.setStn_bservice(rs.getString("stn_bservice"));
sySection.setStn_brows(rs.getInt ("stn_brows"));
sySection.setStn_btitle(rs.getString("stn_btitle"));
sySection.setStn_form(rs.getString("stn_form"));
sySection.setStn_form_method(rs.getString("stn_form_method"));
sySection.setStn_script(rs.getString("stn_script"));
sySection.setKtn(rs.getInt ("ktn"));
sySection.setStn_form_action(rs.getString("stn_form_action"));
return sySection;
}
}