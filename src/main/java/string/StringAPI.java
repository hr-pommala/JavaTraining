package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringAPI {
	
    public static void main(String[] args) {
    	
    	//Join Method
        String[] words = {"Java", "is", "awesome"};
        String sentence = String.join(" ", words);
        System.out.println(sentence); // Output: Java is awesome
        
        
        //Split
        String str = "apple,banana,orange";
        Arrays.stream(str.split(",")) .forEach(System.out::println);
        
        String toChars = "Java8";
        toChars.chars()
           .mapToObj(c -> (char) c)
           .forEach(System.out::println);
        
        //replaceAll
        String replaceAll = "The quick brown fox";
        String result = replaceAll.replaceAll("\\s", "_"); // Replace spaces with underscores
        System.out.println(result); // Output: The_quick_brown_fox
        
        
        //joining method
        List<String> strJoining = Arrays.asList("Java", "8", "Streams");
        String resultJoining = strJoining.stream()
                             .collect(Collectors.joining(" "));
        System.out.println(resultJoining); // Output: Java 8 Streams
        
        
        //String Trim
        String strTrim = "   Hello World!   ";
        System.out.println("Original: '" + strTrim + "'");
        System.out.println("Trimmed: '" + strTrim.trim() + "'");
        
        //toCase
        String toCase = "Java8";
        System.out.println(toCase.toLowerCase()); // Output: java8
        System.out.println(toCase.toUpperCase()); // Output: JAVA8
        
        //contains
        String strContains = "Java programming";
        if (strContains.contains("Java")) {
            System.out.println("The string contains 'Java'");
        } else {
            System.out.println("The string does not contain 'Java'");
        }
        
        
        //Starts with
        String stStartsWithr = "Java Programming";
        
        if (stStartsWithr.startsWith("Java")) {
            System.out.println("The string starts with 'Java'");
        }
        
        if (stStartsWithr.endsWith("Programming")) {
            System.out.println("The string ends with 'Programming'");
        }	
        
    }

}
