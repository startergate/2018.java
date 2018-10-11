package study_2;

abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int a[]);
}

public class CalcEx extends Calculator {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override
	public int subtract(int a, int b) {
		return a - b;
	}
	
	@Override
	public double average(int a[]) {
		float total = 0f;
		for (int i = 0; i < a.length; i+=1)
			total += a[i];
		return total / a.length;
	}
	
	public static void main(String[] args) {
		CalcEx c = new CalcEx();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		int num[] = {1,2,3};
		System.out.println(c.average(num));
	}
}