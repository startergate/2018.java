package _20181129;

import sun.font.TextLabel;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
    public LabelEx() {
        setTitle("레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel textLabel = new JLabel("노을지는 그 곳에서");

        ImageIcon image1 = new ImageIcon("image/sunset.jpg");
        JLabel imageLabel = new JLabel(image1);

        ImageIcon normalIcon = new ImageIcon("image/icon.jpg");
        ImageIcon rolloverIcon = new ImageIcon("image/icon2.jpg");
        ImageIcon pressedIcon = new ImageIcon("image/icon3.jpg");

        JButton btn = new JButton("call", normalIcon);
        btn.setHorizontalAlignment(SwingConstants.CENTER);
        btn.setPressedIcon(pressedIcon);
        btn.setRolloverIcon(rolloverIcon);

        c.add(textLabel);
        c.add(imageLabel);
        c.add(btn);

        setSize(900, 900);
        setVisible(true);

    }
    public static void main(String[] args) {
        new LabelEx();
    }
}
