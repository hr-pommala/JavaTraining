package exceptions;

public class BasicException {

	 public static void main(String[] args) {
	        try {
	            int result = 10 / 0; // This will throw an ArithmeticException
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero!");
	        } finally {
	            System.out.println("This will always be executed.");
	        }
	    }
}
