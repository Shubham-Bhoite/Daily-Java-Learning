import java.util.Scanner;
class SquareRoot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		boolean flag=false;
		int sqrrt=0;
		for(int i=1; i<=num/2; i++)
		{
			if(i*i==num){
				flag=true;
				sqrrt=i;
				break;
			}
		}
		if(flag){
			System.out.println(sqrrt + " is a perfect square root of num " + num);
		}else{
			System.out.println(num + " do not have a perfect square root");
		}
	}
}