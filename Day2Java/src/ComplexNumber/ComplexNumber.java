package ComplexNumber;

public class ComplexNumber {
	private float real;
	private float imaginary;

	public void set(float real, float imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public float getReal() {
		return this.real;
	}

	@Override
	public String toString() {
		return "ComplexNumber [real=" + real + ", imaginary=" + imaginary + "]";
	}

	public float getImaginary() {
		return this.imaginary;
	}

	public ComplexNumber addComplexNumber(ComplexNumber Object1,
			ComplexNumber Object2) {
		this.real = Object1.real + Object2.real;
		this.imaginary = Object1.imaginary + Object2.imaginary;
		return this;
	}

}