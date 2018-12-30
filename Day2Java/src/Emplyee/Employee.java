package Emplyee;

public class Employee {
	private static int Id;
	private String Name;
	private double monthlyBasic;
	private static int pfRate;
	public static int highestId=1;
	
	public Employee() {
		this.Id=highestId++;
	}

	public Employee(int Id, String Name, double monthlyBasic) {
		this.Id = highestId;
		this.Name = Name;
		this.monthlyBasic = monthlyBasic;
	}

	public static int getPfRate() {
		return pfRate;
	}

	public static void setPfRate(int pfRate) {
		Employee.pfRate = pfRate;
	}

	public double getPf() {
		double pf = (monthlyBasic * Employee.getPfRate()) / 100;
		if (pf <= 6500)
			pf = 6500;
		return pf;
	}

	public double getEsic() {
		double esic = 0;
		if (monthlyBasic <= 5000)
			esic = (monthlyBasic * 4.75) / 100;
		return esic;

	}

	public double getProfTax() {
		double profTax = 0;
		if (monthlyGrossSalary() <= 5000)
			profTax = 50;
		else
		profTax = 100;
		return profTax;

	}

	public static int getId() {
		return Id;
	}

	public static void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}

	public double annualBasic() {
		return 12 * monthlyBasic;
	}

	public double monthlyGrossSalary() {
		final double medical = 1250;
		final double conveyance = 800;
		double hra = (monthlyBasic * 50) / 100;
		double monthlyGrossSalary = monthlyBasic + hra + medical + conveyance;// Monthly Gross Calculation
		return monthlyGrossSalary;
	}

	public double annualGrossSalary() {
		double monthlyGrossSalary = 12 * monthlyGrossSalary();//Annual salary Calculation
		return monthlyGrossSalary;
	}

	public double monthlyDeductions() {
		double monthlyDeductions = getPf() + getEsic() + getProfTax();// MonthlyDeductions calculation
		return monthlyDeductions;
	}

	public double monthlyTakeHome() {
		double monthlyTakeHome = monthlyGrossSalary() - monthlyDeductions();//Monthly TakeHome Calculation
		return monthlyTakeHome;
	}

	public double annualTakeHome() {
		double annualTakeHome = 12 * monthlyTakeHome();// Annual TakeHomeCalculation
		return annualTakeHome;
	}

}