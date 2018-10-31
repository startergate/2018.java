package _20181030;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[] = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("D:/CodingData/2018.java/JavaStudy/src/_20181030/fileoutput1.txt");
			int n = 0, c;
			while ((c = fin.read()) != -1) {
				b[n] = (byte) c;
				n++;
			}
			System.out.println("파일 내용 출력");
			for (int i = 0; i < b.length; i++) System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
		} catch (IOException e) {
			System.out.println("파일 읽기 오류");
		}
	}
}
