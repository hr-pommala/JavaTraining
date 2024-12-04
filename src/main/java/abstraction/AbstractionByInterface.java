package abstraction;

import java.io.Serializable;

interface IAnimal {
    
	// Abstract method
    void sound();

    // Default method
    default void sleep() {
        System.out.println("This animal is sleeping");
    }
    
    // Default method
    default void sleep1() {
        System.out.println("This animal is sleeping-1");
    }
    
    // Default method
    default void sleep2() {
        System.out.println("This animal is sleeping-2");
    }
}

class Sheep implements IAnimal, Serializable{
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("The dog barks");
    }
}

class Goat implements IAnimal {
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("The cat meows");
    }
}

public class AbstractionByInterface {
    public static void main(String[] args) {
    	IAnimal sheep = new Sheep();  // Creating an instance of Dog
    	IAnimal goat = new Goat();  // Creating an instance of Cat

    	sheep.sound();  // Output: The dog barks
    	goat.sound();  // Output: The cat meows

        sheep.sleep();  // Output: This animal is sleeping (from default method)
    }
}

