package inheritance;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box();                       // default box

        Box box2 = new Box(4);                 // cube

        Box box3 = new Box(4.6, 6.0, 4.2); // personalized box

        Box box4 = new Box(box3);                   // copy box

        // System.out.println(box4.l + " " + box4.h + " " + box4.w);

        Weight box5 = new Weight();

        Weight box6 = new Weight(4.2, 6.0, 5.2, 6.0);

        // System.out.println(box5.l + " " + box5.h + " " + box5.w + " " + box5.weight);

        Box box7 = new Weight(2, 3, 4, 8);

        // This doesn't work!
        // System.out.println(box7.weight);
        // It's the type of the variable (Box), and not the type of the object (Weight), that determines what members can be accessed.

    }
}
