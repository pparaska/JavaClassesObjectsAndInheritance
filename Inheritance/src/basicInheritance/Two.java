package basicInheritance;

public class Two {

	public static void main(String[] args) {
		First first = new First(101, "Poonam", "Mumbai");
		First first1 = new First(102, "Raj", "Pune");
		First first2 = new First(103, "Ravi", "Goa");

		Second second = new Second("Jack", 20000, 1234567);
		Second second1 = new Second("Micky", 30000, 258741);
		Second second2 = new Second("Rose", 45000, 365214);

		System.out.println(first.totalMarks());
		System.out.println(first.percentage());

		System.out.println(second.getName());
		System.out.println(second2.getMobileNo());

	}

}
