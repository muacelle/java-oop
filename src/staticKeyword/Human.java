package staticKeyword;

public class Human {

    // static = a single copy of a variable/method is created and shared.

    int age;
    String name;
    static long population; // this property is shared among all Human objects.

    // constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        Human.population += 1; // change the property inside Human, and all Human objects will access the same value.
    }

    static void displayPopulation() {
        System.out.println("Current population: " + population);
    }

}
