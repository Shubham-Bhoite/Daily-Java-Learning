import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Creating a list of elements
        List<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
        
        // Getting the list iterator
        ListIterator<String> listIterator = list.listIterator();
        
        // Using hasNext() and next()
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println("Next Element: " + element);
        }
        
        // Using hasPrevious() and previous()
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println("Previous Element: " + element);
        }
        
        // Using nextIndex() and previousIndex()
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            System.out.println("Next Index: " + nextIndex);
            listIterator.next();
        }
        
        while (listIterator.hasPrevious()) {
            int previousIndex = listIterator.previousIndex();
            System.out.println("Previous Index: " + previousIndex);
            listIterator.previous();
        }
        
        // Reset the iterator to the start of the list
        listIterator = list.listIterator();
        
        // Using remove()
        if (listIterator.hasNext()) {
            listIterator.next();
            listIterator.remove();
        }
        
        // Using set()
        if (listIterator.hasNext()) {
            listIterator.next();
            listIterator.set("Updated Element");
        }
        
        // Using add()
        listIterator.add("New Element");
        
        // Printing the final list
        System.out.println("Final List: " + list);
    }
}
