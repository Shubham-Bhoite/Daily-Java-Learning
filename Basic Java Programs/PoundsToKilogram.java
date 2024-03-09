import java.util.Scanner;
class PoundsToKilogram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number in Pounds : ");
		double numberInPound = sc.nextDouble();
		double kilogram = numberInPound * 0.454;
		System.out.println(numberInPound + " Pound is " + kilogram + "kilogram");
	}
}
		
		