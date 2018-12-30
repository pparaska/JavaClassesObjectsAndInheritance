package TrianglePack;

public class Triangle {
	private int side1;
	private int side2;
	private int side3;

	public Triangle(int side1, int side2, int side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public boolean isRightAngleTriangle() {
		double diagonal = Math.sqrt(Math.pow(side2, 2) + Math.pow(side3, 2));
		if (diagonal == side1)
			return true;
		diagonal = Math.sqrt(Math.pow(side1, 2) + Math.pow(side3, 2));
		if (diagonal == side2)
			return true;
		diagonal = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
		if (diagonal == side3)
			return true;
		return false;
	}

	public boolean isIsoscelesTriangle() {
		if (side1 == side2 || side1 == side3 || side2 == side3) {
			return true;
		} else
			return false;
	}

	public boolean isScaleneTriangle() {
		return !(isIsoscelesTriangle());
	}

	public boolean isEquilateralTriangle() {
		if (side1 == side2 && side1 == side3 && side2 == side3) {
		}
		return true;
	}

}
