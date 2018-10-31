package _20181030;

import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInputEx {
    public static void main(String[] args) {
        int c;
        InputStreamReader rd = new InputStreamReader(System.in);

        try {
            while ((c=rd.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
