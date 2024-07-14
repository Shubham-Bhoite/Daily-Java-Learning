import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Size before ensuring capacity: " + list.size());

        list.ensureCapacity(20);

        for (int i = 4; i <= 20; i++) {
            list.add(i);
        }
        System.out.println("Size after ensuring capacity and adding elements: " + list.size());

        System.out.println("Elements in the list: " + list);
    }
}
