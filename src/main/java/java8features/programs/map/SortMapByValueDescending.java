package java8features.programs.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValueDescending {
	
    public static void main(String[] args) {
    	
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");

        // Sort map by values (descending order)
        Map<Integer, String> sortedByValueDesc = map.entrySet()
                                                    .stream()
                                                    .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                                                    .collect(Collectors.toMap(
                                                        Map.Entry::getKey,
                                                        Map.Entry::getValue,
                                                        (e1, e2) -> e1,  // In case of duplicate keys
                                                        LinkedHashMap::new // Preserve insertion order
                                                    ));

        sortedByValueDesc.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

