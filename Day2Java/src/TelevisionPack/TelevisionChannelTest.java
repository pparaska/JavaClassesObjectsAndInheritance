package TelevisionPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelevisionChannelTest {

	@Test
	public void testForGetChannelWhenStateIsOff() {
		TelevisionClass television = new TelevisionClass();
		boolean st = television.setState(false);
		int expextedChannelNumber = television.changeChannel(5);
		int actualChannelNumber = television.getCurrentChannel();
		assertEquals(expextedChannelNumber, actualChannelNumber);

	}

	@Test
	public void testForChangeChannelWhenStateIsOn() {
		TelevisionClass television = new TelevisionClass();
		boolean st = television.setState(true);
		int expextedChannelNumber = television.changeChannel(10);
		int actualChannelNumber = television.getCurrentChannel();
		assertEquals(expextedChannelNumber, actualChannelNumber);
	}
}
