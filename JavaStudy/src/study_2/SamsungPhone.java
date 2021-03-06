package study_2;

public class SamsungPhone implements PhoneInterface {
	public void sendCall() {
		System.out.println("전화를 겁니다");
	}
	
	public void receiveCall() {
		System.out.println("전화를 왔습니다");
	}
	
	public void flash() { System.out.println("전화기에 불이 켜졌습니다"); }
	
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
