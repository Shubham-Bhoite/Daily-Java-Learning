/*Contact Book
Description: A contact book application to store contacts with names and phone numbers. It provides options to add, search, delete, and list contacts.

Features:

Add new contacts.
Search for contacts by name.
Delete a contact.
List all contacts.*/


import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class ContactBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. View All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter phone number: ");
                String phone = scanner.nextLine();
                contacts.add(new Contact(name, phone));
                System.out.println("Contact added!");
            } else if (choice == 2) {
                System.out.print("Enter name to search: ");
                String name = scanner.nextLine();
                boolean found = false;
                for (Contact contact : contacts) {
                    if (contact.name.equalsIgnoreCase(name)) {
                        System.out.println("Name: " + contact.name + ", Phone: " + contact.phone);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Contact not found.");
                }
            } else if (choice == 3) {
                System.out.print("Enter name to delete: ");
                String name = scanner.nextLine();
                boolean deleted = contacts.removeIf(contact -> contact.name.equalsIgnoreCase(name));
                if (deleted) {
                    System.out.println("Contact deleted.");
                } else {
                    System.out.println("Contact not found.");
                }
            } else if (choice == 4) {
                for (Contact contact : contacts) {
                    System.out.println("Name: " + contact.name + ", Phone: " + contact.phone);
                }
            } else if (choice == 5) {
                break;
            }
        }
        scanner.close();
    }
}
