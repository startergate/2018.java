package study;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}
	public int square() {
		return width * height;
	}
	public void show() {
		System.out.println("( "+x+", "+y+" )에서 크기가 "+width+"X"+height+"인 사각형");
	}
	public boolean contains(Rectangle r) {
		if(r.x >= x && r.y >= y)
			if(r.x + r.width <= x + width && r.y + r.height <= y + height) return true;
		return false;
	}
	public static void main(String[] args) {
		
	}
}
