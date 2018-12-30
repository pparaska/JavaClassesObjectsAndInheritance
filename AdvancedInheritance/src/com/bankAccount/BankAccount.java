package com.bankAccount;

public abstract class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	protected double accountBalance;
	private static int accountId=0;

	{
		accountNumber = ++accountId;
	}

	public BankAccount(String accountHolderName,
			double accountBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public double getAccountBalance() {
		return accountBalance;
	}

	public abstract void withdraw(double amount)throws Exception;

	public void deposit(double amount) throws Exception {
		if (amount<=0) {
			throw new InvalidInputException("Invalid Input");
		} else
			accountBalance = accountBalance+amount;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}

	
		
	}


