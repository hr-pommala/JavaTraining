package java8features.lambdas;

public class BlockofCode {
	
	public static void main(String[] args) {
        // Lambda expression with a block of code
        MathOperation multiply = (a, b) -> {
            int result = a * b;
            return result;
        };
        
        System.out.println(multiply.operate(3, 4));  // Prints: 12
    }
	
	@FunctionalInterface
	interface MathOperation {
	    int operate(int a, int b);
	}

}
