import java.util.Scanner;
class IfElseIfVowels{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any Alphabets ==> ");
	String s = sc.next().toLowerCase();

	if(s.equals("a"))
	{
		System.out.println("Alphabet is a vowel");
	}else if(s.equals("e"))
	{
		System.out.println("Alphabet is a vowel");
	}else if(s.equals("i"))
	{
		System.out.println("Alphabet is a vowel");
	}else if(s.equals("o"))
	{
		System.out.println("Alphabet is a vowel");
	}else if(s.equals("u"))
	{
		System.out.println("Alphabet is a vowel");
	}else {
		System.out.println("Alphabet is a Consonents");
	}
         }
}