package study;
class Point1 {
	private int x, y;
	public Point1(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

public class ColorPoint1 extends Point1 {
	private String name;
	public ColorPoint1(int x, int y, String name) {
		super(x, y);
		this.name = name;
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + "색의 (" + getX() + "," + getY() + ")의 점";
	}
	public static void main(String[] args) {
		ColorPoint1 cp = new ColorPoint1(5,5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다");
	}

}
