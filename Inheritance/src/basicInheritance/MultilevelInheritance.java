package basicInheritance;

class D {
	public D() {
		System.out.println("Class A");
	}
}

class E extends D {
	public E() {
		System.out.println("Class B");
	}
}

class F extends E {
	public F() {
		System.out.println("Class C");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		F classf = new F();

	}

}
