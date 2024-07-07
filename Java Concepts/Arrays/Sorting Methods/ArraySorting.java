import java.util.Arrays;
import java.util.Collections;

class ArraySorting
{
	public static void main(String[] args) {
		Integer []a={5,4,6,7,3,2,8,9,1};
		System.out.println(Arrays.toString(a));

		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}
}