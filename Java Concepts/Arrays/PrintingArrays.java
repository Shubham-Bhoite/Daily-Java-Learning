import java.util.Arrays;
class PrintingArrays
{
	public static void main(String[] args) {
		int []arr = {10,20,30,40,50};
		int l=arr.length;

		// 1.for loop
		for (int i=0;i<l ;i++ ) 
			System.out.println(arr[i]);
		
		// 2.while loop
		int j=0;
		while(j<l){
			System.out.println(arr[j]);
			j++;
		}

		// 3.do while loop
		int k=0;
		do{
			System.out.println(arr[k]);
			k++;
		}while(k<l);

		// 4.for each loop
		for(int i:arr)
			System.out.println(i);


		System.out.println(Arrays.toString(arr));
	}
}