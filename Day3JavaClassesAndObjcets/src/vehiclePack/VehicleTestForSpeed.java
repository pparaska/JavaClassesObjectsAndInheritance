package vehiclePack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTestForSpeed {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPositiveSpeed() {

		Vehicle Baleno = new Vehicle("Poonam");
		Baleno.changeSpeed(50);
		assertEquals(50, Baleno.getCurrentSpeed());

	}

	@Test
	public void testNegativeSpeed() {

		Vehicle Baleno = new Vehicle("Poonam");
		Baleno.changeSpeed(-50);
		assertEquals(0, Baleno.getCurrentSpeed());

	}
}