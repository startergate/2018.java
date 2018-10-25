package _20181023;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "wjdtkdgusdms shangus");
		map.put(2, "ÃÖÈ£½Â");
		map.put(3, "¹ÚÀçÈ«°¹¤À³¢");
		
		System.out.println(map.get(1));
		
		Set<Integer> num = map.keySet();
		Iterator<Integer> it = num.iterator();
		while (it.hasNext()) {
			System.out.println(map.get(it.next()));
		}
	}
}
