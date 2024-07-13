import java.util.*;
class RetainAll{
	public static void main(String[] args) {
		List list = new ArrayList();
		for(int i=0;i<100;i+=10)
			list.add(i);
		System.out.println(list);

		List list1 = new ArrayList();
		for(int i=0; i<=50; i+=10)
			list1.add(i);
		System.out.println(list1);

		System.out.println(list.retainAll(list1));
		System.out.println(list);
	}
}