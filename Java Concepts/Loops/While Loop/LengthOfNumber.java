import java.util.Scanner;
class LengthOfNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number== ");
		int num = sc.nextInt();

		int length=0;

		while(num>0)
		{
			length++;
			num/=10;
		}
		System.out.println(length);
	}
}