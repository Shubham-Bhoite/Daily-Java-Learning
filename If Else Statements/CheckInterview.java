import java.util.Scanner;
class CheckInterview
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your percentage == ");
	double per = sc.nextDouble();

	if(per > 60)
	{
		System.out.println("You are eligible for interview ");
	}else
	{
		System.out.println("You are not eligible for interview");
	}
}
}
