package DistancePack;

public class Distance {
	private int feet;
	private float inches;

	public void set(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}

	public float getFeet() {
		return this.feet;
	}

	@Override
	public String toString() {
		return "Distance [feet=" + feet + ", inches=" + inches + "]";
	}

	public float getInches() {
		return this.inches;
	}

	public Distance addDistances(Distance object1, Distance object2) {
		this.feet = object1.feet + object2.feet;
		this.inches = object1.inches + object2.inches;
		return this;
	}
}
