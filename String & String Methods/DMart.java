import java.util.Scanner;
import java.util.Arrays;
class DMart
{

	StringBuffer fruits =new StringBuffer();
	Scanner sc = new Scanner(System.in);

	public void addFruits()
	{
		System.out.println("Add Fruits :");
		for(int i=1;i<=10;i++)
		{
			fruits.append(sc.next()+" ");
		}
		System.out.println("===========================");
	}

	public void buyFruits()
	{
		System.out.print("Enter the fruit to Buy :");
		String buyFruits=sc.next();
		String converted= new String(fruits);
		String arr[]=converted.split(buyFruits);

		System.out.println("========The Cart========");

		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("=========Thank You========");
	}
	public static void main(String[] args) {
		DMart m = new DMart();
		m.addFruits();
		m.buyFruits();
	}
}