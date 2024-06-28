import java.util.Arrays;

class Merge2DArray
{
	public static void main(String[] args) {
		int [][] a = {{10,20,30},{40,50,60,70}};

		//to get length of 2d array
		int len=0;
		for (int [] i :a ) 
			len+=i.length;

		//new array created using len
		int [] narr = new int[len];
		int indx=0;

		//iterating 2d array using for each loop and initialize the element
		for(int [] i:a)
			for(int j:i)
				narr[indx++]=j;

		//print using toString()
			System.out.println(Arrays.toString(narr));
	}
}