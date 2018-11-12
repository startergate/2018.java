package _20181108;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

class Student implements Serializable {
    private String name;
    private int age;
    private double height;
    private float weight;

    public Student(String name, int age, double height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public void display() {
        System.out.println("이름: " + name + " 나이: " + age + " 키: " + height + " 체중: " + weight);
    }
}

public class ObjectStreamTest {
    private static Scanner cin = new Scanner(System.in);
    private static File dataFile;
    private static List<Student> list = new ArrayList<Student>();

    static {
        dataFile = new File("'blablabla.txt'");
        if (dataFile.exists()) {
            try {
                ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile), 512));
                list = (ArrayList<Student>) in.readObject();
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void inputData() {
        System.out.print("이름> ");
        String name = cin.next();
        System.out.print("나이> ");
        int age = cin.nextInt();
        System.out.print("키> ");
        double height = cin.nextDouble();
        System.out.print("체중> ");
        float weight = cin.nextFloat();

        Student st = new Student(name, age, height, weight);
        list.add(st);
    }
    public static void outputData() {
        for (Student st : list) {
            st.display();
        }
    }
    public static void saveData() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile), 512));
            out.writeObject(512);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.printf("총 %d개의 정보를 저장했습니다.\n", list.size());
    }
    public static void main(String[] args) {
        int command = 0;
        up: while (true) {
            System.out.println("1>> 입력    2>> 전체 출력    3>> 저장 후 종료");
            command = cin.nextInt();
            switch (command) {
                case 1: inputData(); break;
                case 2: outputData();; break;
                case 3: saveData();; break;
                default: System.out.println("검색 오류");
            }
        }
        //cin.close();
    }
}
