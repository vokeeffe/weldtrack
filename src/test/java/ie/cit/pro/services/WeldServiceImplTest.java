package ie.cit.pro.services;

import static org.junit.Assert.*;

import ie.cit.pro.domain.dao.DataRepository;
import ie.cit.pro.domain.fb.FbWeld;
import ie.cit.pro.services.FbServiceImpl;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.stub;

public class WeldServiceImplTest {

	private FbServiceImpl tested;
	private DataRepository weldRepository;

	@Before
	public void setup() {
		weldRepository = Mockito.mock(DataRepository.class);
		tested = new FbServiceImpl(weldRepository);
	}

	@Test
	public void testCreateWeld() {
		FbWeld weld = new FbWeld();
/*		weld.setIsonum("1001");
		weld.setSpoolnum("1");
		weld.setWeldnum("1");
		weld.setFw(false);
		weld.setType("butt");

		FbWeld createNewWeld = tested.createFbWeld(weld);
		Mockito.verify(weldRepository).add(createNewWeld);
		assertThat(createNewWeld.getIsonum(), CoreMatchers.equalTo("1001"));*/
	}

	@Test
	public void testGet() {
		FbWeld weld = new FbWeld();
		String id = weld.getId();

/*		stub(weldRepository.findById(null)).toReturn(weld);

		FbWeld createNewWeld = tested.createFbWeld(weld);
		createNewWeld = tested.getFbWeld(weld.getId());
		Mockito.verify(weldRepository).findById(null);
		assertThat(createNewWeld.getId(), CoreMatchers.equalTo(id));*/

	}

}
