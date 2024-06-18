//write java program to convert first letter in upperCase and rest into lowercase

import java.util.Scanner;
class StringEx1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String name=sc.next().toLowerCase();

		String firstLetter = name.substring(0,1).toUpperCase();
		String remainingLetter = name.substring(1,name.length());
		String merge=firstLetter.concat(remainingLetter);
		System.out.println(merge);
	}
}