package basicInheritance;

public class Second {
	private String name;
	private double salary;
	private double mobileNo;

	public Second(String name, double salary, double mobileNo) {
		super();
		this.name = name;
		this.salary = salary;
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public double getMobileNo() {
		return mobileNo;
	}

}
