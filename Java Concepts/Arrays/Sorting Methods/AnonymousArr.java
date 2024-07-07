import java.util.Arrays;
class AnonymousArr
{
	public static void main(String[] args) {
		evenOdd(new int[] {1,2,3,4,5,6});
	}
	public static void evenOdd(int[] arr)
	{
		for(int i:arr){
			if(i%2==0)
				System.out.println(i + " is even");
			else
				System.out.println(i + " is odd");
		}
	}
}