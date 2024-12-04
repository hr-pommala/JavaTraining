package abstraction;

abstract class Animal {
	
	//Authentication, authorizing
	
    // Abstract method // Generic method
    abstract void sound();

    // Regular method
    public void sleep() {
        System.out.println("This animal is sleeping");
    }
    
    //UserName and password
    public boolean authentication(boolean test) {
    	if(test) {
        System.out.println("Authentication success");
        return true;
    	}
    	else {
    		System.out.println("Authentication failed");
    		return false;
    	}
    		
    }
    
    //
    public boolean authorization(boolean test) {
    	if(test) {
            System.out.println("authorization success");
            return true;
        	}
        	else {
        		System.out.println("authorization failed");
        		return false;
        	}
    }
       
}

class Dog  extends Animal  {
	
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("The dog barks");
    } 
}

class Cat extends Animal  {
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

        
       if( myDog.authentication(true)) {
    	   if( myDog.authorization(false)) {
    		   myDog.sleep();  // Output: This animal is sleeping
    	   }
       }
    	

       if( myCat.authentication(true)) {
    	   if( myCat.authorization(true)) {
    		   myCat.sleep();  // Output: This animal is sleeping
    	   }
       }
    	
    	
       
    }
}


