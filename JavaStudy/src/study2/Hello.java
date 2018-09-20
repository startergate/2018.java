package study2;
public class Hello {
  public static int sum(int n, int m) {
    return n+m;
  }

  public static int minus(int n, int m) {
    return n-m;
  }

  public static int mul(int n, int m) {
    return n*m;
  }

  public static double div(int n, int m) {
    return n/m;
  }

  public static void main(String[] args) {
    int i = 20;
    int s;
    double d;
    char a;

    s = sum(i, 10);
    a = '?';

    System.out.println(a);
    System.out.println("Hello");
    System.out.println(s);
    s = minus(i, 10);
    System.out.println(s);
    s = mul(i, 10);
    System.out.println(s);
    d = div(i, 10);
    System.out.println(d);
  }
}
