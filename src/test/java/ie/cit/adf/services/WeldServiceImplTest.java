package ie.cit.adf.services;

import static org.junit.Assert.*;

import ie.cit.pro.domain.Weld;
import ie.cit.pro.domain.dao.WeldRepository;
import ie.cit.pro.services.WeldServiceImpl;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.stub;

public class WeldServiceImplTest {

	private WeldServiceImpl tested;
	private WeldRepository weldRepository;

	@Before
	public void setup() {
		weldRepository = Mockito.mock(WeldRepository.class);
		tested = new WeldServiceImpl(weldRepository);
	}

	@Test
	public void testCreateWeld() {
		Weld weld = new Weld();
		weld.setIsonum("1001");
		weld.setSpoolnum("1");
		weld.setWeldnum("1");
		weld.setFw(false);
		weld.setType("butt");

		Weld createNewWeld = tested.createNewWeld(weld);
		Mockito.verify(weldRepository).add(createNewWeld);
		assertThat(createNewWeld.getIsonum(), CoreMatchers.equalTo("1001"));
	}

	@Test
	public void testGet() {
		Weld weld = new Weld();
		String id = weld.getId();

		stub(weldRepository.findById(weld.getId())).toReturn(weld);

		Weld createNewWeld = tested.createNewWeld(weld);
		createNewWeld = tested.get(weld.getId());
		Mockito.verify(weldRepository).findById(createNewWeld.getId());
		assertThat(createNewWeld.getId(), CoreMatchers.equalTo(id));

	}

}
