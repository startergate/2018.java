package _20181108;

import _20181025.StudentVO;

import java.io.*;
import java.util.ArrayList;

public class SerialTest {
    public static void main(String[] args) {
        StudentVO v1 = new StudentVO(2101, "박지성", "임베디드", "부산", "010-0000-0000");
        StudentVO v2 = new StudentVO(2102, "김연아", "소프트웨어", "서울", "010-1111-0000");
        ArrayList<StudentVO> list = new ArrayList<>();
        list.add(v1);
        list.add(v2);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("serial.dat")));
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}