package ie.cit.pro.domain.dao;

import ie.cit.pro.domain.fb.Weld;
import ie.cit.pro.domain.fb.WeldType;
import ie.cit.pro.domain.sy.SySecfield;
import ie.cit.pro.domain.sy.SySection;
import java.util.List;

public interface DataRepository {
	
	Weld findById(Weld weld);
	WeldType findById(WeldType weldType);

	List<Weld> getAllWelds();
	List<WeldType> getAllWeldTypes();

	void add(Weld weld);
	void delete(Weld weld);
	void update(Weld weld);

	SySecfield findById(SySecfield sySecfield);
	void add(SySecfield sySecfield);
	void delete(SySecfield sySecfield);
	void update(SySecfield sySecfield);
	
	SySection findById(SySection sySection);
	void add(SySection sySection);
	void delete(SySection sySection);
	void update(SySection sySection);
	
}

