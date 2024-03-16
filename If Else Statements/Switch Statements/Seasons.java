import java.util.Scanner;
class Seasons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month  ==> ");
		String month = sc.next().toUpperCase();

		switch(month)
		{
		case "OCT" : System.out.println(month + " its winter");break;
		case "NOV" : System.out.println(month + " its winter");break;
		case "DEC" : System.out.println(month + " its winter");break;
		case "JAN" : System.out.println(month + " its winter");break;
		case "FEB" : System.out.println(month + " its summer");break;
		case "MAR" : System.out.println(month + " its summer");break;
		case "APR" : System.out.println(month + " its summer");break;
		case "MAY" : System.out.println(month + " its summer");break;
		case "JUN" : System.out.println(month + " its rainy");break;
		case "JUL" : System.out.println(month + " its rainy");break;
		case "AUG" : System.out.println(month + " its rainy");break;
		case "SEP" : System.out.println(month + " its rainy");break;
		default : System.out.println("Invalid Input");break;

		}
	}
}