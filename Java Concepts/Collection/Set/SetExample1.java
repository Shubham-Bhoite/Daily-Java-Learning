import java.util.*;
class SetExample1{
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(null);
		hs.add("hello");
		hs.add(20);
		hs.add(40);
		hs.add("30");
		System.out.println(hs);

	}
}