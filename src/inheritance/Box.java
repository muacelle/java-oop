package inheritance;

public class Box {
    double l;
    double h;
    double w;

    // constructor 1 (default box)
    Box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // constructor 2 (cube)
    Box (double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    // constructor 3 (personalized box)
    Box (double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // constructor 4 (you can pass an existing box to it and create a copy)
    Box (Box oldbox) {
        this.h = oldbox.h;
        this.w = oldbox.w;
        this.l = oldbox.l;
    }

}
