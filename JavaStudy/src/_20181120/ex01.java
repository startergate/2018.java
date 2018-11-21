package _20181120;

import javax.swing.*;
import java.awt.*;

public class ex01 extends JFrame {
    public ex01() {
        setTitle("Let's study Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout(30,20));
        c.add(new JButton("North"), BorderLayout.NORTH);
        c.add(new JButton("Center"), BorderLayout.CENTER);
        c.add(new JButton("West"), BorderLayout.WEST);
        c.add(new JButton("East"), BorderLayout.EAST);
        c.add(new JButton("South"), BorderLayout.SOUTH);

        setSize(400,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ex01();
    }
}
