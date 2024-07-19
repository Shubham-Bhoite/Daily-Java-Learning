import java.util.HashSet;

public class HashSetEx4 {
    public static void main(String[] args) {
        
        int initialCapacity = 10;
        float loadFactor = 0.75f; 

        HashSet<String> set = new HashSet<>(initialCapacity, loadFactor);

        set.add("apple");
        set.add("banana");
        set.add("cherry");

        System.out.println("HashSet contains: " + set);
    }
}
