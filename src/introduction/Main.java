package introduction;

public class Main {
    public static void main(String[] args) {

        // Creating an object
        Student kunal = new Student();
        // Student is a class. Student() is a default constructor. kunal is an object.

        Student rahul = new Student(1, "Rahul", 84.13f);
        // Example of a personalized constructor made inside the Student class.

        System.out.println(kunal.name); // null
        System.out.println(rahul.name); // Rahul

        //Class = properties + functions.
        int a = 10; // this is a primitive value.
        Integer b = 10; // this is an object of the Integer class.
        // Now you can do that: b.toString(); b.equals(); b.byteValue(); etc
    }
}

// creating a Class
class Student {

    int id;
    String name;
    float marks;

    Student() {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
