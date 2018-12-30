package com.bankAccount;

public abstract class SavingsAccount extends BankAccount {

	private boolean isSalaried;

	public SavingsAccount(String accountHolderName, double accountBalance,
			boolean isSalaried) {
		super(accountHolderName, accountBalance);
		this.isSalaried = isSalaried;
	}

	private static final double minimumBalance = 0;

	public boolean isSalaried() {
		return isSalaried;
	}

	public static double getMinimumbalance() {
		return minimumBalance;
	}

	@Override
	public abstract void withdraw(double amount) throws Exception;

	@Override
	public String toString() {
		return "SavingsAccount [isSalaried=" + isSalaried + ", toString()="
				+ super.toString() + "]";
	}

}
