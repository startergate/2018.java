package study;
class Person1{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
public class Example {
	public static void main(String[] args) {
		Person1 aPerson = new Person1();
		aPerson.setAge(17);
	}
}
