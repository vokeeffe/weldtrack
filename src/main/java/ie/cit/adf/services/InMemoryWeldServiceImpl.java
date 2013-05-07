package ie.cit.adf.services;

import ie.cit.adf.domain.Weld;

import java.util.ArrayList;
import java.util.List;

public class InMemoryWeldServiceImpl implements WeldService {

	private List<Weld> welds = new ArrayList<Weld>();
	
	public InMemoryWeldServiceImpl(){
		
	}
	
	public List<Weld> getAllWelds() {
		// TODO Auto-generated method stub
		return welds;
	}

	public void createNewWeld(String isonum){
		System.out.println("About to create weld with isonum: " + isonum);
		Weld weld = new Weld();
		weld.setType("butt");
		weld.setFitting1("1"); //Pipe
		weld.setFitting2("2"); //90 Elbow
		weld.setFw(false); //shop weld
		weld.setIsonum(isonum); //Isometric Number 
		weld.setSpoolnum("1");
		weld.setWeldnum("1");
		welds.add(weld);//Add the weld to the Array
	}
}
