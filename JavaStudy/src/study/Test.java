package study;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>> ");
		scanner.nextInt();
		
		scanner.close();
	}
}