import java.util.ArrayList;
import java.util.*;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(7);
        list.add(5);
        System.out.println(list);
        
        List<Integer> list1 = list.subList(2,4);
        System.out.println(list1);
    }
}

