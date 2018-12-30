package basicInheritance;

class Base {
	public Base() {
		System.out.println("Base Class");
	}
}

class Derived1 extends Base {
	public Derived1() {
		System.out.println("Derived Class 1");
	}
}

class Derived2 extends Base {
	public Derived2() {
		System.out.println("Derived Class 2");
	}
}

public class HirearchicalInheritance {

	public static void main(String[] args) {
		Derived1 d1= new Derived1();
		Derived2 d2= new Derived2();
	}

}
