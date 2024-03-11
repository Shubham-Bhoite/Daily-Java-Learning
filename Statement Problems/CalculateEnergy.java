import java.util.Scanner;
class CalculateEnergy{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Amount Of Water ==> ");
		double water=sc.nextDouble();
		System.out.print("Enter Initial Temp ==> ");
		double initTemp=sc.nextDouble();
		System.out.print("Enter Final Temp ===> " );
		double finalTemp=sc.nextDouble();

		double q=water*(finalTemp-initTemp)*4184;
		System.out.println("Energy Needed is ==> "+q);
	}
}
