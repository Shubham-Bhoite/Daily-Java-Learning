import java.util.*;
class AddEx1{
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);

	Collection coll = new ArrayList();
	System.out.println(coll);
	coll.add(10);
	coll.add(30);
	coll.add(20);
	System.out.println(coll);
	coll.addAll(arrayList);
	System.out.println(coll);
	}
}