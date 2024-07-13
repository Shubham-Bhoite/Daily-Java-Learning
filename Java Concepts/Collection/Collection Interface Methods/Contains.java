import java.util.*;
class Contains{
	public static void main(String[] args) {
		List list = Arrays.asList(40,50,20,30,10);
		System.out.println(list.contains(40));
		System.out.println(list.contains(50));
		System.out.println(list.contains("70"));
		System.out.println(list);

		TreeSet<Integer> set = new TreeSet<>(list);
		System.out.println(set);
		System.out.println("70");
		
	}
}