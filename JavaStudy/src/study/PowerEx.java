package study;
class Power{
	public int kick;
	public int punch;
	
	public void createPower(int k, int p) {
		kick = k;
		punch = p;
	}
}
public class PowerEx {
	public static void main(String[] args) {
		Power robot = new Power();
		robot.createPower(10, 20);
	}
}
