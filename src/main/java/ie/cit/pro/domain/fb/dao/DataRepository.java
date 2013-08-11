package ie.cit.pro.domain.fb.dao;

import ie.cit.pro.domain.fb.Weld;
import ie.cit.pro.domain.fb.WeldType;
import java.util.List;

public interface DataRepository {
	
	Weld findById(Weld weld);
	WeldType findById(WeldType weldType);

	List<Weld> getAllWelds();
	List<WeldType> getAllWeldTypes();

	void add(Weld weld);

	void delete(String weldId);

	void update(Weld weld);

}

