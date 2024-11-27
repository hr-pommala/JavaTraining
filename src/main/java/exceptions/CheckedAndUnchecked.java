package exceptions;

public class CheckedAndUnchecked {
	
	public static void main(String[] args) {
        try {
            // Checked exception (compilation error if not handled)
            throw new java.io.IOException("Checked exception");

            // Unchecked exception (runtime exception)
            // throw new NullPointerException("Unchecked exception");
        } catch (java.io.IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }

}
