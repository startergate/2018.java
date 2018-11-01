package _20181101;
import java.util.Scanner;

public class ExceptionTest {
	private static final Scanner in = new Scanner(System.in);
	public static void input() {
		int age = 0;
		try {
			System.out.print("나이 = ");
			age = Integer.parseInt(in.nextLine());
		} catch (NumberFormatException ex) {
			System.out.println("오류 발생 = " + ex.getLocalizedMessage());
			return;
		} finally {
			System.out.printf("나이 = %d세\n", age);
		}
	}
	public static void main(String[] args) {
		System.out.println("메인 함수 시작!");
		input();
		System.out.println("메인 함수 끝!");
	}
}
