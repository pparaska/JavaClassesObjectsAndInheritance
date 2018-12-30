package basicInheritance;

class Parent {
	public void display() {
		System.out.println("Parent Class");
	}
}

class Child extends Parent {

	@Override
	public void display() {
		System.out.println("Child Class");
	}
}

public class FunctionOverriding {

	public static void main(String[] args) {
		Child c=new Child();
		c.display();
	}
}
