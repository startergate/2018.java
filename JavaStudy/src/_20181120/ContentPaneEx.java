package _20181120;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("프레임에 타이틀 달기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setBackground(Color.GREEN);
        con.setLayout(new FlowLayout());

        con.add(new JButton("OK"));
        con.add(new JButton("Cancel"));
        con.add(new JButton("Ignore"));
        con.add(new JButton("fucykou"));
        con.add(new JButton("mocktherufer"));

        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
