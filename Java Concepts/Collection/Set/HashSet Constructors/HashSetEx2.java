import java.util.ArrayList;
import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");

        HashSet<String> set = new HashSet<>(arrayList);
        set.add("mango");

        System.out.println("HashSet contains: " + set);
    }
}
