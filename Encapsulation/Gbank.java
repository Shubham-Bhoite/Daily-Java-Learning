import java.util.*;
class Account
{
	private String acc_name,add,pan_no;
	private long aadhar,phone_no;
	private int upiPin;
	private double balance;


	Account(String acc_name,String add,String pan_no,long aadhar,long phone_no,int upiPin,double balance)
	{
		this.acc_name= acc_name;
		this.add= add;
		this.pan_no= pan_no;
		this.aadhar= aadhar;
		this.phone_no= phone_no;
		this.upiPin=upiPin;
		this.balance = balance;
	}
	public double getBalance(int upi)
	{
		if (upi==upiPin) {
			return balance;	
		}else{
			return 0;
		}
	}
	public double depAmmount(double damm)
	{
    balance += damm; 
    System.out.println("Amount " + damm + "rs. Deposited into Your Account...........");
    System.out.println("Updated Balance is " + balance + " rs");
    return balance;
	}

	public double withdrawAmmount(int pin2)
	{
		if(pin2==upiPin)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Withdraw Ammount : ");
			double wiamm = sc.nextDouble();
			if(wiamm<balance){
				balance-=wiamm;
				System.out.println(wiamm+" is Withdraw from Account");
				System.out.println();
				System.out.println("Account Balance is : "+balance);

			}
		}
		return balance;
	}

}
class Gbank
{
	static String name,addr,pan;
	static long pho,aa;
	static int up;
	static double bal;
	public static void main(String[] args) 
	{
		for(; ; ){
		Scanner sc = new Scanner (System.in);
		System.out.println("***** Welcome To Bank *********");
		System.out.println();
		System.out.println("Click the Option for Process");
		System.out.println();
		System.out.println("1. New Account Holder ");
		System.out.println("2. Existing Acc Holder ");
		byte ch = sc.nextByte();

		switch(ch)
		{
		case 1 :
			{
				Scanner sc1 = new Scanner(System.in);
				System.out.println("* Welcome to new Account section *");
				System.out.print("Enter your name : ");
				name = sc1.nextLine();
				System.out.print("Enter your Address : ");
				addr=sc1.nextLine();
				System.out.print("Enter your Pan_no : ");
				pan = sc1.next();
				System.out.print("Enter your Aadhar no. : ");
				aa= sc1.nextLong();
				System.out.print("Enter your Phone no. : ");
				pho = sc1.nextLong();
				System.out.print("Enter your Upi-Pin : ");
				up = sc1.nextInt();
				System.out.print("Enter the Deposite Ammount ");
				bal = sc1.nextDouble();
				System.out.println();
				System.out.println("Account is Created ...................");

				break;

			}
		case 2 : 
			{
				System.out.println("* Welcome to Existing Account Section *");
				Scanner sc2 = new Scanner (System.in);
				Account obj = new Account(name,addr,pan,aa,pho,up,bal);
				System.out.println();
				System.out.println("* Choose Any Option *");
				System.out.println("1.Check Balance");
				System.out.println("2.Deposite Amount");
				System.out.println("3.Withdraw Ammount");
				System.out.println("4.Update Account");
				System.out.println("5.Log-out");
				System.out.println();
				System.out.print("Enter a Option : ");
				byte ch1 = sc.nextByte();
				switch(ch1)
				{
				case 1 :
					{
						System.out.println("-- Check Balance --");
						System.out.println();
						System.out.print("Enter Your Upi : ");
						int ip = sc.nextInt();
						System.out.println(obj.getBalance(ip));
						break;
					}
				case 2 :
					{
						System.out.println("--Deposite Ammount--");
						System.out.println();
						System.out.println("Enter Your Deposite ammount : ");
						double damm = sc.nextDouble();
						obj.depAmmount(damm);
						break;
					}
				case 3 :
					{
						System.out.println("--Withdraw Ammount--");
						System.out.println();
						System.out.println("Enter your upi pin : ");
						int ip2 = sc.nextInt();
						obj.withdrawAmmount(ip2);
						break;
					}
				case 4 :
					{
						Scanner sc4 = new Scanner(System.in);
						System.out.println("-- Update Account --");
						System.out.println();
						System.out.print("Enter Your choice");
						int ch3 = sc4.nextInt();
						System.out.println("1. for Name");
						System.out.println("2. For Address");
						System.out.println("3. for phone_no");
						System.out.println("4. For Upi-Pin");
						switch(ch3)
						{
						case 1 : 
						{
							System.out.print("Enter New Name : ");
							String newName = sc4.next();
							// obj.setName(newName);
						}


						}
						break;
					}
				case 5 :
					{
						System.out.println("-- Log-Out--");
						System.exit(0);
					}
				default:{
					System.out.println("Invalid Input .............");
				}
				}

				break;
			}
		case 3 :
			{
			System.out.println("Invalid Input........");
			}
		}

		}
	}
}