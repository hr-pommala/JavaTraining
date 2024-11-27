package overloading.varargs;

public class VarargsWithMixedDataTypes {


	 // Method with varargs parameter
    public void display(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No numbers provided.");
        } else {
            System.out.print("Numbers: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
    
	// Method with varargs for Strings
    public void display(String... names) {
        if (names.length == 0) {
            System.out.println("No names provided.");
        } else {
            System.out.print("Names: ");
            for (String name : names) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }


    
    public static void main(String[] args) {
    	VarargsWithMixedDataTypes example = new VarargsWithMixedDataTypes();

        // Invoking the method with no parameters and causes Ambiguity
    	// The method display(int[]) is ambiguous for the type VarargsWithMixedTypes
        //example.display();  //Compilation issue

        // Invoking the method with multiple String parameters
        example.display("Alice", "Bob", "Charlie");  // Output: Names: Alice Bob Charlie
        example.display(1, 2, 3, 4);
    }
}
