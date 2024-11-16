/* 4) Description: An expense tracker allows users to log their expenses and categorize them (like food, travel, bills). Users can view a summary of their expenses, such as total expenses and category-wise breakdown.

Features:

Add, view, and delete expenses.
Summarize total expenses.
Filter expenses by date or category. */

import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String category;
    double amount;

    public Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Calculate Total");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter category: ");
                String category = scanner.nextLine();
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                expenses.add(new Expense(category, amount));
                System.out.println("Expense added!");
            } else if (choice == 2) {
                for (Expense expense : expenses) {
                    System.out.println("Category: " + expense.category + ", Amount: " + expense.amount);
                }
            } else if (choice == 3) {
                double total = expenses.stream().mapToDouble(e -> e.amount).sum();
                System.out.println("Total Expenses: " + total);
            } else if (choice == 4) {
                break;
            }
        }
        scanner.close();
    }
}
