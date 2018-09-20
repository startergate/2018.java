package study;
import java.util.Random;
import java.util.Scanner;
public class Tester{
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int high, low, receivedNum, count = 1;
		while(true) {
			high = 99;
			low = 0;
			int randNum = random.nextInt(100);
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			while(true) {
				System.out.println(low + "-" + high);
				System.out.print(count + ">>");
				receivedNum = scanner.nextInt();
				if(randNum == receivedNum) {
					System.out.println("맞았습니다.");
					break;
				} else if(randNum < receivedNum) {
					System.out.println("더 낮게");
					if(receivedNum < high) high = receivedNum;
				} else {
					System.out.println("더 높게");
					if(receivedNum > low) low = receivedNum;
				}
				count++;
			}
			System.out.print("다시하시겠습니까(y/n)>>");
			String temp = scanner.next();
			if(temp.equals("n")) break;
		}
		scanner.close();
	}
}