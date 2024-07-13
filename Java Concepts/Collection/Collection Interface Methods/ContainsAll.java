import java.util.*;

class ContainsAll{
	public static void main(String[] args) {
		List list = Arrays.asList(10,20,30,40);
		System.out.println(list);

		List list2 = Arrays.asList(20,30);
		System.out.println(list.containsAll(list2));

		List list1 = Arrays.asList(40,50,90);
		System.out.println(list.containsAll(list1));
	}
}