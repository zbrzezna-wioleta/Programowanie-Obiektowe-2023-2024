package Interfejsy.zad15;

public class MusicPlayer implements SoundPlayer{

    @Override
    public void playSound() {
        System.out.println("playing sound");
    }

    @Override
    public void stopSound() {
        SoundPlayer.super.stopSound();
    }
}
