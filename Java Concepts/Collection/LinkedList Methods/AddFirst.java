import java.util.*;
class AddFirst{

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		list.addFirst(50);
		System.out.println(list);
		

	}
}