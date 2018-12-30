package DistancePack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DisatanceTest {
	private Distance distance1;
	private Distance distance2;
	private Distance distance3;

	@Before
	public void setUp() {
		distance1 = new Distance();
		distance2 = new Distance();
		distance3 = new Distance();

	}

	@Test
	public void testForAdditionOfDistancesOfFeets() {
		distance1.set(1, 1.2f);
		distance2.set(2, 2.3f);
		distance3.addDistances(distance1, distance2);
		assertEquals(3, distance3.getFeet(), 0);
	}

	@Test
	public void testForAdditionOfDistancesOfInches() {
		distance1.set(1, 1.2f);
		distance2.set(2, 2.3f);
		distance3.addDistances(distance1, distance2);
		assertEquals(3.5f, distance3.getInches(), 0);
	}

	@Test
	public void testToCheckDisplayMethod() {
		distance1.set(1, 1.2f);
		distance2.set(2, 2.3f);
		distance3.addDistances(distance1, distance2);
		String actualString = distance3.toString();
		String expectedString = "Distance [feet=3, inches=3.5]";
		assertEquals(expectedString, actualString);
	}
}
