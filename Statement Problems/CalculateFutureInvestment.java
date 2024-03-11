import java.util.Scanner;
class CalculateFutureInvestment{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Invested Amount in Rs. ==> ");
		double investedAmount=sc.nextDouble();
		System.out.print("Enter Interest Rate ===> ");
		double interestRate=sc.nextDouble();
		System.out.print("Enter Years Of Investment ==> ");
		double numberOfYears=sc.nextDouble();
		double monthlyIntrest=interestRate/100/12;

		double futureInvestmentValue=investedAmount*(1+monthlyIntrest*numberOfYears*12);
		System.out.println("Total Amount ==> "+futureInvestmentValue);
	}
}
