package java8features.programs;

import java.util.*;
import java.util.stream.*;

public class SortByMethodReferences {
	
    public static void main(String[] args) {
    	
        List<Employee> employees = Arrays.asList(
            new Employee(1, "John", 50000),
            new Employee(2, "Alice", 75000),
            new Employee(3, "Bob", 60000),
            new Employee(4, "Charlie", 70000)
        );

        // Sort employees by name using method reference
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);  // Prints sorted employees by name
    }
}
