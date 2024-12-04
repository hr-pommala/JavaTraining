package java8features.lambdas;

public class SingleParameter {
	
	 public static void main(String[] args) {
	      
		 // Lambda expression with one parameter
	     MyFunction printLength = (str) -> System.out.println(str.length());
	     printLength.apply("Hello Lambda!");  // Prints: 13
	    
	 }
	 
	 
	 @FunctionalInterface
	 interface MyFunction {
	     void apply(String str);
	 }

}
