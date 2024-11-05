/*Library Management System
Description: A simple library system where users can add books, borrow books, and return them.

Features:

Add new books to the library.
Borrow books if available.
Return books.*/

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    boolean isAvailable;

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. View All Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                library.add(new Book(title));
                System.out.println("Book added to library!");
            } else if (choice == 2) {
                System.out.print("Enter book title to borrow: ");
                String title = scanner.nextLine();
                for (Book book : library) {
                    if (book.title.equalsIgnoreCase(title) && book.isAvailable) {
                        book.isAvailable = false;
                        System.out.println("You borrowed: " + title);
                        break;
                    } else if (book.title.equalsIgnoreCase(title) && !book.isAvailable) {
                        System.out.println("Book is currently unavailable.");
                        break;
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter book title to return: ");
                String title = scanner.nextLine();
                for (Book book : library) {
                    if (book.title.equalsIgnoreCase(title) && !book.isAvailable) {
                        book.isAvailable = true;
                        System.out.println("You returned: " + title);
                        break;
                    }
                }
            } else if (choice == 4) {
                for (Book book : library) {
                    System.out.println("Title: " + book.title + ", Available: " + book.isAvailable);
                }
            } else if (choice == 5) {
                break;
            }
        }
        scanner.close();
    }
}
