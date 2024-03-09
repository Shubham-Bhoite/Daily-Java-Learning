import java.util.Scanner;
class FeetToMeter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number in Feet : ");
		double value = sc.nextDouble();
		double meter = value * 0.305;
		System.out.println(value + " Feet is = " + meter + " meters" );
	}
}