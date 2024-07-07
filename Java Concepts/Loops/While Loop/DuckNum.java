import java.util.*;
class DuckNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		String num = sc.next();
		if(num.charAt(0)=='0')
		{
			System.out.println(num + " is not a duck number");
		}
		else{
			System.out.println(num + " it is a duck number");
		}
	}
}