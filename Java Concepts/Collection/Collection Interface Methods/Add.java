import java.util.*;
class Add{
	public static void main(String[] args) {
		Set<Integer> arraylist = new HashSet<Integer>();
		System.out.println(arraylist.add(10));
		System.out.println(arraylist.add(null));
		System.out.println(arraylist.add(null));

		Set set = new HashSet();
		System.out.println(set.add(10));
		System.out.println(set.add(20));
		System.out.println(set.add("30"));
		System.out.println(set.add(30));
		System.out.println(set.add(40));
	}
}