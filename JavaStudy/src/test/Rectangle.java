package test;
import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width * height;
	}
	public void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle target = new Rectangle();
		target.width = scanner.nextInt();
		target.height = scanner.nextInt();
		System.out.println(target.getArea());
		scanner.close();
	}
}
