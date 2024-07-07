import java.util.Scanner;
class FinancialCalci{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Pagar==> ");
		double myPagar=sc.nextDouble();
		System.out.print("Enter the Interest Rate ==> ");
		double intRate=sc.nextDouble();

		double totalRokda=myPagar*(intRate/1200);
		System.out.println("Your Next Interest is ==> "+totalRokda);
	}
}
