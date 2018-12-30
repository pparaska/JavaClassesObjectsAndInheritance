package RectanglePack;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaTest {

	@Test
	public void TestForPositiveLengthAndPositiveWidth() {
		Rectangle rectangle = new Rectangle(20, 10);
		int area = rectangle.areaOfRectangle();
		assertEquals(200, area);
	}

	@Test
	public void TestForPositiveLengthAndNegativeWidth() {
		Rectangle rectangle = new Rectangle(20, -10);
		int area = rectangle.areaOfRectangle();
		assertEquals(0, area);
	}

	@Test
	public void TestForPositiveWidthAndNegativeLength() {
		Rectangle rectangle = new Rectangle(-20, 10);
		int area = rectangle.areaOfRectangle();
		assertEquals(0, area);
	}

	@Test
	public void TestForNegativeLengthAndNegativeBreadth() {
		Rectangle rectangle = new Rectangle(-20, -10);
		int area = rectangle.areaOfRectangle();
		assertEquals(0, area);

	}
}