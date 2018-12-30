package TimePack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SumOFTwoTimesTest {
	private Time time1;
	private Time time2;
	private Time time3;

	@Before
	public void setUp() {
		time1 = new Time();
		time2 = new Time();
		time3 = new Time();
	}

	@Test
	public void testForSumOfHours() {
		time1.set(5, 30);
		time2.set(7, 40);
		time3.sum(time1, time2);
		assertEquals(13, time3.getHour(), 0);
	}

	@Test
	public void testForSumOfMinutes() {
		time1.set(5, 70);
		time2.set(7, 20);
		time3.sum(time1, time2);
		assertEquals(30, time3.getMinute(), 0);
	}

	@Test
	public void testToCheckDisplayMethod() {
		time1.set(5, 70);
		time2.set(7, 20);
		time3.sum(time1, time2);
		String actual = time3.toString();
		String expected = "Time [hours=13, minutes=30]";
		assertEquals(actual, expected);

	}
}
