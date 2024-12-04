package encapsulation;

public class EncapsulationExample {
	
    public static void main(String[] args) {
        // Create an object of Person class
        Person person = new Person();

        // Set values using setters
        person.setName("John Doe");
        person.setAge(5);

        //25 0 -1 5
        
        //Postive and Negative scenarios using Junit, Cucumber, 
        
        // Get values using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

