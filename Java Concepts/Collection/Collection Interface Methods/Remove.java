import java.util.*;
class Remove{
	public static void main(String[] args) {
		Collection<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(4);
		list.add(5);
		System.out.println(list);

		if(list.contains(4))
		{
			list.remove(4);
		}else{
			System.out.println("Element not found");
		}
		System.out.println(list);
	}
}