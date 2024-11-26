package overloading;

public class OverloadWithVarargs {

	// Method with varargs
    public void display(int... numbers) {
        System.out.print("In display with single method arguments \nNumbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    
	// Method with multiple argumets varargs. VarAgrs should be last argument
    public void display(String st, int... numbers) {
        
    	System.out.print("In display with multiple method arguments \nNumbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
     }

    public static void main(String[] args) {
    	
    	OverloadWithVarargs obj = new OverloadWithVarargs();
        
        // Calling overloaded methods with different numbers of arguments
        obj.display(1);          // Calls method with one argument
        obj.display(1, 2, 3,4, 5);    // Calls method with multiple arguments
        obj.display();           // Calls method with no arguments
        obj.display("Hello World", 1, 2, 3);    // Calls method with multiple arguments
    }
    
}
