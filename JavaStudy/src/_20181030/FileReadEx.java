package _20181030;

import java.io.FileReader;

public class FileReadEx {
	public static void main(String[] args) {
		int k = 0;
		int c;
		try {
			FileReader file_read = new FileReader("D:/CodingData/2018.java/JavaStudy/src/_20181030/fileoutput1.txt");
			while ((c=file_read.read()) != -1) {
				System.out.print((char) c);
				k++;
			}
			System.out.println("\n 파일 크기 = " + k + "바이트");
			file_read.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
