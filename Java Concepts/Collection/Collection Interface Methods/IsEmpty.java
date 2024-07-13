import java.util.*;
class IsEmpty{
	public static void main(String[] args) {
		Collection coll = null;
		System.out.println(coll.isEmpty());

		coll = new ArrayList();
		System.out.println(coll.isEmpty());

		List list = Arrays.asList(1,2,3);
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list.isEmpty());
	}
}