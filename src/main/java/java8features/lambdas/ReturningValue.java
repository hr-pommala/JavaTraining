package java8features.lambdas;

public class ReturningValue {
	
    public static void main(String[] args) {
    	
        // Lambda that returns a value
        StringLength getLength = str -> str.length();
        System.out.println(getLength.getLength("Hello!"));  // Prints: 6
        
    }
}

@FunctionalInterface
interface StringLength {
    int getLength(String str);
}

