package string;

public class StringPoolComparison {
	
    public static void main(String[] args) {
    	
    	String s1 = "hello";  // Stored in string pool
        String s2 = "hello";  // Refers to the same object in the pool
        String s3 = new String("hello");  // Creates a new object in the heap
        
        System.out.println(s1 == s2); // true, they refer to the same object in the pool
        System.out.println(s1 == s3); // false, s3 refers to a new object in heap
    }
}

