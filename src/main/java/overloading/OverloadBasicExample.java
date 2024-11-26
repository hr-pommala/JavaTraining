package overloading;

public class OverloadBasicExample {

    // Method with one integer parameter
    public void display(int a) {
        System.out.println("int: " + a);
    }

    // Overloaded method with two integer parameters
    public void display(int a, int b) {
        System.out.println("Two integers: " + a + ", " + b);
    }

    // Overloaded method with three integer parameters
    public void display(int a, int b, int c) {
        System.out.println("Three integers: " + a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {
       
    	OverloadBasicExample obj = new OverloadBasicExample();
        
        // Calling overloaded methods
        obj.display(10);          // Calls the method with one integer
        obj.display(10, 20);      // Calls the method with two integers
        obj.display(10, 20, 30);  // Calls the method with three integers
    }
}

