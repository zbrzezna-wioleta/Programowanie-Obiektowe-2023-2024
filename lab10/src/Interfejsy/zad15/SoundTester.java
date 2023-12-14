package Interfejsy.zad15;

public class SoundTester {
    public static void main(String[] args) {
        MusicPlayer m1= new MusicPlayer();
        Radio r1 = new Radio();
        m1.playSound();
        m1.stopSound();
        r1.playSound();
        r1.stopSound();
        System.out.println(SoundPlayer.getDeviceType());
    }
}
