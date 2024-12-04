package java8features.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByMultipleCriteria {
	
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "John", 50000),
            new Employee(2, "Alice", 75000),
            new Employee(3, "Bob", 75000),
            new Employee(4, "Alice", 70000)
        );

        // Sort employees by name, and if names are equal, sort by salary
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getSalary))
                .forEach(System.out::println);  // Prints sorted employees by name, then salary
    }
}

