package ie.cit.pro.services;

import java.util.List;

import ie.cit.pro.domain.fb.FbDomainObject;
import ie.cit.pro.domain.fb.FbFitting;
import ie.cit.pro.domain.fb.FbIsometric;
import ie.cit.pro.domain.fb.FbPipediam;
import ie.cit.pro.domain.fb.FbSpool;
import ie.cit.pro.domain.fb.FbWeld;
import ie.cit.pro.domain.fb.FbWeldType;
import ie.cit.pro.domain.fb.FbWelder;

public interface FbService {
	
	/***************************FB_DOMAINOBJECT***************************/
	List<? extends FbDomainObject> getAllFbDomainObjects();
	/*FbDomainObject getFbDomainObject(String id);	
	setSuperClassList(List<? extends Superclass>)
	List<? extends FbDomainObject>  getFbDomainObjects(List<? extends FbDomainObject> fbDomainObjects);
	FbWeldType createFbWeldType(FbWeldType fbWeldType);
	void deleteFbWeldType(String id);
	void updateFbWeldType(FbWeldType fbWeldType);*/
	String getFbDomainObject();
	void setFbDomainObject(String fbDomainObject);

	/***************************FB_WELDTYPE***************************/
	FbWeldType getFbWeldType(String id);
	List<FbWeldType> getAllFbWeldTypes();
	FbWeldType createFbWeldType(FbWeldType fbWeldType);
	void deleteFbWeldType(String id);
	void updateFbWeldType(FbWeldType fbWeldType);
	/***************************FB_WELD***************************/
	FbWeld getFbWeld(String id);
	List<FbWeld> getAllFbWelds();
	//List<FbWeld> getFbObjects(List<FbWeld> fbWelds);
	FbWeld createFbWeld(FbWeld fbWeld);
	void deleteFbWeld(String id);
	void updateFbWeld(FbWeld fbWeld);
	/***************************FB_WELDER***************************/
	FbWelder getFbWelder(String id);
	List<FbWelder> getAllFbWelders();
	FbWelder createFbWelder(FbWelder fbWelder);
	void deleteFbWelder(String id);
	void updateFbWelder(FbWelder fbWelder);
	/***************************FB_ISOMETRIC***************************/
	FbIsometric getFbIsometric(String id);
	List<FbIsometric> getAllFbIsometrics();
	FbIsometric createFbIsometric(FbIsometric fbIsometric);
	void deleteFbIsometric(String id);
	void updateFbIsometric(FbIsometric fbIsometric);
	/***************************FB_SPOOL***************************/
	FbSpool getFbSpool(String id);
	List<FbSpool> getAllFbSpools();
	FbSpool createFbSpool(FbSpool fbSpool);
	void deleteFbSpool(String id);
	void updateFbSpool(FbSpool fbSpool);
	/***************************FB_PIPEDIAM***************************/
	FbPipediam getFbPipediam(String id);
	List<FbPipediam> getAllFbPipediams();
	FbPipediam createFbPipediam(FbPipediam fbPipediam);
	void deleteFbPipediam(String id);
	void updateFbPipediam(FbPipediam fbPipediam);
	/***************************FB_FITTING***************************/
	FbFitting getFbFitting(String id);
	List<FbFitting> getAllFbFittings();
	FbFitting createFbFitting(FbFitting fbFitting);
	void deleteFbFitting(String id);
	void updateFbFitting(FbFitting fbFitting);
	
}
