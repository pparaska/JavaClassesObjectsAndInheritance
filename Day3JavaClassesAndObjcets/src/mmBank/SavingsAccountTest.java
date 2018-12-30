package mmBank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SavingsAccountTest {

	@Test
	public void testForWithdrawMethodWhenAmountLessThanAccountBalance() {
		SavingsAccount bankAccount = new SavingsAccount("Poonam", 10000);
		double actual=bankAccount.withdraw(5000);
		double expected = 5000;
		assertEquals(expected, actual,0.0);
		System.out.println(bankAccount.toString());
	}
	
	@Test
	public void testForWithdrawMethodWhenAmountGreaterThanAccountBalance() {
		SavingsAccount bankAccount = new SavingsAccount("Punam", 1000);
		double actual=bankAccount.withdraw(1500);
		double expected =1000;
		System.out.println(bankAccount.toString());
		assertEquals(expected, actual,0.0);
	}
	
	@Test
	public void testForDepositMethodWhenAmountGreaterThanZero() {
		SavingsAccount bankAccount = new SavingsAccount("Jack", 1000);
		double actual=bankAccount.deposit(500);
		double expected = 1500;
		assertEquals(expected, actual,0.0);
		System.out.println(bankAccount.toString());
	}
	

	@Test
	public void testForDepositMethodWhenAmountLessThanZero() {
		SavingsAccount bankAccount = new SavingsAccount("Mia", 1000);
		double actual=bankAccount.deposit(-500);
		double expected = 1000;
		assertEquals(expected, actual,0.0);
		System.out.println(bankAccount.toString());
		
	}

}
