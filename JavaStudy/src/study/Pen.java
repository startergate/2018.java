package study;
class Pen {
	protected int amount;
	public int getAmount() { return this.amount; }
	public void setAmount(int amount) { this.amount = amount;}
}
class SharpPencil extends Pen { //�����潽
	@SuppressWarnings("unused")
	private int width; //���� ����
}

class BallPen extends Pen{ //����
	private String color ; //������ ��
	public String getColor() { return color; }
	public void setColor(String color) {this.color=color;}	
}

class FountainPen extends Pen{ //������
	private String color; //�������� ��
	public String getColor() { return color; }
	public void setColor(String color) {this.color=color;}
	public void refill(int n) { super.amount = n; } //���� �� ����
}
