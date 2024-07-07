import java.util.Scanner;
class BMI_Calci{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Weight in Pounds ==> ");
		double weight=sc.nextDouble();
		System.out.print("Enter Your Height (Inch) ==> ");
		double height=sc.nextDouble();

		double bmi=(weight*0.45359237)/((height*0.0254)*(height*0.0254));
		System.out.println("Your BMI is ==> "+bmi);


	}
}
