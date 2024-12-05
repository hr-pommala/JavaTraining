package java8features.programs;

import java.util.Arrays;
import java.util.List;

public class SortEmployeeDescending {
	
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "John", 50000),
            new Employee(2, "Alice", 75000),
            new Employee(3, "Bob", 60000),
            new Employee(4, "Charlie", 70000)
        );

        //current, next
        //this , next
        
        // Sort employees by salary in descending order
        employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);  // Prints sorted employees by salary
       
        System.out.println("\n");
        
        employees.stream()
        .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
        .forEach(System.out::println);  // Prints sorted employees by salary
    }
}

