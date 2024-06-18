//Write java program to get the ASCII values of all the characters from the string dynamically

import java.util.Scanner;
class StringEx2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String data = sc.next();

		for (int i=0;i<data.length() ;i++ ) {
			char data2=data.charAt(i);
			int asciiData= data2;
			System.out.println(asciiData+" " + ":"+data.charAt(i));
		}
	}
}
