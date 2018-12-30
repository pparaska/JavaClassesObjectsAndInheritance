package basicInheritance;

public class Static1 {
	private static double minimumAccBalance = 1000;
	private static String bankName = "SBI";
	private double accountBalance = 2000;

	public double withdraw(int amount) {
		accountBalance -= amount;
		return accountBalance;
	}

	public double deposit(int amount) {
		accountBalance += amount;
		return accountBalance;
	}

	public static double displayMinimumBalance() {
		double minBal = minimumAccBalance;
		return minBal;
	}

	public static String displayBankName() {
		String bname = bankName;
		return bname;

	}

	public static void main(String[] args) {
		Static1 first = new Static1();
		System.out.println(first.withdraw(500));
		System.out.println(first.deposit(200));
		System.out.println(Static1.displayMinimumBalance());
		System.out.println(Static1.displayBankName());

	}

}
