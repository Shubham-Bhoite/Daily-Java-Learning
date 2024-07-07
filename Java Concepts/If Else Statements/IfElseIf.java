import java.util.Scanner;
class IfElseIf
{
 	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your percentage == ");
		double per = sc.nextDouble();

		if(per <35)
		{
			System.out.println("Abe bhai tu fail ho gaya");
		}else if(per < 60)
		{
			System.out.println("B second class");
		}else if(per < 75)
		{
			System.out.println("A first class");
		}else if(per < 90)
		{
			System.out.println("A+ distinction");
		}else if(per <=100)
		{
			System.out.println("First class with Distinction");
		}else{
			System.out.println("Invalid input");
		}
	}
}