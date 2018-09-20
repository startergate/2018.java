package study;

public class TV {
	private String manufacturer;
	private int year;
	private int inch;
	public TV(String m, int y, int i){
		this.manufacturer = m;
		this.year = y;
		this.inch = i;
	}
	public void show() {
		System.out.println(this.manufacturer+"???? ???? "+this.year+"???? "+this.inch+"??? TV");
	}
}
