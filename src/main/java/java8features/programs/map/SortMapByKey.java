package java8features.programs.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByKey {
	
    public static void main(String[] args) {
    	
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");

        // Sort map by keys (ascending order)
        Map<Integer, String> sortedByKey = map.entrySet()
                                              .stream()
                                              .sorted(Map.Entry.comparingByKey())
                                              .collect(Collectors.toMap(
                                                  Map.Entry::getKey,
                                                  Map.Entry::getValue,
                                                  (e1, e2) -> e1,  // In case of duplicate keys (not expected here)
                                                  LinkedHashMap::new // Preserve insertion order
                                              ));

        //FIFO
        sortedByKey.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

