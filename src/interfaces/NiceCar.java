package interfaces;

public class NiceCar {
    private Engine engine;
    private Media media;

    // Constructors
    public NiceCar() {
        engine = new PowerEngine();
        media = new MediaPlayer();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
        media = new MediaPlayer();
    }

    // Methods
    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        media.start();
    }

    public void stopMusic() {
        media.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
