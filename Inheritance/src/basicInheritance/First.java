package basicInheritance;

public class First {

	private int id;
	private String name;
	private String address;
	private int total;

	public First(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	protected int totalMarks() {
		int maths = 65;
		int science = 70;
		int english = 82;
		return total = maths + science + english;
	}

	protected float percentage() {
		float percentage;
		percentage = (float) total / 3;
		return percentage;
	}
}
