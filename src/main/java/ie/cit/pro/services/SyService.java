package ie.cit.pro.services;

import java.util.List;

import ie.cit.pro.domain.sy.SySecfield;
import ie.cit.pro.domain.sy.SySection;

public interface SyService {

	/***************************SY_SECFIELD***************************/
	SySecfield getSySecfield(String id);
	List<SySecfield> getAllSySecfields();
	SySecfield createSySecfield(SySecfield sySecfield);
	void deleteSySecfield(String id);
	void updateSySecfield(SySecfield sySecfield);
	List<SySecfield> getSySecfieldsByCode(List<SySecfield> sySecfields);
	
	/***************************SY_SECTION***************************/
	SySection getSySection(String id);
	List<SySection> getAllSySections();
	SySection createSySection(SySection sySection);
	void deleteSySection(String id);
	void updateSySection(SySection sySection);
	List<SySection> getSySectionsByCode(List<SySection> sySections);
	
}
