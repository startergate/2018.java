package _20181030;

import java.io.FileWriter;
import java.util.Scanner;


public class FileWriteEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("D:/CodingData/2018.java/JavaStudy/src/_20181030/fileoutput1.txt");
			while (true) {
				String line = sc.nextLine();
				if (line.length() == 0) break;
				fout.write(line);
				fout.write("\r\n");
			}
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
