import java.util.Scanner;
class JoinArmyOrNot
{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your Age == ");
	int age = sc.nextInt();

	System.out.print("Enter your height in cm: ");
     	 int height = sc.nextInt();

   	 System.out.print("Enter your weight in kg: ");
 	  int weight = sc.nextInt();
	
	if (age >= 18) {
            		if (height >= 162) {
               			 if (weight > 56) {
                  				  System.out.println("Congratulations! You are eligible to join the army.");
             			   } else {
            			        System.out.println("Sorry, you are not eligible to join the army. (Weight requirement not met)");
             			   }
        		    } else {
               			 System.out.println("Sorry, you are not eligible to join the army. (Height requirement not met)");
         		   }
      	  } else {
    	        System.out.println("Sorry, you are not eligible to join the army. (Age requirement not met)");
     	   }
	}
}