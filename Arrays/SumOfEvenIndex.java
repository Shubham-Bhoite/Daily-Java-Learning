class SumOfEvenIndex
{
	public static void main(String[] args) {
		int [] arr = {4,2,6,1,7,3,5};
		int sum=0;
		for (int i=0;i<arr.length ;i++ ) {
			if(i%2==0)
				sum+=arr[i];
		}
		System.out.println(sum);
	}
}

