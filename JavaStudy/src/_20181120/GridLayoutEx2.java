package _20181120;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GridLayoutEx2 extends JFrame {

    static ArrayList<String> list = new ArrayList<>();

    public GridLayoutEx2() {
        setTitle("Grid Layout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(5, 2);

        Container c = getContentPane();

        JPanel input = new JPanel();
        input.setLayout(grid);
        input.add(new JLabel(" 이름"));
        JTextField txtName = new JTextField("");
        input.add(txtName);
        input.add(new JLabel(" 학번"));
        JTextField txtNumber = new JTextField("");
        input.add(txtNumber);
        input.add(new JLabel(" 학과"));
        JTextField txtMajor = new JTextField("");
        input.add(txtMajor);
        input.add(new JLabel(" 과목"));
        JTextField txtSubject = new JTextField("");
        input.add(txtSubject);
        c.add(input, BorderLayout.SOUTH);

        JPanel result = new JPanel();
        result.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton btnInput = new JButton("입력");
        result.add(btnInput);
        JTextArea output = new JTextArea("", 7, 20);
        result.add(output);
        c.add(result, BorderLayout.NORTH);

        btnInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String str = null;
                str = txtName.getText() + " " + txtNumber.getText() + " " + txtMajor.getText() + " " + txtSubject.getText();
                list.add(str);
                txtName.setText("");
                txtNumber.setText("");
                txtMajor.setText("");
                txtSubject.setText("");

                String listAll = "";
                for (String i: list) {
                    listAll = listAll + i + "\n";
                }
                output.setText(listAll);
            }
        });

        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutEx2();
    }
}
