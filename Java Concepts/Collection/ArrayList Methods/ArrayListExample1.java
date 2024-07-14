import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
      
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Size before trimming: " + list.size());
        System.out.println("Capacity before trimming: " + list.size());

        list.trimToSize();
        System.out.println("Size after trimming: " + list.size());
        System.out.println("Capacity after trimming: " + list.size());
    }
}
