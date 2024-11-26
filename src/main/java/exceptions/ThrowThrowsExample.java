package exceptions;

public class ThrowThrowsExample {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Method that throws an exception
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is less than 18!");
        }
    }
}
