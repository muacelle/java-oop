package enums;

public class Main {
    public static void main(String[] args) {

        DaysOfTheWeek myDay = DaysOfTheWeek.THURSDAY;

        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            System.out.println(day);
        }

        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness);

    }
}

// an enum is used when you have something that has a pre-defined set of values that don't change. Ex: days of the week.