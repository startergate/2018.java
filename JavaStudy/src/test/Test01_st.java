package test;

public class Test01_st {
	public static void main(String[] args) {
		int [] arr = { 4, 3, 1, 2, 5 };
		int i;
		for (i = 0; i < arr.length - 1; i++) {
			for	(int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for	(i = 0; i < arr.length; i++) System.out.println(arr[i]);
		

		System.out.println();
		
		
		int [] data = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int counter1 = 0;
		for	(i = 0; i < data.length; i++) if (data[i] == 70) {
			counter1 = i;
			break;
		}
		System.out.println(counter1);
		System.out.println(i+1);
		
		
		System.out.println();
		
		
		i = 0;
		int middle = (data.length - 1) / 2;
		while (true) {
			i += 1;
			if (data[middle] == 70) break;
			else if (data[middle] < 70) middle += middle / 2;
			else middle -= middle / 2;
		}
		System.out.println(middle);
		System.out.println(i+1);
	}
}
