package Interface;

public class C implements B {
	public static void main(String[] args) {
		C c = new C();
		c.disp2();
		c.disp1();
	}

	@Override
	public void disp1() {
		System.out.println("Interface A");
	}

	@Override
	public void disp2() {
		System.out.println("Interface B");
	}
}
