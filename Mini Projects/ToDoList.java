/* 12)

 */


import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String description;
    boolean isComplete;

    public Task(String description) {
        this.description = description;
        this.isComplete = false;
    }

    public void markComplete() {
        this.isComplete = true;
    }
}

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Complete");
            System.out.println("3. View Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter task description: ");
                String description = scanner.nextLine();
                tasks.add(new Task(description));
                System.out.println("Task added!");
            } else if (choice == 2) {
                System.out.print("Enter task number to mark complete: ");
                int taskNumber = scanner.nextInt();
                if (taskNumber <= tasks.size()) {
                    tasks.get(taskNumber - 1).markComplete();
                    System.out.println("Task marked as complete!");
                } else {
                    System.out.println("Invalid task number.");
                }
            } else if (choice == 3) {
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i).description +
                            " [Complete: " + tasks.get(i).isComplete + "]");
                }
            } else if (choice == 4) {
                System.out.print("Enter task number to delete: ");
                int taskNumber = scanner.nextInt();
                if (taskNumber <= tasks.size()) {
                    tasks.remove(taskNumber - 1);
                    System.out.println("Task deleted!");
                } else {
                    System.out.println("Invalid task number.");
                }
            } else if (choice == 5) {
                break;
            }
        }
        scanner.close();
    }
}
