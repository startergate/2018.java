package _20181120;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("스윙 프레임 만들기");
        setSize(300, 300);
        Container c = getContentPane();
        JButton button = new JButton("click");
        c.add(button);
        setVisible(true);
    }
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
