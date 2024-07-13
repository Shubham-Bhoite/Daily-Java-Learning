import java.util.*;
class ToArray{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));

		List li = new ArrayList();
		for(Integer i :arr)
			li.add(i);
		System.out.println(li);

		Object[] arr1 = li.toArray();
	}
}