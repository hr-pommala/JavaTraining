package java8features.lambdas;

import java.util.function.Predicate;

public class LambdaPredicate {
	
    public static void main(String[] args) {
    	
        Predicate<Integer> isEven = num -> num % 2 == 0;
        
        System.out.println(isEven.test(4));  // Prints: true
        System.out.println(isEven.test(7));  // Prints: false
    }
}

