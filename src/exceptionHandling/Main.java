package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            getInt();
            System.out.println("If there's an exception, this line will note be executed.");
        }
        catch (NumberFormatException nfe) {
            System.out.println("Something wrong with the number format.");
        }
        catch (NullPointerException npe) {
            System.out.println("Points to null.");
        }
        // or you can do that:  catch (NumberFormatException | NullPointerException e) { ... } if you want the same response
        finally {
            System.out.println("I will always execute, independently of the exceptions.");
        }
    }

    private static void getInt() {
        int myInt = Integer.parseInt("pants");
    }

    // Obs: the "Finally" return will OVERRIDE the "Try" return. Normally, you will want to use return only inside "Try".
}
