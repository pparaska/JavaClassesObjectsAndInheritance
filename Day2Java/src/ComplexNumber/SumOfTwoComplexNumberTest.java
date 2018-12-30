package ComplexNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SumOfTwoComplexNumberTest {

	private ComplexNumber complexNumber1;
	private ComplexNumber complexNumber2;
	private ComplexNumber complexNumber3;

	@Before
	public void setUp() {
		complexNumber1 = new ComplexNumber();
		complexNumber2 = new ComplexNumber();
		complexNumber3 = new ComplexNumber();
	}

	@Test
	public void testForAdditionOfTwoPositiveRealNumbers() {
		complexNumber1.set(10f, 20f);
		complexNumber2.set(20f, 3f);
		complexNumber3.addComplexNumber(complexNumber1, complexNumber2);
		assertEquals(30, complexNumber3.getReal(), 0);
	}

	@Test
	public void testForAdditionOfTwoPositiveImaginaryNumbers() {
		complexNumber1.set(20f, 20f);
		complexNumber2.set(20f, 3f);
		complexNumber3.addComplexNumber(complexNumber1, complexNumber2);
		assertEquals(23, complexNumber3.getImaginary(), 0);
	}

	@Test
	public void testForAdditionOfOnePositiveAndOneNegativeRealNumber() {
		complexNumber1.set(-10f, 20f);
		complexNumber2.set(20f, 3f);
		complexNumber3.addComplexNumber(complexNumber1, complexNumber2);
		assertEquals(10, complexNumber3.getReal(), 0);
	}

	@Test
	public void testForAdditionOfOnePositiveAndOneNegativeImaginaryNumber() {
		complexNumber1.set(10f, -10f);
		complexNumber2.set(20f, 3f);
		complexNumber3.addComplexNumber(complexNumber1, complexNumber2);
		assertEquals(-7, complexNumber3.getImaginary(), 0);
	}

	@Test
	public void testToCheckDisplayMethod() {
		complexNumber1.set(10f, 20f);
		complexNumber2.set(20f, 3f);
		complexNumber3.addComplexNumber(complexNumber1, complexNumber2);
		String actualString = complexNumber3.toString();
		String expectedString = "ComplexNumber [real=30.0, imaginary=23.0]";
		assertEquals(expectedString, actualString);
	}
}
