package study;

public class Song {
	public String title;
	public String artist;
	public int year;
	public String country;
	
	public Song(String t, String a, int y, String c) {
		title = t;
		artist = a;
		year = y;
		country = c;
	}
	
	public void show() {
		System.out.println(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	}
	
	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "������");
		song.show();
	}
}