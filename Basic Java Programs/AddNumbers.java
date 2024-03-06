import java.util.Scanner;
class AddNumbers
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st string - ");
		String a = sc.next();
		sc.nextLine();
		System.out.print("Enter 2nd string - ");
		String b = sc.nextLine();
		System.out.print("Enter character - ");
		char ch = sc.next().charAt(1);
		System.out.println("a - " + a);
		System.out.println("b - " + b);
		System.out.println("ch - " + ch);
	}
}