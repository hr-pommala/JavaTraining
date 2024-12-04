package collections;

import java.util.Arrays;
import java.util.List;

public class CombinedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2);

        // Square each number, filter even numbers, and sum them
        int sumOfSquaresOfEvens = numbers.stream()
                                         .map(n -> n * n)  // Square the number
                                         .filter(n -> n % 2 == 0)  // Keep only even squares
                                         .reduce(0, Integer::sum);  // Sum them

        System.out.println("Sum of squares of even numbers: " + sumOfSquaresOfEvens);
    }
}
