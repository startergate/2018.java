package _20181108;

import _20181025.StudentVO;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class UnSerialTest {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("serial.dat")));
            ArrayList<StudentVO> list = (ArrayList<StudentVO>) ois.readObject();
            Iterator<StudentVO> it = list.iterator();
            System.out.println("학생 정보 출력");
            while (it.hasNext()) {
                StudentVO v = (StudentVO) it.next();
                System.out.println(v.getHakbun() + " " + v.getName() + " " + v.getMajor() + " " + v.getAddr() + " " + v.getTel());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
