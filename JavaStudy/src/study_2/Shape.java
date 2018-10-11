package study_2;

public abstract class Shape {
	public Shape() {}
	abstract public void draw(); 
}

abstract class Line extends Shape{
	public String toString() { return "Line"; }
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