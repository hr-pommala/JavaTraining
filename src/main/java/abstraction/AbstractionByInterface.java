package abstraction;

interface IAnimal {
    // Abstract method
    void sound();

    // Default method
    default void sleep() {
        System.out.println("This animal is sleeping");
    }
}

class Sheep implements IAnimal {
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

