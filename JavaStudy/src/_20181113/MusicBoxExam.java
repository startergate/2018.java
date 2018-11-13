package _20181113;

public class MusicBoxExam {
    public static void main(String[] args) {
        MusicBox box = new MusicBox();

        MusicPlayer Hong = new MusicPlayer(1, box);
        MusicPlayer Song = new MusicPlayer(2, box);
        MusicPlayer Tony = new MusicPlayer(3, box);

        Hong.start();
        Song.start();
        Tony.start();
    }
}
