package _20181025;

public class StudentVO {
	private int hakbun;
	private String name;
	private String major;
	private String addr;
	private String tel;
	
	public StudentVO(int hakbun, String name, String major, String addr, String tel) {
		this.hakbun = hakbun;
		this.name = name;
		this.major = major;
		this.addr = addr;
		this.tel = tel;
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
