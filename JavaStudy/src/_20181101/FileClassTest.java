package _20181101;

import java.io.File;
import java.io.FilenameFilter;

public class FileClassTest {
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root);
		}
		File dir = new File("D:\\CodingData\\2018.java\\JavaStudy\\src");
		
		File dir2 = new File(dir+File.separator + "_20181101");
		File[] list = dir2.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".java");
			}
		});
		
		for (int i = 0; i < list.length; ++i) {
			System.out.println(list[i].getName() + ": " + list[i].canExecute());
		}
		return;
	}
}
