package _20181101;

import java.io.IOException;

public class IOExceptionTest {
	public static void main(String[] args) {
		int key = 0;
		try {
			System.out.print("Ű���� = ");
			key = System.in.read();
		} catch (IOException ex) {
			// TODO: handle exception
			System.err.println("���� �߻�: " + ex.getLocalizedMessage());
		} finally {
			System.out.printf("�Է��� Ű�� �ƽ�Ű ���� %d�Դϴ�.\n", key);
		}
	}
}
