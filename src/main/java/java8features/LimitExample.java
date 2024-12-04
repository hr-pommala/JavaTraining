package java8features;

import java.util.Arrays;
import java.util.List;

public class LimitExample {
	
    public static void main(String[] args) {
    	
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Get the first 5 elements from the list
        numbers.stream()
               .limit(5)  // Limit the stream to 5 elements
               .forEach(System.out::println);  // Prints: 1, 2, 3, 4, 5
    }
}
