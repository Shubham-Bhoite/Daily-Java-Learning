// 8) Rock, Paper, Scissors Game

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};
        String computerChoice = options[random.nextInt(3)];

        System.out.println("Enter Rock, Paper, or Scissors: ");
        String userChoice = scanner.nextLine();

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper")) ||
            (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
}
