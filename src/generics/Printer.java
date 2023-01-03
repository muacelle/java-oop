package generics;

public class Printer <T extends Animal> {

    T thingToPrint; // some type of Animal

    // Constructor
    public Printer(T thing) {
        this.thingToPrint = thing;
    }

    // Method
    public void print() {
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }

}
