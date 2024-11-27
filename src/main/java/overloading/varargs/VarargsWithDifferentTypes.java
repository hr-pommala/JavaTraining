package overloading.varargs;

public class VarargsWithDifferentTypes {

	// Method with varargs for Strings
    public void printNames(String... names) {
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
    	VarargsWithDifferentTypes example = new VarargsWithDifferentTypes();

        // Invoking the method with no parameters
        example.printNames();  // Output: No names provided.

        // Invoking the method with multiple String parameters
        example.printNames("Alice", "Bob", "Charlie");  // Output: Names: Alice Bob Charlie
    }
}
