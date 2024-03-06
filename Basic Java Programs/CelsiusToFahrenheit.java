import java.util.Scanner;
class CelsiusToFahrenheit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Celsius => ");
		double celsius = sc.nextDouble();
		System.out.println(celsius + " c is " + ((9.0/5*celsius)+32) + "Fahrenheit");
	}
}