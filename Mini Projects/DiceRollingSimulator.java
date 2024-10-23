/*Dice Rolling Simulator
Description: Simulate rolling a dice by generating random numbers between 1 and 6.*/

import java.util.Random;
import java.util.Scanner;

public class DiceRollingSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        while (true) {
            System.out.print("Type 'roll' to roll the dice or 'quit' to exit: ");
            String input = scanner.nextLine().toLowerCase();
            
            if (input.equals("roll")) {
                int diceRoll = random.nextInt(6) + 1;
                System.out.println("You rolled a " + diceRoll);
            } else if (input.equals("quit")) {
                System.out.println("Thanks for playing!");
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
        
        scanner.close();
    }
}
