import java.util.*;
class ArrayListCon2{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		//initial capacity==>15
		for(int i=10; i<=150; i+=10)
		{
			al.add(i);
		}
		System.out.println(al);
		al.add(160);
		//new capacity==> (initial capacity *3/2)+1

	}
}