import java.util.Scanner;
class CheckMarryOrNot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age == ");
		int age = sc.nextInt();
		
		System.out.print("Enter your property == ");
		double prop = sc.nextDouble();

		System.out.print("Enter your Surname == ");
		String surName = sc.next().toUpperCase();

		if((age >=21 && prop>=10000000) || (surName.equals("AMBANI")))
		{
			System.out.println("He is eligible for marrying");
		}
		else{
			System.out.println("He is Not eligible for marrying");
		}
	}
}
		