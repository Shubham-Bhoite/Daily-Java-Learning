import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

       
        System.out.println("TreeSet: " + treeSet);

        // Using higher(E) method
        Integer higherThan25 = treeSet.higher(25);
        System.out.println("Element higher than 25: " + higherThan25);

        // Using lower(E) method
        Integer lowerThan25 = treeSet.lower(25);
        System.out.println("Element lower than 25: " + lowerThan25);

        // Using floor(E) method
        Integer floorOf27 = treeSet.floor(27);
        System.out.println("Element less than or equal to 27: " + floorOf27);

        // Using ceiling(E) method
        Integer ceilingOf27 = treeSet.ceiling(27);
        System.out.println("Element greater than or equal to 27: " + ceilingOf27);
    }
}
