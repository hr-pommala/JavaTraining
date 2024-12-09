package java8features.programs.map;

import java.util.*;
import java.util.stream.*;

public class SortMapByMultipleCriteria {
	
    public static void main(String[] args) {
    	
        Map<Integer, String> map = new HashMap<>();
       
        map.put(1, "Banana");
        map.put(4, "Orange");
        map.put(2, "Banana");
        map.put(3, "Apple");

        // Sort by value, then by key if values are equal
        Map<Integer, String> sortedMap = map.entrySet()
                                            .stream()
                                            .sorted(Map.Entry.<Integer, String>comparingByValue()
                                                            .thenComparing(Map.Entry.comparingByKey()))
                                            .collect(Collectors.toMap(
                                                Map.Entry::getKey,
                                                Map.Entry::getValue,
                                                (e1, e2) -> e1,  // In case of duplicate keys
                                                LinkedHashMap::new // Preserve insertion order
                                            ));

        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
