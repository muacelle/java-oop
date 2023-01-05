package enums;

public enum Cereals {
    CAPATAIN_CRUNCH(50, 2.90),
    FROOT_LOOPS(60, 2.70),
    REESES_PUFFS(100, 3.30),
    COCOA_PUFFS(75, 3.10);

    // final: you problably don't want to someone to change the levels
    final int levelOfDeliciousness;
    final double price;

    // constructor
    Cereals (int levelOfDeliciousness, double price) {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }
}
