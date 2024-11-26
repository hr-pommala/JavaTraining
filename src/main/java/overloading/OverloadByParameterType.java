package overloading;

public class OverloadByParameterType {
	
	 // Method with a string parameter
    public void display(String s) {
        System.out.println("String: " + s);
    }

    // Overloaded method with an integer parameter
    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    // Overloaded method with a double parameter
    public void display(double a) {
        System.out.println("Double: " + a);
    }

    public static void main(String[] args) {
    	
    	OverloadByParameterType obj = new OverloadByParameterType();
        
        // Calling overloaded methods
        obj.display("Hello!");  // Calls the method with a String
        obj.display(100);       // Calls the method with an integer
        obj.display(3.14);      // Calls the method with a double
    }

}
