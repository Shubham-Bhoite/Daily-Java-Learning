import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args) {
		int num=13;
		int dup=num;
		int sum =0;
		int product =1;
		
	while(num !=0){
		int rem = num%10;
		sum += rem;
		product *= rem;
		num /=10;

	}
	System.out.println((product==sum)?dup+ " Spy Number" :dup + " Not Spy Number");
}
}