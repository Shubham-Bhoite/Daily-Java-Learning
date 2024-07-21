import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        
        System.out.println("TreeSet: " + treeSet);

        // Using first() method
        Integer firstElement = treeSet.first();
        System.out.println("First element: " + firstElement);

        // Using last() method
        Integer lastElement = treeSet.last();
        System.out.println("Last element: " + lastElement);

        // Using pollFirst() method
        Integer polledFirst = treeSet.pollFirst();
        System.out.println("Polled first element: " + polledFirst);
        System.out.println("TreeSet after pollFirst(): " + treeSet);

        // Using pollLast() method
        Integer polledLast = treeSet.pollLast();
        System.out.println("Polled last element: " + polledLast);
        System.out.println("TreeSet after pollLast(): " + treeSet);
    }
}
