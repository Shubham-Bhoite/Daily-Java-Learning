import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        
        System.out.println("Original TreeSet: " + treeSet);

        // Using subSet(E start, E end) method
        SortedSet<Integer> subSet = treeSet.subSet(20, 40);
        System.out.println("SubSet from 20 to 40 (exclusive): " + subSet);

        // Using headSet(E ) method
        SortedSet<Integer> headSet = treeSet.headSet(30);
        System.out.println("HeadSet up to 30 (exclusive): " + headSet);

        // Using tailSet(E ) method
        SortedSet<Integer> tailSet = treeSet.tailSet(30);
        System.out.println("TailSet from 30 (inclusive): " + tailSet);
    }
}
