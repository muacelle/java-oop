package interfaces;

public class Main {
    public static void main(String[] args) {

        NiceCar car2 = new NiceCar();
        car2.start();
        car2.stop();
        car2.startMusic();
        car2.stopMusic();
        car2.upgradeEngine();
        car2.start();

    }
}

// variables are static and final by default in Interfaces.
// similar to Abstract Classes, Interfaces specify what a class do, not how.
// differently from Abstract Classes, you can implement multiple Interfaces.