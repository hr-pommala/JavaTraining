package exceptions;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
