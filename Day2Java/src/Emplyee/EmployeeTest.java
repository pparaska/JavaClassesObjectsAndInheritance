package Emplyee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	private Employee employee;

	@Before
	public void setUp() {
		employee = new Employee(1, "Poonam", 10000);
		employee.setPfRate(10);
	}

	@Test
	public void testForAnnualBasic() {
		double annualBasic = employee.annualBasic();
		assertEquals(120000, annualBasic,2);
	}

	@Test
	public void testFormonthlyGrossSalary() {
		double monthlyGrossSalary = employee.monthlyGrossSalary();
		assertEquals(17050, monthlyGrossSalary, 2);
	}

	@Test
	public void testForAnnualGrossSalary() {
		double annualGrossSalary = employee.annualGrossSalary();
		assertEquals(204600, annualGrossSalary, 2);
	}

	@Test
	public void testForMonthlyDeductions() {
		double MonthlyDeductions = employee.monthlyDeductions();
		assertEquals(6600, MonthlyDeductions, 2);
	}

	@Test
	public void testForMonthlyTakeHome() {
		double monthlyTakeHome = employee.monthlyTakeHome();
		assertEquals(10450, monthlyTakeHome, 2);
	}

	@Test
	public void testForAnnualTakeHome() {
		double annualTakeHome = employee.annualTakeHome();
		assertEquals(125400, annualTakeHome, 2);
	}

}