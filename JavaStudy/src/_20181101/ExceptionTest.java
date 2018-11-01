package _20181101;
import java.util.Scanner;

public class ExceptionTest {
	private static final Scanner in = new Scanner(System.in);
	public static void input() {
		int age = 0;
		try {
			System.out.print("���� = ");
			age = Integer.parseInt(in.nextLine());
		} catch (NumberFormatException ex) {
			System.out.println("���� �߻� = " + ex.getLocalizedMessage());
			return;
		} finally {
			System.out.printf("���� = %d��\n", age);
		}
	}
	public static void main(String[] args) {
		System.out.println("���� �Լ� ����!");
		input();
		System.out.println("���� �Լ� ��!");
	}
}
