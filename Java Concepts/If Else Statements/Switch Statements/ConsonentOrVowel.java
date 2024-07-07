import java.util.Scanner;
class ConsonentOrVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character ==> ");
		char ch = sc.next().toLowerCase().charAt(0);

		switch(ch)
		{
		case 'a' : System.out.println(ch + " is a VOWEL"); break;
		case 'e' : System.out.println(ch + " is a VOWEL"); break;
		case 'i' : System.out.println(ch + " is a VOWEL"); break;
		case 'o' : System.out.println(ch + " is a VOWEL"); break;
		case 'u' : System.out.println(ch + " is a VOWEL"); break;
		default : System.out.println(ch + " is a CONSONENT"); break;
		}

	}
}