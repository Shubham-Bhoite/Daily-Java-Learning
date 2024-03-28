class EmirpNumber
{
	public static void main(String[] args) {
		int num=17;
		int count=0;
		for(int i=2; i<num; i++)
		{
			if(num%i==0){
				count++;
				break;
			}
		}
		boolean flag= count==0?true:false;

		if(flag)
		{
			int rev = 0;
			while(num>0)
			{
				int rem = num%10;
				rev =rev*10+rem;
				num /=10;
			}

			int count1=0;
			for(int i=2; i<rev; i++)
			{
				if(rev%i==0){
					count1++;
					break;
				}
			}
			boolean flag1= count1==0?true:false;

			if(flag && flag1){
				System.out.println("Emirp Number");
			}else{
				System.out.println("Not Emirp Number");
			}
		}
		else{
			System.out.println("Not Emirp Number");
		}
	}
}