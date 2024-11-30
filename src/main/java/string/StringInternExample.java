package string;

/*
 * The String.intern() method can be used to explicitly add a string to the string pool. 
 * If the string already exists in the pool, it returns the reference to the pooled string;
 *  otherwise, it adds the string to the pool.
 */
public class StringInternExample {
	
	public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = s1.intern(); // Adds the string to the pool
        
        System.out.println(s1 == s2); // false, because s1 is a new object
        System.out.println(s2 == "java"); // true, because s2 refers to the pooled string
    }
	

}
