package com.bankAccount;

public class MMCurrentAccount extends CurrentAccount {
	
	public MMCurrentAccount(String accountHolderName,
			double accountBalance, double creditLimit) {
		super(accountHolderName, accountBalance, creditLimit);
	}

	@Override
	public void withdraw(double amount)throws Exception {
		if(amount<=accountBalance+creditLimit && amount>0){
			accountBalance=accountBalance-amount;
		} else if(amount<=0){
			throw new InvalidInputException("Invalid Input");
		}else if(amount>accountBalance+creditLimit){
			throw new InsufficientFundsException("Insufficient Funds");
		}
		
	}

	@Override
	public String toString() {
		return "MMCurrentAccount [getCreditLimit()=" + getCreditLimit()
				+ ", toString()=" + super.toString()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountBalance()=" + getAccountBalance() + "]";
	}




	
	
}
