package com.bankAccount;

public abstract class BankFactory {
 
	public abstract SavingsAccount getNewSavingsAccount(String accountHolderName,
			double accountBalance, boolean isSalaried);
	
	
	public abstract CurrentAccount getNewCurrentAccount(String accountHolderName,
			double accountBalance, double creditLimit);
}
