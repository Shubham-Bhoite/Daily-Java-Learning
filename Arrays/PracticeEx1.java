import java.util.Arrays;
class PracticeEx1
{
	public static void main(String[] args) {
		int []arr = {5,6,7,8,9,10};
		int s=arr.length;

		// 1.for loop
		for (int i=0;i<s ;i++ ) 
			System.out.println(arr[i]);
		
		// 2.while loop
		int j=0;
		while(j<s){
			System.out.println(arr[j]);
			j++;
		}

		// 3.do while loop
		int k=0;
		do{
			System.out.println(arr[k]);
			k++;
		}while(k<s);

		// 4.for each loop
		for(int i:arr)
			System.out.println(i);

		// 5.toString method
		System.out.println(Arrays.toString(arr));
	}
}