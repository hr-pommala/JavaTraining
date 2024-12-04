package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Alex", "Chris");

        // Convert List to Map with the name as key and length of the name as value
        Map<String, Integer> nameLengthMap = names.stream()
                                                  .collect(Collectors.toMap(name -> name, name -> name.length()));

        System.out.println("Name to Length Map: " + nameLengthMap);
    }
}
