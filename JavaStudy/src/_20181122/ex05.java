package _20181122;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex05 extends JFrame {
    JButton [] buttons = new JButton[16];
    JTextField inputBox = new JTextField(30);
    JTextField resultBox = new JTextField(30);
    String ex = "";
    String [] op = null;

    public ex05() {
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        inputPanel.add(new JLabel("수식입력"));
        inputPanel.add(inputBox);
        c.add(inputPanel, BorderLayout.NORTH);

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(4,4));
        String [] str = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "CE", "계산", "+", "-", "x", "/"};
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(str[i]);
            buttons[i].addActionListener(new MyActionListener());
            btnPanel.add(buttons[i]);
        }
        c.add(btnPanel, BorderLayout.CENTER);

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        resultPanel.add(resultBox);
        c.add(resultPanel, BorderLayout.SOUTH);

        setSize(500, 300);
        setVisible(true);
    }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();

            if (b.getText().equals("0")) {
                ex = ex+"0";
                inputBox.setText(ex);
            }
            if (b.getText().equals("1")) {
                ex = ex+"1";
                inputBox.setText(ex);
            }
            if (b.getText().equals("2")) {
                ex = ex+"2";
                inputBox.setText(ex);
            }
            if (b.getText().equals("3")) {
                ex = ex+"3";
                inputBox.setText(ex);
            }
            if (b.getText().equals("4")) {
                ex = ex+"4";
                inputBox.setText(ex);
            }
            if (b.getText().equals("5")) {
                ex = ex+"4";
                inputBox.setText(ex);
            }
            if (b.getText().equals("6")) {
                ex = ex+"6";
                inputBox.setText(ex);
            }
            if (b.getText().equals("7")) {
                ex = ex+"7";
                inputBox.setText(ex);
            }
            if (b.getText().equals("8")) {
                ex = ex+"8";
                inputBox.setText(ex);
            }
            if (b.getText().equals("9")) {
                ex = ex+"9";
                inputBox.setText(ex);
            }
            if (b.getText().equals("CE")) {
                ex = "";
                inputBox.setText("");
            }
            if (b.getText().equals("+")) {
                ex = ex+"+";
                inputBox.setText(ex);
            }
            if (b.getText().equals("-")) {
                ex = ex+"-";
                inputBox.setText(ex);
            }
            if (b.getText().equals("x")) {
                ex = ex+"x";
                inputBox.setText(ex);
            }
            if (b.getText().equals("/")) {
                ex = ex+"/";
                inputBox.setText(ex);
            }
            if (b.getText().equals("계산")) {
                op = ex.split("");

            }
        }
    }

    public static void main(String[] args) {
        new ex05();
    }
}
