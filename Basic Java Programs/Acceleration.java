import java.util.Scanner;
class Acceleration
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter V0 : ");
		double v0 = sc.nextDouble();
		System.out.print("Enter V1 :");
		double v1 = sc.nextDouble();

		System.out.print("Enter time : ");
		double time = sc.nextDouble();

		double avgAcc = (v1 - v0) / time;
		System.out.println("Average acceleration is : " + avgAcc);
	}
}