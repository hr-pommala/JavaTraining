package java8features.lambdas;

public class SingleParameter {
	
	 public static void main(String[] args) {
	      
		 // Lambda expression with one parameter
	     MyFunction printLength = (str) ->  System.out.println(str.length());
	     
	     
	     printLength.apply("Hello World!");  // Prints: 13
	    
	 }
	 
	 //(String str)
	 
	 
	 @FunctionalInterface
	 interface MyFunction {
	     void apply(String str);
	 }

}
