package study;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings({ "unused", "serial" })
public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 ���� ������ �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
	}
}