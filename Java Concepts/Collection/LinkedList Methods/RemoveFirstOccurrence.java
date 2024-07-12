import java.util.*;
class RemoveFirstOccurrence{

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		list.removeFirstOccurrence(20);
		System.out.println(list);
		

	}
}