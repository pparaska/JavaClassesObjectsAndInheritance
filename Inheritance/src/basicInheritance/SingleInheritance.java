package basicInheritance;

class A {
	public A() {
		System.out.println("Class A");
	}
}

class B extends A {
	public B() {
		System.out.println("Class B");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		B classB = new B();
	}

}
