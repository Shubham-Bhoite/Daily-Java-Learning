import java.util.Scanner;
class RunwayLength{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Velocity==> ");
		double velocity=sc.nextDouble();
		System.out.print("Enter Acc ==> ");
		double acc=sc.nextDouble();
		double runwayLength=(velocity*velocity)/(2*acc);
		System.out.println("Runway Length is ===> "+runwayLength);
		


	}
}
