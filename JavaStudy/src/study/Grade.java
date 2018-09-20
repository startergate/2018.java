package study;

public class Grade {
	private int math;
	private int science;
	private int english;
	public Grade(int m, int s, int e) {
		this.math = m;
		this.science = s;
		this.english = e;
	}
	
	public int average() {
		return (this.math + this.science + this.english) / 3;
	}
}
