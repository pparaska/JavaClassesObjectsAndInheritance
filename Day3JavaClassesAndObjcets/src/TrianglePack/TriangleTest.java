package TrianglePack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	private Triangle triangle;
	private Triangle triangle2;
	private Triangle triangle3;
	private Triangle triangle4;

	@Test
	public void testForRightAngleTriangle() {
		triangle = new Triangle(3, 4, 5);
		boolean actual = triangle.isRightAngleTriangle();
		assertEquals(true, actual);
	}

	@Test
	public void testForScaleneTriangle() {
		triangle2 = new Triangle(3, 5, 7);
		boolean actual = triangle2.isScaleneTriangle();
		assertEquals(true, actual);
	}

	@Test
	public void testForIsoscelesTriangle() {
		triangle3 = new Triangle(10, 10, 20);
		boolean actual = triangle3.isIsoscelesTriangle();
		assertEquals(true, actual);
	}

	@Test
	public void testForEquilateralTriangle() {
		triangle4 = new Triangle(10, 10, 10);
		boolean actual = triangle4.isEquilateralTriangle();
		assertEquals(true, actual);
	}
}
