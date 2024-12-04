package java8features.lambdas;

public class LambdaNoParameters {
	
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello from lambda!");
        runnable.run();  // Prints: Hello from lambda!
    }

}
