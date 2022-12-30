package polymorphism;

public class Numbers {

    // Static Polymorphism (or compile-time):
    // Method overloading is when a Class has multiple methods with the same name, but the number,
    // type and order of parameters and return type can be different.
    // Ex: multiple constructors.

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Numbers obj = new Numbers();

        obj.sum(4, 5);
        obj.sum(6, 8, 10);

    }
}
