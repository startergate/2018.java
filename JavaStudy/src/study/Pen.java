package study;
class Pen {
	private int amount;
	public int getAmount() { return this.amount; }
	public void setAmount(int amount) { this.amount = amount;}
}
class SharpPencil extends Pen { //�����潽
	private int width; //���� ����
}

class BallPen extends Pen{ //����
	private int amount; //���� ��
	private String color ; //������ ��
	public void setAmount(int amount) { this.amount=amount;}
	public String getColor() { return color; }
	public void setColor(String color) {this.color=color;}	
}

class FountainPen{ //������
	private int amount; //���� ��
	private String color; //�������� ��
	public int getAmount() { return amount; }
	public void setAmount(int amount) { this.amount=amount;}
	public String getColor() { return color; }
	public void setColor(String color) {this.color=color;}
	public void refill(int n) { amount = n; } //���� �� ����
}

