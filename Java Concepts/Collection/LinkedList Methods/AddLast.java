import java.util.*;
class AddLast{

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		list.addLast(50);
		System.out.println(list);
		

	}
}