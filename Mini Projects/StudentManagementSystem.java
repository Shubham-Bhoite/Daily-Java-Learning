import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int id;
    double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter student GPA: ");
                double gpa = scanner.nextDouble();
                students.add(new Student(name, id, gpa));
                System.out.println("Student added!");
            } else if (choice == 2) {
                for (Student student : students) {
                    System.out.println("Name: " + student.name + ", ID: " + student.id + ", GPA: " + student.gpa);
                }
            } else if (choice == 3) {
                System.out.print("Enter student ID to search: ");
                int id = scanner.nextInt();
                for (Student student : students) {
                    if (student.id == id) {
                        System.out.println("Found: Name: " + student.name + ", GPA: " + student.gpa);
                        break;
                    }
                }
            } else if (choice == 4) {
                break;
            }
        }
        scanner.close();
    }
}
