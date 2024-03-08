import java.util.Scanner;
class AlphabetOrNot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character  : ");
		char ch = sc.next().charAt(0);
		System.out.println(((ch>='A'&&ch<='Z')|| (ch>='a'&&ch<='z'))?"alphabet" : "not alphabet");
	}
}