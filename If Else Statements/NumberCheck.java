import java.util.Scanner;
class NumberCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number==  ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is a POSITIVE number.");
        } else if (num < 0) {
            System.out.println(num+ " is a NEGATIVE number.");
        } else {
            System.out.println(num + " is a NEUTRAL number (zero).");
        }
    }
}