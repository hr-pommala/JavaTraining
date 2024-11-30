package string;

public class StringConcatenationExample {
	
    public static void main(String[] args) {
    	
        String result = "";
        
        // Inefficient concatenation (creates a new string object each time)
        for (int i = 0; i < 1000; i++) {
            result += "java"; // Creates new string object each time
        }
        System.out.println(result);
    }
}

