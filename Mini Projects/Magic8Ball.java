/*Magic 8-Ball
Description: Ask the user a yes/no question, and the Magic 8-Ball gives a random answer.*/

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] answers = {
            "Yes", "No", "Maybe", "Ask again later", "Definitely", "I don't think so"
        };
        
        while (true) {
            System.out.print("Ask the Magic 8-Ball a yes/no question (or type 'quit' to exit): ");
            String question = scanner.nextLine();
            
            if (question.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            }
            
            System.out.println(answers[random.nextInt(answers.length)]);
        }
        
        scanner.close();
    }
}
