import java.util.HashSet;

public class HashSetEx1{
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("HashSet contains: " + set);
    }
}