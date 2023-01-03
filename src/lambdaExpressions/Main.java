package lambdaExpressions;

// Lambda is a shortcut to define and implement a Functional Interface.

public class Main {
    public static void main(String[] args) {

        // Instead of sending an object that contains an action, we just send the action itself.
        Printable lambda = (s) -> System.out.println("Meow! I'm a cat. " + s);
        printThing(lambda);

    }

    // Lambdas can only be used along Functional Interfaces.
    static void printThing(Printable thing) {
        thing.print("^-^");
    }
}

// Instead of passing an object that contains a specific implementation of the print(),
// we just pass in that specific implementation directly.