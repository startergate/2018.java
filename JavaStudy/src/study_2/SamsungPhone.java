package study_2;

public class SamsungPhone implements PhoneInterface {
	public void sendCall() {
		System.out.println("��ȭ�� �̴ϴ�");
	}
	
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�");
	}
	
	public void flash() { System.out.println("��ȭ�⿡ ���� �������ϴ�"); }
	
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
