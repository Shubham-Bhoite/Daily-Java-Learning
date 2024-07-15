import java.util.*;
class ArrayListCon1{
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();

		//initial capacity==>10
		for(int i=10; i<=100; i+=10)
		{
			obj.add(i);
		}
		System.out.println(obj);
		obj.add(110);
		//new capacity==> (initial capacity *3/2)+1

	}
}