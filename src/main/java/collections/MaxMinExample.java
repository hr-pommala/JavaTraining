package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2);

        // Finding the maximum number
        Integer max = numbers.stream()
                             .collect(Collectors.maxBy(Comparator.naturalOrder()))
                             .orElse(null);

        // Finding the minimum number
        Integer min = numbers.stream()
                             .collect(Collectors.minBy(Comparator.naturalOrder()))
                             .orElse(null);

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}

