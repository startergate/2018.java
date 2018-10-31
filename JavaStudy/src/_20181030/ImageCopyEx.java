package _20181030;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyEx {
	public static void main(String[] args) {
		File src = new File("D:/CodingData/2018.java/JavaStudy/src/_20181030/HIEOS.jpg");
		File dest = new File("D:/CodingData/2018.java/JavaStudy/src/_20181030/HIEOS1.jpg");
		int c;
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			while ((c=fi.read()) != -1) {
				fo.write((byte) c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����߾��!");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}
