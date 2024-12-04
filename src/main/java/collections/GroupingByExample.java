package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    
	public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 22),
            new Person("Alex", 25),
            new Person("Chris", 22)
        );

        // Group people by age
        Map<Integer, List<Person>> groupedByAge = people.stream()
                                                         .collect(Collectors.groupingBy(Person::getAge));

        groupedByAge.forEach((age, group) -> {
            System.out.println("Age " + age + ": " + group);
        });
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}
