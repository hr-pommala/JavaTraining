package java8features.programs.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
       
		// Create a new HashMap
        Map<String, String> map = new HashMap<>();

        // Insert key-value pairs
        map.put("name", "John Doe");
        map.put("email", "john.doe@example.com");
        map.put("phone", "123-456-7890");

        // Get value by key
        String name = map.get("name");
        System.out.println("Name: " + name);

        // Check if a key exists
        if (map.containsKey("email")) {
            System.out.println("Email: " + map.get("email"));
        }

        // Remove a key-value pair
        map.remove("phone");

        // Iterate over entries
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Handle null key and value
        map.put(null, "Null Value");
        System.out.println("Null key: " + map.get(null));
    }

}
