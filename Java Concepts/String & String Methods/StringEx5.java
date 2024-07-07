import java.util.Scanner;
class StringEx5{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String input = sc.next();

		System.out.println("Enter the character to remove the occurences ");
		String ch = sc.next();

		String modified= input.replace(ch,"");
		System.out.println(modified);
		
	}
}