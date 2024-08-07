package OOPS.Interfaces;

public class Panasonic implements MediaPlayer{
    @Override
    public void startMusic() {
        System.out.println("panasonic starts");
    }

    @Override
    public void stopMusic() {
        System.out.println("panasonic stops");
    }


    //ignore the below when revising about interfaces
    @Override
    public void start() {
        System.out.println("panasonic starts");
    }

    @Override
    public void stop() {
        System.out.println("panasonic stops");
    }
}
