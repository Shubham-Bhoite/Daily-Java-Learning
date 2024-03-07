import java.util.Scanner;
class CalculateTip
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the subtotal :");
		double subtotal = sc.nextDouble();
		System.out.print("Enter the tip rate   : ");
		double tipRate = sc.nextDouble();
		
		double total = subtotal + tipRate*(subtotal/100);
		System.out.println("Subtotal is " + subtotal + "and the tip is " + tipRate + "so that total bill is " + total);
	}
}