import java.util.*;
class RemoveLastOccurrence{

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		list.removeLastOccurrence(40);
		System.out.println(list);
		

	}
}