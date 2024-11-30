package string;

import java.util.HashMap;

public class WordFrequency {
	
    public static void main(String[] args) {
    	
        String str = "java java python java";
        String[] words = str.split(" ");
        
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
