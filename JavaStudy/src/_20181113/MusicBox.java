package _20181113;

public class MusicBox {
    public synchronized void playMusicA() {
        // 랜덤한 시간 간격으로 아이유 음악 10회 출력

        for (int i = 0; i < 10; i++) {
            System.out.println("아이유 - 무릎");
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void playMusicB() {
        // 랜덤한 시간 간격으로 Avicii 음악 10회 출력
        for (int i = 0; i < 10; i++) {
            System.out.println("Avicii - Lonely Together");
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void playMusicC() {
        // 랜덤한 시간 간격으로 아이유 음악 10회 출력
        for (int i = 0; i < 10; i++) {
            System.out.println("정의닦이 - Come Together");
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
