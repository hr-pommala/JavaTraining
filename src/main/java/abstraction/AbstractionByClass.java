package abstraction;

abstract class Animal {
    // Abstract method
    abstract void sound();

    // Regular method
    public void sleep() {
        System.out.println("This animal is sleeping");
    }
}

class Dog extends Animal {
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("The cat meows");
    }
}

public class AbstractionByClass {
	
    public static void main(String[] args) {
    	Animal  myDog = new Dog();  // Creating an instance of Dog
    	Animal  myCat = new Cat();  // Creating an instance of Cat

        myDog.sound();  // Output: The dog barks
        myCat.sound();  // Output: The cat meows

        myDog.sleep();  // Output: This animal is sleeping
    }
}


