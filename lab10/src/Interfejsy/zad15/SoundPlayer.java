package Interfejsy.zad15;

public interface SoundPlayer {
    abstract void playSound();
    default void stopSound(){
        System.out.println("Sound Stopped");
    }
    public static String getDeviceType(){
        return"Sound Device";
    };
}
