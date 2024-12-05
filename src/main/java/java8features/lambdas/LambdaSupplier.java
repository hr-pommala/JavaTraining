package java8features.lambdas;

import java.util.function.Supplier;

public class LambdaSupplier {
	
    public static void main(String[] args) {
    	
        Supplier<String> supplyString = () -> "Hello from Supplier!";
        
        System.out.println(supplyString.get());  // Prints: Hello from Supplier!
    }
}
