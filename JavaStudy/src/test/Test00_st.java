package test;

public class Test00_st {
	public static void main(String[] args) {
		int [] dab = { 1, 4, 2, 3, 1 };
		int [] jdab = { 2, 4, 1, 3, 1 };
		char[] ox = new char[5];
		int cnt = 0;
		for (int i = 0; i < dab.length; i++) {
			if (dab[i] == jdab[i]) {
				ox[i] = 'O';
				cnt += 1;
			}
			else ox[i] = 'X';
		}
		System.out.println("----------");
		for (int i = 0; i < dab.length; i++) {
			System.out.println(" " + dab[i] + "  " + jdab[i] + "  " + ox[i]);
		}
		System.out.println("----------");
		System.out.println("점수: " + (cnt * 20) + "점");
		
		int[] arr = { 5, 1, 3, 2, 5, 3, 2, 4, 5, 1 };
		int[] count = new int[5];
		for (int i = 0; i < arr.length; i++) count[arr[i] - 1] += 1;
		for (int i = 0; i < count.length; i++) System.out.println(i + 1 + "의 개수: " + count[i]);
	}
}
