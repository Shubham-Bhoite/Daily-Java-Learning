/*Currency Converter
Description: A program where the user selects two currencies and enters an amount. The program then converts the amount using pre-defined exchange rates.*/

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double usdToInr = 83.50;
        double eurToInr = 90.25;
        
        System.out.print("Enter amount in USD: ");
        double amountUSD = sc.nextDouble();
        
        System.out.print("Convert to (1) INR, (2) EUR: ");
        int choice = sc.nextInt();
        
        double convertedAmount;
        if (choice == 1) {
            convertedAmount = amountUSD * usdToInr;
            System.out.println(amountUSD + " USD is " + convertedAmount + " INR.");
        } else if (choice == 2) {
            convertedAmount = amountUSD * (usdToInr / eurToInr);
            System.out.println(amountUSD + " USD is " + convertedAmount + " EUR.");
        } else {
            System.out.println("Invalid choice!");
        }
        
        sc.close();
    }
}
