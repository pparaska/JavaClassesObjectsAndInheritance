package RectanglePack;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = (length > 0) ? length : 0;
		this.width = (width > 0) ? width : 0;
	}

	public int areaOfRectangle() {
		return length * width;
	}

	public int perimeterOfRectangle() {
		return 2 * (length + width);
	}

}
