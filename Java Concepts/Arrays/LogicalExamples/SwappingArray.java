import java.util.Arrays;
class SwappingArray
{
	public static void main(String[] args) {
		int [] arr = {2,6,3,5,4};
		System.out.println(Arrays.toString(arr));

		for (int i=0,j=arr.length-1 ;i<arr.length/2;i++,j-- ) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}