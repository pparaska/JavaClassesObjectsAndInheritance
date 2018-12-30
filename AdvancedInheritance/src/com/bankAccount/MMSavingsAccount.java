package com.bankAccount;

public class MMSavingsAccount extends SavingsAccount {

	
	private static final double minimumBalance=0;

	public static double getMinimumbalance() {
		return minimumBalance;
	}
	public MMSavingsAccount(String accountHolderName,
			double accountBalance, boolean isSalaried) {
		super(accountHolderName, accountBalance, isSalaried);
	}
	
	@Override
	public void withdraw(double amount) throws Exception{
		if(amount <= 0){
			throw new InvalidInputException("Invalid Input");
		}
		else if(amount > accountBalance){
			throw new InsufficientFundsException("InsufficientFunds");
		}
		else
			accountBalance=accountBalance-amount;
		
	}
	@Override
	public String toString() {
		return "MMSavingsAccount [isSalaried()=" + isSalaried()
				+ ", toString()=" + super.toString()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountBalance()=" + getAccountBalance() + "]";
	}
	
	
}
