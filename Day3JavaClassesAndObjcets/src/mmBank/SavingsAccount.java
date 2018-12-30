package mmBank;

public class SavingsAccount {
	private String name;
	private double balance;
	private double accountNumber;
	private static double accountId;
	
	static{
		accountId=100000;
	}
	{
		accountNumber=++accountId;
	}
	
	public SavingsAccount(String name, double initialBalance) {
		super();
		this.name = name;
		this.balance = initialBalance;
	}
	
	public double withdraw(double amount){
		if(balance>=amount)
			balance-=amount;
		else
			this.balance=this.balance;
		return this.balance;
	}
	
	public double deposit(double amount){
		if(amount>0){
			balance+=amount;
		}
			else
				this.balance=this.balance;
		return this.balance;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "SavingsAccount [name=" + name + ", balance=" + balance
				+ ", accountNumber=" + accountNumber + "]";
	}
	
	
	
	

}
