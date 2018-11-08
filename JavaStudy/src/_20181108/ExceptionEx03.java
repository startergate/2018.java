package _20181108;

import java.io.IOException;
import java.lang.ArithmeticException;

public class ExceptionEx03 {
    public static void main(String[] args) {
        int data = 100;
        int div;
        try {
            div = System.in.read()-48;
            int result = data / div;
            System.out.printf("100 나누기 %d = %d", div, result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e2) {
            System.out.println("0으로 나눌 수 없습니다.");

        }
    }
}
