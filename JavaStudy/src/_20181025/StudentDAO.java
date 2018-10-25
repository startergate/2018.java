package _20181025;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
	public static void main(String[] args) {
		int intTemp;
		String stringTemp;
		Scanner sc = new Scanner(System.in);
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		
		System.out.println("-------------------------------------");
		System.out.println("1.�Է� | 2.��ü����Ʈ | 3.�˻� | 4.���� | 5.���� | 6.����");
		System.out.println("-------------------------------------");
		
		while (true) {
			System.out.print("����>");
			int num = sc.nextInt();
			int hakbun;
			String name, major, addr, tel;
			StudentVO vo = null;
			switch (num) {
			case 1:
				System.out.print("�й�>");
				hakbun = sc.nextInt();
				System.out.print("�̸�>");
				name = sc.next();
				System.out.print("����>");
				major = sc.next();
				System.out.print("�ּ�>");
				addr = sc.next();
				System.out.print("��ȭ��ȣ>");
				tel = sc.next();
				vo = new StudentVO(hakbun, name, major, addr, tel);
				list.add(vo);
				break;
			case 2:
				for (StudentVO v : list) {
					System.out.println(v.getHakbun() + " " + v.getName() + " " + v.getMajor() + " " + v.getAddr() + " " + v.getTel());
				}
				break;
			case 3:
				{Object info;
				System.out.print("�˻��� ����>");
				info = sc.next();
				int i = 0;
				for (StudentVO v : list) {
					if (v.getAddr().equals(info) || v.getClass().equals(info) || Integer.toString(v.getHakbun()).equals(info) || v.getMajor().equals(info) || v.getName().equals(info) || v.getTel().equals(info) ) {
						i += 1;
						System.out.println(v.getHakbun() + " " + v.getName() + " " + v.getMajor() + " " + v.getAddr() + " " + v.getTel());
					}
				}
				System.out.println("�� " + i + "���� �л��� �˻��Ǿ����ϴ�.");}
				break;
			case 4:
				System.out.println("������ ������ �л��� �й��� �Է��ϼ���. �������� �����÷��� 0�� �����ֽø� �˴ϴ�.");
				System.out.print(">");
				int hakbunChange = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getHakbun() == hakbunChange) {
						System.out.print("�й�>");
						intTemp = sc.nextInt();
						if(intTemp != 0)
							list.get(i).setHakbun(intTemp);
						System.out.print("�̸�>");
						stringTemp = sc.next();
						if(stringTemp != "0")
							list.get(i).setName(stringTemp);
						System.out.print("�ּ�>");
						stringTemp = sc.next();
						if(stringTemp != "0")
							list.get(i).setAddr(stringTemp);
						System.out.print("��ȭ��ȣ>");
						stringTemp = sc.next();
						if(stringTemp != "0")
							list.get(i).setTel(stringTemp);
						break;
					}
				}
				break;
			case 5:
				System.out.print("������ �й�>");
				hakbun = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getHakbun() == hakbun) {
						list.remove(i);
					}
				}
				break;
			case 6:
				sc.close();
				System.exit(-1);
				break;
			default:
				System.out.println("1~4�� �޴��� �Է��ϼ���");
				break;
			}
		}
	}
}
