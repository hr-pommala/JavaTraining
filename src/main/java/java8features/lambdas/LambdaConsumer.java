package java8features.lambdas;

import java.util.function.Consumer;

public class LambdaConsumer {
	
    public static void main(String[] args) {
        Consumer<String> print = str -> System.out.println(str);
        
        print.accept("Lambda Consumer Example!");  // Prints: Lambda Consumer Example!
    }
}
