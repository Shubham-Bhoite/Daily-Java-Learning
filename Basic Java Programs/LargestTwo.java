import java.util.Scanner;
class LargestTwo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the number 2 : ");
		int num2 = sc.nextInt();

		int large = (num1 > num2) ? num1 : num2;
		System.out.println(large+ " is largest from " + num2 + " and" + num1);
	}
}