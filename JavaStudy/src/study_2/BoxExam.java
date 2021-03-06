package study_2;

class Box<E> {
	private E obj;
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	public E getObj() {
		return obj;
	}
}

public class BoxExam {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("Hello");
		String str = box2.getObj();
		System.out.println(str);
		
		box.setObj(1);
		int value = (int)box.getObj();
		System.out.println(value);
	}
}