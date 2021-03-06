package _20181101;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileClassEx {
	public static void main(String[] args) {
		File file = new File("C:/Windows/system.ini");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(format.format(new Date(file.lastModified())));
	}
}
