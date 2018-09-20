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
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
	
	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();
	}
}