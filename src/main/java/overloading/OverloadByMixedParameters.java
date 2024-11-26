package overloading;

public class OverloadByMixedParameters {
	
	// Method with an integer and a string parameter
    public void display(int a, String b) {
        System.out.println("Integer: " + a + ", String: " + b);
    }

    // Overloaded method with a string and an integer parameter
    public void display(String b, int a) {
        System.out.println("String: " + b + ", Integer: " + a);
    }

    public static void main(String[] args) {
    	
    	OverloadByMixedParameters obj = new OverloadByMixedParameters();
        
        // Calling overloaded methods
        obj.display(10, "Java");  // Calls the method with integer first
        obj.display("Java", 10);  // Calls the method with string first
    }

}
