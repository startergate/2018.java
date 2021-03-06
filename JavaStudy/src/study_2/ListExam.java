package study_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExam {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Hong");
		list.add("Kim");
		list.add("apple");
		list.add("Banana");
		
		for (String s : list) System.out.println(s);
		
		Collections.sort(list);
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) System.out.println(it.next());
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(4);
		list2.add(8);
		list2.add(6);
		list2.add(3);
		
		Collections.sort(list2);
		
		Iterator<Integer> it2 = list2.iterator();
		while (it2.hasNext()) System.out.println(it2.next());
		
	}
}
