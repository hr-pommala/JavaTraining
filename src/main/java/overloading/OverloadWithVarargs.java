package overloading;

public class OverloadWithVarargs {

	// Method with varargs
    public void display(int... numbers) {
        System.out.print("Numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	
    	OverloadWithVarargs obj = new OverloadWithVarargs();
        
        // Calling overloaded methods with different numbers of arguments
        obj.display(1);          // Calls method with one argument
        obj.display(1, 2, 3);    // Calls method with multiple arguments
        obj.display();           // Calls method with no arguments
    }
    
}
