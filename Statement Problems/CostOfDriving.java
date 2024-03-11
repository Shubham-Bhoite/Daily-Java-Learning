import java.util.Scanner;
class CostOfDriving{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Distance Of Destination ==> ");
		double destinationInKm=sc.nextDouble();
		System.out.print("Enter the Miles Per Gallon ==> ");
		double milesPerGallon=sc.nextDouble();
		System.out.print("Enter the Price Per Gallon ==> ");
		double pricePerGallon=sc.nextDouble();

		double totalPrice=(destinationInKm/milesPerGallon)*pricePerGallon;
		System.out.println("Total Cost Of Driving is ==> "+(float)totalPrice);
	}
}
