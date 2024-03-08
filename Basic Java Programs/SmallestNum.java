import java.util.Scanner;
class SmallestNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the number 2 : ");
		int num2 = sc.nextInt();

		int small = (num1 > num2) ? num2 : num1;
		System.out.println(small  + " is  smallest among" + num1 +"and"+ num2);
	}
}