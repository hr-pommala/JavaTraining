package java8features.lambdas;

public class MultipleParameters {
	
    public static void main(String[] args) {
        // Lambda expression with multiple parameters
        Sum sum = (a, b) -> a + b;
        System.out.println(sum.add(5, 10));  // Prints: 15
    }
}

@FunctionalInterface
interface Sum {
    int add(int a, int b);
}

