import java.util.Scanner;
class MinutesToYears
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  a Minutes : ");
		long uMinutes = sc.nextLong();
		double mToHrs = uMinutes / 60;
		double hToDays = mToHrs / 24;
		double dToYears = hToDays / 365;
		double dToDays = hToDays % 365;

		System.out.println(uMinutes + "Minutes are " + " "+ (int)dToYears + "Years" +" " + (int)dToDays + "Days");
	}
}