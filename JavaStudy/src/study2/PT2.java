package study2;
import java.util.Random;

public class PT2 {
	public static void main(String[] args) {
		Random random = new Random();
		int randomInt[] = new int[10];
		double sum = 0;
		for(int i = 0; i < randomInt.length; i++) {
			randomInt[i] = random.nextInt(10) + 1;
		}
		System.out.print("·£´ýÇÑ Á¤¼öµé: ");
		for(int i = 0; i < randomInt.length; i++) {
			System.out.print(randomInt[i] + " ");
			sum += randomInt[i];
		}
		System.out.print("\nÆò±ÕÀº " + sum/10);
		
	}
}
