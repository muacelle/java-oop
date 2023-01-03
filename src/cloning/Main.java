package cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human kunal = new Human(33, "Kunal");
        // Human twin = new Human(kunal);
        Human twin = (Human)kunal.clone();

        // different objects, same properties
        System.out.println(kunal);
        System.out.println(twin);

    }
}
