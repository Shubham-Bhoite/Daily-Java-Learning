import java.util.*;
class EnumerationEx {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        for (int i = 10; i <= 50; i += 10) {
            list.addElement(i);
        }

        Enumeration<Integer> enumeration = list.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
