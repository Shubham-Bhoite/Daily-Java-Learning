//1.write java program to fetch all the factors in an array
//2.write java program to find the factors of a number and stored all the factors in an array
//3.WAJP find sum of all  at even indexes.
//4. WAJP first 10 prime numbers in new array.

import java.util.Array;
class StringEx7
{
	static int[] factorsArray;
	static int[] factorsCount;
	public static void main(String[] args) {
		int num=12;
		

		for(int i=1; i<=num;i++)
		{
			if(num%i==0)
			{
				factorsCount++;
			}
		}
		factorsArray=new int[factorsCount];
		int itt1=0;
		for(int j=1; j<=num;j++)
		{
			if(num%j==0)
			{
				factorsArray[itt1++]=j;
			}
		}
		System.out.println(Arrays.toString(factorsArray));
	}
}