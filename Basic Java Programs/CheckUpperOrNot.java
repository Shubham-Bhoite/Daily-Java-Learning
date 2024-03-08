import java.util.Scanner;
class CheckUpperOrNot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any alphabet you want   : ");
		char ch = sc.next().charAt(0);

		String s = ((ch>='A'&&ch<='z')? (ch>='A'&&ch<='Z')?ch +" it is UpperCase alphabet" :ch + " it is LowerCase alphabet":ch + "it is not a alphabet");
		System.out.println(s);
	}
}