package abstractClasses;

public class Child extends Parent {

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);
    }

    @Override
    void partner(String name) {
        System.out.println("I am going to marry " + name);
    }
}

// All the child classes have to override the Parent methods.