package _20181030;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteIOExam {
	public static void main(String[] args) {
		File file = new File("D:/CodingData/2018.java/JavaStudy/src/_20181030/HIEOS.jpg");
		try {
			if (!file.exists()) file.createNewFile();
			
			FileOutputStream out = new FileOutputStream(file);
			out.write("Hello, Java!\n".getBytes());
			
			BufferedOutputStream out2 = new BufferedOutputStream(out, 512);
			out2.write("Hello, Java2!\n".getBytes());
			
			PrintStream out3 = new PrintStream(out2);
			out3.println("Hello, Java3!\n".getBytes());
			out3.close();
			
			FileInputStream in = new FileInputStream(file);
			while (true) {
				int ch = in.read();
				if (ch<0) break;
				System.out.print((char) ch);
			}
			in.close();
			
			FileInputStream in2 = new FileInputStream(file);
			BufferedInputStream in3 = new BufferedInputStream(in2, 512);
			while (true) {
				int ch = in3.read();
				if (ch<0) break;
				System.out.print((char) ch);
			}
			in3.close();
		} catch (Exception e) {
			System.out.println("파일이 없습니다");
			System.exit(-1);
		}
	}
}
