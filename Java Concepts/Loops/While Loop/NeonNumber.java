class NeonNumber
{
	public static void main(String[] args) {
		int num=1;
		int sqr=num*num;
		int sum=0;
		while(sqr>0)
		{
			int rem=sqr%10;
			sum += rem;
			sqr /= 10;
		}
		if(sum==num){
			System.out.println(num + " is a Neon number");
		}else{
			System.out.println(num + " is Not Neon number");
		}
	}
}