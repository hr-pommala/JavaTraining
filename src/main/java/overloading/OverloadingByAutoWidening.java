package overloading;

public class OverloadingByAutoWidening {
	
	 // Method with an int parameter
    public void display(int a) {
        System.out.println("int value: " + a);
    }

    // Method with a double parameter
    public void display(double a) {
        System.out.println("double value: " + a);
    }

    // Method accepting long
    public void display(long a) {
        System.out.println("long: " + a);
    }
    
    public static void main(String[] args) {
    	
    	OverloadingByAutoWidening obj = new OverloadingByAutoWidening();

        // Passing an int value
        obj.display(10);  // Calls the display(int a) method

        // Passing a float value - Auto-widened to double
        obj.display(10.5f);  // Calls the display(double a) method (float is auto-widened to double)
        
        // Passing a double value
        obj.display(20.5);  // Calls the display(double a) method
        
        //// Passing a long value
        obj.display(10L);     // Calls display(long)
    }

}
