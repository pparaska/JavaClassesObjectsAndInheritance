package RectanglePack;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class TwoRectanglesTest {

	@Test
	public void TestForTwoRecatngleWithSamePropertiesHaveSameArea() {
		Rectangle rectangle1 = new Rectangle(20, 10);
		Rectangle rectangle2 = new Rectangle(10, 20);
		int i = rectangle1.areaOfRectangle();
		int j = rectangle2.areaOfRectangle();
		assertTrue(i == j);
	}

	@Test
	public void TestForTwoRecatngleWithDifferentPropertiesHaveDifferentArea() {
		Rectangle rectangle1 = new Rectangle(20, 10);
		Rectangle rectangle2 = new Rectangle(30, 20);
		int i = rectangle1.areaOfRectangle();
		int j = rectangle2.areaOfRectangle();
		assertFalse(i == j);
	}

}
