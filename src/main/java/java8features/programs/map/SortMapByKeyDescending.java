package java8features.programs.map;

import java.util.*;
import java.util.stream.*;

public class SortMapByKeyDescending {
	
    public static void main(String[] args) {
    	
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");

        // Sort map by keys (descending order)
        Map<Integer, String> sortedByKeyDesc = map.entrySet()
                                                  .stream()
                                                  .sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                                                  .collect(Collectors.toMap(
                                                      Map.Entry::getKey,
                                                      Map.Entry::getValue,
                                                      (e1, e2) -> e1,  // In case of duplicate keys
                                                      LinkedHashMap::new // Preserve insertion order
                                                  ));

        sortedByKeyDesc.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

