package Foobar;


import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String input = sc.nextLine();
        sc.close();
        char[] strarr = input.toCharArray();
        String output = "";
        for (char i : strarr) {
            switch (i) {
                case 'a':
                    output += Character.toString('z');
                    break;
                case 'b':
                    output += Character.toString('y');
                    break;
                case 'c':
                    output += Character.toString('x');
                    break;
                case 'd':
                    output += Character.toString('w');
                    break;
                case 'e':
                    output += Character.toString('v');
                    break;
                case 'f':
                    output += Character.toString('u');
                    break;
                case 'g':
                    output += Character.toString('t');
                    break;
                case 'h':
                    output += Character.toString('s');
                    break;
                case 'i':
                    output += Character.toString('r');
                    break;
                case 'j':
                    output += Character.toString('q');
                    break;
                case 'k':
                    output += Character.toString('p');
                    break;
                case 'l':
                    output += Character.toString('o');
                    break;
                case 'm':
                    output += Character.toString('n');
                    break;
                case 'n':
                    output += Character.toString('m');
                    break;
                case 'o':
                    output += Character.toString('l');
                    break;
                case 'p':
                    output += Character.toString('k');
                    break;
                case 'q':
                    output += Character.toString('j');
                    break;
                case 'r':
                    output += Character.toString('i');
                    break;
                case 's':
                    output += Character.toString('h');
                    break;
                case 't':
                    output += Character.toString('g');
                    break;
                case 'u':
                    output += Character.toString('f');
                    break;
                case 'v':
                    output += Character.toString('e');
                    break;
                case 'w':
                    output += Character.toString('d');
                    break;
                case 'x':
                    output += Character.toString('c');
                    break;
                case 'y':
                    output += Character.toString('b');
                    break;
                case 'z':
                    output += Character.toString('a');
                    break;
                case ' ':
                    output += Character.toString(' ');
                    break;
                default:
                    output += Character.toString(strarr[cnt]);
                    break;
            }
            cnt++;
        }
        System.out.println(output);
    }
}
