import java.util.*;

class ArrayListCon3{
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);

		ArrayList list = new ArrayList(ll);
		System.out.println(list);

	}
}