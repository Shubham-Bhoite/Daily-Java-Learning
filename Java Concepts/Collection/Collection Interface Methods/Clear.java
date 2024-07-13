import java.util.*;
class Clear{
	public static void main(String[] args) {
		List<Integer> integer = new ArrayList<>();
		System.out.println(integer.isEmpty());
		for(int i=1; i<=10; i++)
		{
			integer.add(i);
		}
		System.out.println(integer.isEmpty());
		integer.clear();
		System.out.println(integer.isEmpty());
	}
}