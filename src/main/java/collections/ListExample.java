package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {
	
	public static void main(String[] args) {
       
		List<Integer> numbers = Arrays.asList(5, 12, 2, 9, 18, 7);

        // Filter even numbers and sort in ascending order
        List<Integer> evenSorted = numbers.stream()
                                          .filter(n -> n % 2 == 0)
                                          .sorted()
                                          .collect(Collectors.toList());

        System.out.println("Even numbers sorted: " + evenSorted);
        
        
        List<String> names = Arrays.asList("John", "Jane", "Alex", "Chris");

        // Using forEach to print each element
        names.stream().forEach(name -> System.out.println(name));
        
        
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Join the list into a single string with commas
        String result = words.stream()
                             .collect(Collectors.joining(", "));

        System.out.println("Joined string: " + result);
        
        // Convert each name to uppercase using map()
        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println("Uppercase names: " + upperCaseNames);
        
        numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum of all numbers using reduce
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);
        
        numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        // Remove duplicates using distinct
        List<Integer> distinctNumbers = numbers.stream()
                                               .distinct()
                                               .collect(Collectors.toList());

        System.out.println("Distinct numbers: " + distinctNumbers);
    }

}
