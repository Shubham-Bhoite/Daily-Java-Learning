//Write java program to fetch the prime numbers that is stored in array

class StringEx6
{
	public static void main(String[] args) {
		int[] arr={2,8,5,4,7,9,13,14,15,16,17,18,19,21,23,25,26,27,28,29};

		for(int i=0; i<arr.length;i++)
		{
			int count=0;
			for(int j=1; j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(arr[i]+"");
			}
		}
	}
}