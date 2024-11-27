package overloading.varargs;

public class VarargsWithNoParameters {

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

    public static void main(String[] args) {
    	VarargsWithNoParameters example = new VarargsWithNoParameters();

        // Invoking the method with no parameters
        example.display();  // Output: No numbers provided.

        // Invoking the method with multiple parameters
        example.display(1, 2, 3, 4);  // Output: Numbers: 1 2 3 4
    }
}
