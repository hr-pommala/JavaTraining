package java8features.lambdas;

import java8features.lambdas.SingleParameter.MyFunction;

public class BlockofCode {
	
	public static void main(String[] args) {
        // Lambda expression with a block of code
        MathOperation multiply = (a, b) -> {
            int result = a * b;
            return result;
        };
        
        //  MyFunction printLength = (str) -> { System.out.println(str.length()) };
        
        System.out.println(multiply.operate(3, 4));  // Prints: 12
    }
	
	@FunctionalInterface
	interface MathOperation {
	    int operate(int a, int b);
	}

}
