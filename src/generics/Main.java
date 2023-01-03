package generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Printer<Cat> catPrinter = new Printer<>(new Cat());
        catPrinter.print();

        Printer<Dog> dogPrinter = new Printer<>(new Dog());
        dogPrinter.print();

        shout("John");
        shout(33);
        shout(new Cat());

    }

    // Generic methods
    private static <T> void shout(T thingToShout) {
        System.out.println(thingToShout + "!!!");
    }

    // Wild Card <?> = any type
    private static void printList(List<?> myList) {
        System.out.println();
    }
}
