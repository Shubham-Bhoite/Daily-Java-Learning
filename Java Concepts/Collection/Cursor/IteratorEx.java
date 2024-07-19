import java.util.*;
class IteratorEx
{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=10; i<=100; i+=10)
			list.add(i);

		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			iterator.remove();
		}
		System.out.println(list);
	}
}