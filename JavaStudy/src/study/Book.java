package study;
import java.util.Scanner;

public class Book {
	String title;
	String author;
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	public Book(String t) {
		title = t;
		author = " ";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] book = new Book[2];
		for(int i = 0; i < book.length; i++) {
			System.out.print("제목>>");
			String t = sc.nextLine();
			System.out.print("저자>>");
			String a = sc.nextLine();
			book[i] = new Book(t, a);	
		}
		for(int i = 0; i < book.length; i++) {
			System.out.print("("+book[i].title+","+book[i].author+")");
		}
		sc.close();
	}
}
