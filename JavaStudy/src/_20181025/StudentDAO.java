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
		System.out.println("1.입력 | 2.전체리스트 | 3.검색 | 4.수정 | 5.삭제 | 6.종료");
		System.out.println("-------------------------------------");
		
		while (true) {
			System.out.print("선택>");
			int num = sc.nextInt();
			int hakbun;
			String name, major, addr, tel;
			StudentVO vo = null;
			switch (num) {
			case 1:
				System.out.print("학번>");
				hakbun = sc.nextInt();
				System.out.print("이름>");
				name = sc.next();
				System.out.print("전공>");
				major = sc.next();
				System.out.print("주소>");
				addr = sc.next();
				System.out.print("전화번호>");
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
				System.out.print("검색할 정보>");
				info = sc.next();
				int i = 0;
				for (StudentVO v : list) {
					if (v.getAddr().equals(info) || v.getClass().equals(info) || Integer.toString(v.getHakbun()).equals(info) || v.getMajor().equals(info) || v.getName().equals(info) || v.getTel().equals(info) ) {
						i += 1;
						System.out.println(v.getHakbun() + " " + v.getName() + " " + v.getMajor() + " " + v.getAddr() + " " + v.getTel());
					}
				}
				System.out.println("총 " + i + "명의 학생이 검색되었습니다.");}
				break;
			case 4:
				System.out.println("정보를 변경할 학생의 학번을 입력하세요. 변경하지 않으시려면 0을 눌러주시면 됩니다.");
				System.out.print(">");
				int hakbunChange = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getHakbun() == hakbunChange) {
						System.out.print("학번>");
						intTemp = sc.nextInt();
						if(intTemp != 0)
							list.get(i).setHakbun(intTemp);
						System.out.print("이름>");
						stringTemp = sc.next();
						if(stringTemp != "0")
							list.get(i).setName(stringTemp);
						System.out.print("주소>");
						stringTemp = sc.next();
						if(stringTemp != "0")
							list.get(i).setAddr(stringTemp);
						System.out.print("전화번호>");
						stringTemp = sc.next();
						if(stringTemp != "0")
							list.get(i).setTel(stringTemp);
						break;
					}
				}
				break;
			case 5:
				System.out.print("삭제할 학번>");
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
				System.out.println("1~4번 메뉴를 입력하세요");
				break;
			}
		}
	}
}
