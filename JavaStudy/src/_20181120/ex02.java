package _20181120;

import javax.swing.*;
import java.awt.*;

public class ex02 extends JFrame {
    public ex02() {
        setTitle("Ten Color Button Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(1, 10, 1, 1));
        Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.DARK_GRAY, Color.PINK, Color.LIGHT_GRAY };

        for (int i = 0; i < 10; i++) {
            JButton imsi = new JButton(Integer.toString(i));
            imsi.setBackground(color[i]);
            c.add(imsi);
        }
        setSize(500, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ex02();
    }
}
