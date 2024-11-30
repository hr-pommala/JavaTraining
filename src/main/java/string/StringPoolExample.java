package string;

public class StringPoolExample {
	
    public static void main(String[] args) {
    	
        String str1 = "hello"; // String literal, stored in String Pool
        String str2 = new String("hello"); // New object, not stored in the pool

        System.out.println(str1 == str2); // false, because str2 is a new object
        System.out.println(str1 == str2.intern()); // true, str2 is interned and refers to str1
    }
}

