import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        boolean isLeapYear = false;
        
        while (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            isLeapYear = true;
            break;
        }
        
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
