import java.util.*;
class IBMExample
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String :");
		String str = sc.nextLine();
		String []words = str.split(" ");
		String op="";
		int max=0;
		for(String i :words)
		{
			int len = i.length();
			if(max<len && len%2==0)
			{
				max=len;
				op=i;
			}
		}
		System.out.println(str + " : " + op);
	}
}