package study;
class Pen {
	protected int amount;
	public int getAmount() { return this.amount; }
	public void setAmount(int amount) { this.amount = amount;}
}
class SharpPencil extends Pen { //»þÇÁÆæ½½
	@SuppressWarnings("unused")
	private int width; //ÆæÀÇ ±½±â
}

class BallPen extends Pen{ //º¼Ææ
	private String color ; //º¼ÆæÀÇ »ö
	public String getColor() { return color; }
	public void setColor(String color) {this.color=color;}	
}

class FountainPen extends Pen{ //¸¸³âÇÊ
	private String color; //¸¸³âÇÊÀÇ »ö
	public String getColor() { return color; }
	public void setColor(String color) {this.color=color;}
	public void refill(int n) { super.amount = n; } //³²Àº ·® º¸Ãæ
}
