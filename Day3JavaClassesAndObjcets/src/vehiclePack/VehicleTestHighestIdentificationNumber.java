package vehiclePack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTestHighestIdentificationNumber {

	@Test
	public void testForHighestIdentificationNumber() {
	Vehicle vehicle1=new Vehicle("Poonam");
	Vehicle vehicle2=new Vehicle("Archana");
	Vehicle vehicle3=new Vehicle("Shital");
	Vehicle vehicle4=new Vehicle("Yash");
	Vehicle vehicle5=new Vehicle("Amir");
	Vehicle vehicle6=new Vehicle("Pratik");
	Vehicle vehicle7=new Vehicle();
	
	int actual= vehicle6.getHighestIdentificationNumber();
	assertEquals(7,actual);
	
	
	
	
	}

}
