package inheritance;

public class Weight extends Box {

    double weight;

    // default constructor
    public Weight() {
        this.weight = -1;
    }

    public Weight(double l, double h, double w, double weight) {
        super(l, h, w);  // calling the parent constructor
        this.weight = weight;
    }

}
