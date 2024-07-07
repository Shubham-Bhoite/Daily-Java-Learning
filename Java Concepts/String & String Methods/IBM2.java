class IBM2
{
	public static void main(String[] args) {
		int[] arr = {6,6,1,6,3,4,6,8};
		int pos=2;
		int ele=arr[pos];
		int count=0;

		for(int i=0;i<arr.length;i++)
		{
			if(i<pos && arr[i]>ele)
			{
				count++;
			}else if(i>pos && arr[i]<ele)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}