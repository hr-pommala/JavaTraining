package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LimitFilterExample {
	
    public static void main(String[] args) {
    	
        List<String> words = Arrays.asList("apple", "banana", "bcherry", "bdate", "blueberry", "fig", "grape");
        
        // Filter words that start with 'b' and limit the result to 2
        words.stream()
             .filter(word -> word.startsWith("b"))
             .limit(2)
             .forEach(System.out::println);  // Prints: banana, blueberry (if present)
        
        List<Integer> numbers = Arrays.asList(8, 1, 4, 7, 3, 9, 2, 5, 6,7,8,9);
        
        // Sort the list and limit the result to the first 3 elements
        numbers.stream()
               .sorted()
               .limit(3)
               .forEach(System.out::println);  // Prints: 1, 2, 3
      
        
        
        // Create an infinite stream of even numbers and limit it to 5 elements
        //15 prime numbers using stream
        Stream.iterate(0, n -> n + 2)
             //   .filter((n -> n%2 != 0))
              .limit(15)
              .forEach(System.out::print);  // Prints: 0, 2, 4, 6, 8
        
        
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie", "David", "Eve", "Frank");
        
        // Get the first 3 names that have more than 3 characters
        names.stream()
             .filter(name -> name.length() > 3)
             .limit(3)
             .forEach(System.out::println);  // Prints: John, Alice, Charlie
    }
}

