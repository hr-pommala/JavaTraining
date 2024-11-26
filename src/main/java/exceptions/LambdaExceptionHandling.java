package exceptions;

import java.util.function.Function;

public class LambdaExceptionHandling {
    public static void main(String[] args) {
        // A lambda expression that handles checked exceptions
        Function<String, Integer> parseInt = str -> {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + str);
                return null; // Return null for invalid input
            }
        };

        System.out.println(parseInt.apply("100"));
        System.out.println(parseInt.apply("abc")); // This will print an error
    }
}