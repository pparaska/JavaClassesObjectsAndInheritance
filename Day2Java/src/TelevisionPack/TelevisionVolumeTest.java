package TelevisionPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelevisionVolumeTest {

	@Test
	public void testForGetVolumeWhenStateIsOff() {
		TelevisionClass television = new TelevisionClass();
		boolean state1 = television.setState(false);
		int expextedVolume = television.changeVolume(2);
		int actualVolume = television.getVolume();
		assertEquals(expextedVolume, actualVolume);
	}

	@Test
	public void testForChangeVolumeWhenStateIsOn() {
		TelevisionClass television = new TelevisionClass();
		boolean state1 = television.setState(true);
		int expextedVolume = television.changeVolume(10);
		int actualVolume = television.getVolume();
		assertEquals(expextedVolume, actualVolume);

	}
}
