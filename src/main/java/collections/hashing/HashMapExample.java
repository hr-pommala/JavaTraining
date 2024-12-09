package collections.hashing;

import java.util.HashMap;
import java.util.Map;


//when duplicate key is added to map , it will replace the value of old one with new value
public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 55);
        map.put("Bob", 90);
        map.put("Charlie", 75);
        map.put(null, null);
     //   map.put(null, null);

        System.out.println("Charlie's Score: " + map.get("Alice"));
        System.out.println(map.size());
        
        map.put("Alice", 75);
        System.out.println("Charlie's Score: " + map.get("Alice"));
        System.out.println(map.size());
        System.out.println("bsf Score: " + map.get("bsf"));
    }
}

// Bucket -> id, values
/*
    HasCode 			Values
B1   123 			 --> V1, V2, V6
B2   213  			 --> V3, V4, V6
B3   312			 --> V5 ,V6

Student - Alice, 50

Hashcode -> will determine which bucket it belongs to
Equals -> will determine the contenet of the value, equals or not


Hascode Equals
  Y       Y
  Y       N
  N       N
  
 */

