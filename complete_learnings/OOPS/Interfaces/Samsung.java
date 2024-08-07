package OOPS.Interfaces;

public class Samsung implements MediaPlayer{
    @Override
    public void startMusic() {
        System.out.println("Samsung starts");
    }

    @Override
    public void stopMusic() {
        System.out.println("Samsung stops");
    }

    //ignore the below when revising about interfaces
    @Override
    public void start() {
        System.out.println("Samsung starts");
    }

    @Override
    public void stop() {
        System.out.println("Samsung stops");
    }
}
