package mmBank;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForFundTransfer {

	@Test
	public void testForFundTransferIfAmountisLessThanAccountBalance() {
		SavingsAccount poonam=new SavingsAccount("Poonam", 9000);
		SavingsAccount archana=new SavingsAccount("Archana", 6000);
		PaymentGateway.transfer(poonam, archana, 5000);
		poonam.withdraw(5000);
		assertEquals(4000,poonam.getBalance(),2);
		
		
	}
	
	@Test
	public void testForFundTransferIfAmountisGreaterThanAccountBalance() {
		SavingsAccount poonam=new SavingsAccount("Poonam", 9000);
		SavingsAccount archana=new SavingsAccount("Archana", 6000);
		PaymentGateway.transfer(poonam, archana, 10000);
		poonam.withdraw(10000);
		assertEquals(9000,poonam.getBalance(),2);
		
		
	}

}
