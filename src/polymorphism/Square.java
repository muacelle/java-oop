package polymorphism;

public class Square extends Shapes {

    // this is overriding the parent method
    @Override // annotation that checks if the method is overriding something
    void area() {
        System.out.println("Square area: side * side");
    }

}