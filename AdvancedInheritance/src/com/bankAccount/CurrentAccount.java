package com.bankAccount;

public abstract class CurrentAccount extends BankAccount {

	protected final double creditLimit;

	public CurrentAccount(String accountHolderName, double accountBalance,
			double creditLimit) {
		super(accountHolderName, accountBalance);
		this.creditLimit = creditLimit;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	@Override
	public abstract void withdraw(double amount) throws Exception;

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + " , toString()="
				+ super.toString() + "]";
	}

}
