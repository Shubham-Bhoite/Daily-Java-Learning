//WAJP todivide the string into two parts and store those parts in separate string objects dynamically and without using predefined methods. and reverse the second half

import java.util.Scanner;
class StringEx11
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = new String(sc.next().toLowerCase());

		int divide = s.length()/2;
		String part1 = new String();
		String part2 = new String();

		if(s.length()%2==0)
		{
			for(int i=0; i<divide;i++)
			{
				char ch = s.charAt(i);
				part1 = part1+ch;
			}
			for(int i=divide;i<s.length();i++)
			{
				char ch = s.charAt(i);
				part2 = part2+ch;
			}
			String reversedPart2 = new String();
            for (int i = part2.length() - 1; i >= 0; i--) {
                char ch = part2.charAt(i);
                reversedPart2 = reversedPart2 + ch;
            }
            System.out.println(reversedPart2);
		}
		else{
			System.out.println("Please enter a even string which we can make it half.");
		}
		System.out.println(part1);
		System.out.println(part2);
	}
}