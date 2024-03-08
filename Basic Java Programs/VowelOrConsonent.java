import java.util.Scanner;
class VowelOrConsonent
{
	public static void main(String[] args)
	 {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any Vowel or Consonent  : ");
	String alpha = sc.next().toLowerCase();
	char ch = alpha.charAt(0);
	String contain= (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ?ch+" is a vowel" :ch+ " is a consonent";
	System.out.println(contain);

	}
}








