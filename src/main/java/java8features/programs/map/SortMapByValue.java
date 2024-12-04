package java8features.programs.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {
	
    public static void main(String[] args) {
    	
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");

        // Sort map by values (ascending order)
        Map<Integer, String> sortedByValue = map.entrySet()
                                                .stream()
                                                .sorted(Map.Entry.comparingByValue())
                                                .collect(Collectors.toMap(
                                                    Map.Entry::getKey,
                                                    Map.Entry::getValue,
                                                    (e1, e2) -> e1,  // In case of duplicate values
                                                    LinkedHashMap::new // Preserve insertion order
                                                ));

        sortedByValue.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

