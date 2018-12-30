package basicInheritance;

class Shape{
	public void draw(){
		System.out.println("Draw shape");
	}
}

class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Draw Circle");
	}
	
}

class Polygon extends Shape{

	@Override
	public void draw() {
	System.out.println("Draw Polygon");
	}	
}

class Rectangle extends Shape{

	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}
	
	
}
public class ShapeDemo {

	public static void main(String[] args) {
	Shape shape=new Circle();
	Shape shape1=new Rectangle();
	Shape shape2=new Polygon();
	Shape shape3=new Shape();
	
	
	shape.draw();
	shape1.draw();
	shape2.draw();
	shape3.draw();

	}

}
