package staticKeyword;

public class Main {
    public static void main(String[] args) {

        Human kunal = new Human(22, "Kunal");
        System.out.println(Human.population); // 1

        Human rahul = new Human(27, "Rahul");
        System.out.println(Human.population); // 2

        Human.displayPopulation();

        // in a static context, you can't access non static stuff without referencing their instances.
        // greeting();

        Main obj = new Main();
        obj.greeting();
        // Now it works!
    }

    // non static. outside the static main method. inside Main class. Dependent on objects.
    void greeting() {
        System.out.println("Hello world!");
    }
}

