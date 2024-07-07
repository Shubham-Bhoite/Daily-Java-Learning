import java.util.Scanner;
class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1 ==> ");
		double num1 = sc.nextDouble();
		System.out.print("Enter operator ==> ");
		char op = sc.next().charAt(0);
		System.out.print("Enter the number 2 ==> ");
		double num2 = sc.nextDouble();

		boolean flag=true;
		double output = 0;

		switch(op)
		{
		case '+' : output = num1 + num2; break;
		case '-' : output = num1 - num2; break;
		case '*' : output = num1 * num2; break;
		case '/' : output = num1 / num2; break;
		case '%' : output = num1 % num2; break;
		default : System.out.println("Invalid operator"); flag=false;
		}
			if(flag){
				System.out.println(num1 + " " + op + " " + num2 + " = " + output);
			}
		
	
	}
}