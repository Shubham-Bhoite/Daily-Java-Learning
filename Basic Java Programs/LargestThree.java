import java.util.Scanner;
class LargestThree
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the number 2 : ");
		int num2 = sc.nextInt();
		System.out.print("Enter the number 3 : ");
		int num3 = sc.nextInt();

		int max = (num1 > num2 && num1>num3) ?  num1  : ((num2 > num3&&num2>num1) ? num2 : num3);
		System.out.println(max+ " is largest from " + num2 + " , "+  num3 + " and" + num1);
	}
}