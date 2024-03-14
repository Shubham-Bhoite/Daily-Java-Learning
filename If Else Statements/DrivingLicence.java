import java.util.Scanner;
class DrivingLicence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Did you pass the RTO test (yes/no) :  ");
        String passedTest = sc.next().toLowerCase(); 

        if (age <18) {
            System.out.println("You must be at least 18 years old to apply for a driving licence.");
        } else if (passedTest.equals("no")) {
            System.out.println("You need to pass the RTO test to be eligible for a driving licence.");
        } else {
            System.out.println("Congratulations! You are eligible to apply for a driving licence.");
        }
    }
}