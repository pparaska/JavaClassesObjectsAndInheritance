package vehiclePack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VehicleTestForDirection {
	private Vehicle vehicle1;

	@Before
	public void setUp()  {
		vehicle1 = new Vehicle();
	}

	@Test
	public void testToTurnLeft() {
		vehicle1.turn(45, Vehicle.TURN_LEFT);
		assertEquals(Vehicle.westDirection, vehicle1.getDirection());
	}

	@Test
	public void testToTurnRight() {
		vehicle1.turn(45, Vehicle.TURN_RIGHT);
		assertEquals(Vehicle.eastDirection, vehicle1.getDirection());

	}

	@Test
	public void testToTurnLeftRight() {
		vehicle1.turn(45, Vehicle.TURN_LEFT);
		vehicle1.turn(45, Vehicle.TURN_RIGHT);
		assertEquals(Vehicle.eastDirection, vehicle1.getDirection());

	}

	@Test
	public void testToTurnRightLeft() {
		vehicle1.turn(45, Vehicle.TURN_RIGHT);
		vehicle1.turn(45, Vehicle.TURN_LEFT);
		assertEquals(Vehicle.westDirection, vehicle1.getDirection());

	}
}
