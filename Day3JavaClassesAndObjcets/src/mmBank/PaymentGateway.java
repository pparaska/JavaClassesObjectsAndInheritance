package mmBank;

public class PaymentGateway {

	public static boolean transfer(SavingsAccount sender,
			SavingsAccount reciever, double amount) {
		if (sender.getBalance() >= amount) {
			sender.withdraw(amount);
			reciever.deposit(amount);
			return true;

		} else
			return false;
	}
}
