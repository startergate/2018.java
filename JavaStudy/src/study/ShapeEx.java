package study;

public class ShapeEx {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
	}
}
class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{

	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{

	@Override
	public void draw() {
		System.out.println("Rect");
	}
	
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}