import java.util.Scanner;
class DonateBlood
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your age == ");
	int age = sc.nextInt();

	if(age <20){
		System.out.println("You are kid. try after " + (20-age) + "years");
	}else{
		System.out.print("You are consume cigarette or alcohol in 24 hr (yes/no) = ");
		String check = sc.next().toLowerCase();
		if(check.equals("no")){
			System.out.print("Enter your weight = ");
			double wt = sc.nextDouble();

		if(wt >= 50){
			System.out.print("We can pump your blood ");
		}else{
			System.out.print("Go and have some food and increase your weight ");
		}
		}else{
			System.out.println("You cannot donate blood");
		}
	}
}
}