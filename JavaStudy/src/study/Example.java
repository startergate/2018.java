package study;
class Parent {
	public Parent() {System.out.println("부모클래스");}
	public Parent(int x) { System.out.println("부모클래스 : "+ x);}
}

class Child extends Parent{
	public Child() { super(100); }
	public Child(int x) { System.out.println("자식클래스 : "+ x);}
	
}
public class Example {
	public static void main(String args[]) {
		@SuppressWarnings("unused")
		Child c = new Child(11);
	}
}
