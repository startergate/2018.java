package study;

public class Example3 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}

class TV1 {
	private int size;
	public TV1(int size){ this.size = size; }
	protected int getSize(){ return size; }
}

class ColorTV extends TV1 {
	private int res;
	public ColorTV(int size, int res) {
		super(size);
		this.res = res;
		
	}
	public void printProperty() {
		System.out.println(getSize() + "인치 " + res + "컬러");
		return;
	}
	protected int getColor(){ return res; }


}

class IPTV extends ColorTV {
	private String address;
	public IPTV(String address, int size, int res) {
		super(size, res);
		this.address = address;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 " + address + " 주소의 " +getSize() + "인치 " + getColor() + "컬러");
		return;
	}
}
