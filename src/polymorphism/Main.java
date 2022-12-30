package polymorphism;

public class Main {

    // Dynamic Polymorphism (or run-time):
    // Method overriding:

    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Square square = new Square();
        Circle circle = new Circle();

        shape.area();   // Shapes area
        square.area();  // Square area: side * side
        circle.area();  // Circle area: pi * r * r

    }

}