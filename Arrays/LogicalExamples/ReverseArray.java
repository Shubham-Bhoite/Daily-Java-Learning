import java.util.Arrays;
class ReverseArray
{
	public static void main(String[] args) {
		int [] arr = {5,2,6,9,7,1,8};
		System.out.println(Arrays.toString(arr));

		for (int i=arr.length-1;i>=0 ;i-- ) {
			System.out.print(arr[i]+ " ");
		}
	}
}