package study2;
import java.util.Scanner;

public class Scanner1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    System.out.print(n+m);
    
    sc.close();
  }
}
