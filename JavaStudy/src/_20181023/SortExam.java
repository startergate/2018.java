package _20181023;

import java.util.Arrays;
import java.util.Scanner;

public class SortExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Machine[] arr = new Machine[n];
		
		for (int i = 0; i < arr.length; i++) {
			int number = sc.nextInt();
			int gas = sc.nextInt();
			arr[i] = new Machine(number, gas);
		}
		Arrays.sort(arr);
		System.out.println("--------------------");
		for (Machine mi : arr) {
			System.out.println(mi.number + " " + mi.gas);
		}
		sc.close();
	}
}

class Machine implements Comparable<Machine> {
	int number;
	int gas;
	
	public Machine(int number, int gas) {
		this.number = number;
		this.gas = gas;
	}
	
	@Override
	public int compareTo(Machine other) {
		return number-other.number;
	}
	
}