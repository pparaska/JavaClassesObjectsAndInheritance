package RectanglePack;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerimeterTest {

	public void TestForPositiveLengthAndPositiveWidth() {
		Rectangle rectangle = new Rectangle(20, 10);
		int perimeter = rectangle.perimeterOfRectangle();
		assertEquals(60, perimeter);
	}

	@Test
	public void TestForNegativeLengthAndNegativeWidth() {
		Rectangle rectangle = new Rectangle(-20, -10);
		int perimeter = rectangle.perimeterOfRectangle();
		assertEquals(0, perimeter);
	}
}
