import java.util.HashSet;

public class HashSetEx3 {
    public static void main(String[] args) {
        
        int initialCapacity = 20; 
        HashSet<Integer> set = new HashSet<>(initialCapacity);

        set.add(5);
        set.add(10);
        set.add(15);

        System.out.println("HashSet contains: " + set);

    }
}
