package study;

public class Test3 {
	public int f(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		Test3 test = new Test3();
		int sum = test.f(2,4);
		System.out.println(sum);
	}
}
