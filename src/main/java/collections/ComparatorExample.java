package collections;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(2, "Alice"), new Student(1, "Bob"),  new Student(3, "Bob"));

        // Custom sorting by name using Comparator
        students.sort(Comparator.comparing(student -> student.name));
        System.out.println("Sorted by Name: " + students);

        // Custom sorting by ID using a lambda
        students.sort((s1, s2) -> s2.id - s1.id); // Descending order
        System.out.println("Sorted by ID (Descending): " + students);
    }
}
