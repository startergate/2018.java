package _20181108;

import java.io.IOException;

public class ExceptionEx02 {
	public static void main(String[] args) {
		int[] data = { 0, 0, 0 };
		int pos = 0;
		
		try {
			pos = System.in.read()-48;
			data[pos] = 100;
			System.out.printf("입력한 위치값은 %d", pos);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
