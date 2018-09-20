package study;
import java.util.Scanner;


public class ScannerEx {

  public static void main(String[] args) {
    System.out.println("rotoRlemf.");

    Scanner scanner = new Scanner(System.in);

    String name = scanner.next();
    System.out.print("qudtls " + name + ", ");

    String city = scanner.next();
    System.out.print("rhwktoRL " + city + ", ");

    int age = scanner.nextInt();
    System.out.print("rhwkfksl" + age + "rnpqf, ");

    double weight = scanner.nextDouble();
    System.out.print("shangus" + weight + "kg, ");

    boolean isStudent = scanner.nextBoolean();
    System.out.print("dnswl " + isStudent + "sksmsckaTKfdlek.");
    scanner.close();
  }
}
