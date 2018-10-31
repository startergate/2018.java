package _20181030;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte b[] = { 7, 51, 3, 4, -1, 24 };
		
		try {
			FileOutputStream fout = new FileOutputStream("D:/CodingData/2018.java/JavaStudy/src/_20181030/fileoutput1.txt");
			for (int i = 0; i < b.length; i++)
				fout.write(b[i]);
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 에러");
			return;
		}
		System.out.println("저장 완료");
	}
}
