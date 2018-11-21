package _20181120;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    public Test() {
        setTitle("계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        JPanel input = new JPanel();
        input.setLayout(new FlowLayout(FlowLayout.CENTER));
        input.add(new JLabel(" 수식입력"));
        JTextField text = new JTextField("", 15);
        input.add(text);
        c.add(input, BorderLayout.NORTH);

        JPanel calcP = new JPanel();
        GridLayout calc = new GridLayout(4,4);
        calc.setVgap(0);
        calc.setHgap(0);
        calcP.setLayout(calc);

        for (int i = 0; i < 10; i++) {
            calcP.add(new JButton(Integer.toString(i)));
        }
        calcP.add(new JButton("CE"));
        calcP.add(new JButton("계산"));
        calcP.add(new JButton("+"));
        calcP.add(new JButton("-"));
        calcP.add(new JButton("*"));
        calcP.add(new JButton("/"));
        c.add(calcP, BorderLayout.CENTER);

        JPanel output = new JPanel();
        output.setLayout(new FlowLayout(FlowLayout.CENTER));
        output.add(new JLabel(" 계산결과"));
        JTextArea textOut = new JTextArea("", 1, 15);
        output.add(textOut);
        c.add(output, BorderLayout.SOUTH);

        setSize(300, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test();
    }
}
