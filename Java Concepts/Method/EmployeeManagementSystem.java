import java.util.Scanner;
class EmployeeManagementSystem
{

	static String ename;
	static int eid;
	static String erole;
	static double esal;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***** WELCOME *****");
		System.out.println();
		
		for (; ; ) {
			System.out.println("FEATURES*****");
			System.out.println("1. Add new Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Edit Employee");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter an option :");
			int opt = sc.nextInt();
			switch(opt)
			{
			case 1:{
				addNewEmployee();
				break;
			}
			case 2:{
				viewEmployee(1);
				break;

			}
			case 3:{
				System.out.println("EDIT EMPLOYEE DATA");
				break;
			}
			 case 4:{
			 	System.exit(0);
			 	break;
			 }
			default:{
				System.out.println("Incorrect Option");
			}
		}
		}
	}

	public static void addNewEmployee()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("** Enter New Employee Data **");
		System.out.print("Employee Name :");
		ename=sc1.nextLine();
		System.out.print("Employee Id :");
		eid = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Employee Role :");
		erole = sc2.nextLine();
		System.out.print("Employee Salary :");
		esal = sc2.nextDouble();
	}

	public static void viewEmployee(int eid1)
	{
		if(eid==eid1)
		{
			System.out.println("Employee DATA");
			System.out.println("Name :"+ ename);
			System.out.println("Emp Id :"+ eid);
			System.out.println("Role :"+ erole);
			System.out.println("Salary :"+ esal);
			System.out.println();
		}else{
			System.out.println("Wrong EID");
		}
	}

	public static void editEmployee() {
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter Employee ID to edit: ");
        int editId = sc3.nextInt();
        if (editId == eid) {
            System.out.println("Enter New Employee Data");
            System.out.print("Employee Name: ");
            ename = sc3.next();
            System.out.print("Employee Role: ");
            erole = sc3.next();
            System.out.print("Employee Salary: ");
            esal = sc3.nextDouble();
            System.out.println("Employee data updated successfully!");
        } else {
            System.out.println("Employee ID not found.");
        }
    }
}