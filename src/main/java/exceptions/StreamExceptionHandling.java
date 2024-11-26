package exceptions;

import java.util.Arrays;
import java.util.List;

public class StreamExceptionHandling {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "three", "4");

        // Handling exception in a stream operation
        numbers.stream()
               .map(num -> {
                   try {
                       return Integer.parseInt(num); // May throw NumberFormatException
                   } catch (NumberFormatException e) {
                       System.out.println("Error parsing: " + num);
                       return null; // Return null for invalid data
                   }
               })
               .filter(num -> num != null)
               .forEach(System.out::println); // Prints only valid numbers
    }
}
