package _20181023;

import java.util.HashSet;
import java.util.Iterator;

public class SetExam {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		boolean flag1 = set.add("Choi");
		set.add("Kim");
		set.add("Lee");
		boolean flag2 = set.add("Choi");
		
		System.out.println(flag1 + " " + flag2);
		System.out.println(set.size());
		for (String s: set) System.out.println(s);
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}