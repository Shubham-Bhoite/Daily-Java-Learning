import java.util.Scanner;
class EmployeePay
{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter employee monthy target score == ");
	double tarScore = sc.nextDouble();

	System.out.print("Enter employee's current salary == ");
	double currSalary = sc.nextDouble();

	double newSalary;

	if(tarScore >90)
	{
		newSalary = currSalary * 1.03;
	}else{
		newSalary = currSalary * 1.01;
	}
		System.out.println("The new salary is ==> " + newSalary);
	}
}