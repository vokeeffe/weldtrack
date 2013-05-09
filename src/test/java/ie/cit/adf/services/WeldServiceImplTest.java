package ie.cit.adf.services;

import static org.junit.Assert.*;
import ie.cit.adf.domain.Weld;
import ie.cit.adf.domain.dao.WeldRepository;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class WeldServiceImplTest {

	private WeldServiceImpl tested;
	private WeldRepository weldRepository;

	@Before
	public void setup(){
		weldRepository = Mockito.mock(WeldRepository.class);
		tested = new WeldServiceImpl(weldRepository);
	}
	
	@Test
	public void testCreateWeld() {
		Weld createNewWeld = tested.createNewWeld("TESTISO");
		Mockito.verify(weldRepository).add(createNewWeld);
		assertThat(createNewWeld.getIsonum(), CoreMatchers.equalTo("TESTISO"));
	}

}
