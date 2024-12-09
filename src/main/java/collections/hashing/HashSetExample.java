package collections.hashing;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate ignored
        set.add(null);

        System.out.println("Set Contents: " + set);
    }
}
