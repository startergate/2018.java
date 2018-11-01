package _20181101;

import java.io.IOException;

public class IOExceptionTest {
	public static void main(String[] args) {
		int key = 0;
		try {
			System.out.print("키보드 = ");
			key = System.in.read();
		} catch (IOException ex) {
			// TODO: handle exception
			System.err.println("오류 발생: " + ex.getLocalizedMessage());
		} finally {
			System.out.printf("입력한 키의 아스키 값은 %d입니다.\n", key);
		}
	}
}
