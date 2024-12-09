package collections.hashing;

import java.util.LinkedList;

class HashTable<K, V> {
    private static final int SIZE = 10;
    private LinkedList<Entry<K, V>>[] table;

    static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(K key) {
    	System.out.println("Hashcode "+key.hashCode());
        return Math.abs(key.hashCode() % SIZE);
    }

    public void put(K key, V value) {
        int index = hash(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        System.out.println("index "+index);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void printTable() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Entry<K, V> entry : table[i]) {
                System.out.print("[" + entry.key + " -> " + entry.value + "] ");
            }
            System.out.println();
        }
    }
}

public class CustomHashingExample {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.put("Alice", 85);
        hashTable.put("Bob", 90);
        hashTable.put("Charlie", 75);
        hashTable.put("Alice", 95); // Updates Alice's score
        hashTable.put("Alice1", 95);
        hashTable.put("Bob1", 90);
        hashTable.put("Charlie", 75);

        System.out.println("Charlie's Score: " + hashTable.get("Charlie"));
        System.out.println("Alice's Updated Score: " + hashTable.get("Alice"));

        System.out.println("\nHash Table Contents:");
        hashTable.printTable();
    }
}
