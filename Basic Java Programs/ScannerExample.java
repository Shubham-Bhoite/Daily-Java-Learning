import java.util.Scanner;
class ScannerExample
{
	public static void main(String[] args)
	 {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your name : ");
	String name = sc.next().toLowerCase();
	char ch = name.charAt(1);
	System.out.println("Hi my name is " + name + "and my first character is " + ch);

	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	{
		System.out.println("Character " + ch + "is a vowel.");
	}else{
		System.out.println("Character " + ch + "is a consonent.");
	}
	}
}








|