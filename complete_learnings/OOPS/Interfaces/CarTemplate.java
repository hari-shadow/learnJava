package OOPS.Interfaces;

public class CarTemplate {
    private Engine engine;
    private Brake brake;
    private MediaPlayer songPlayer;

    public CarTemplate(Engine engine, Brake brake, MediaPlayer songPlayer) {
        this.engine = engine;
        this.brake = brake;
        this.songPlayer = songPlayer;
    }

    public void accEngine() {
        engine.accEngine();
    }

    public void stopEngine() {
        engine.stopEngine();
    }

    public void startEngine() {
        engine.startEngine();
    }

    public void brake() {
        brake.brake();
    }

    public void stopMusic() {
        songPlayer.stopMusic();
    }

    public void startMusic() {
        songPlayer.startMusic();
    }

}
