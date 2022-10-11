import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone myPhone = new MobilePhone("+940702542");

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printOptions();
        while (!quit) {
            System.out.println("please enter a option !");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 -> printOptions();
                case 1 -> printContactList();
                case 2 -> addContact();
                case 3 -> updateMobileContact();
                case 4 -> removeContact();
                case 5 -> findContact();
                case 6 -> quit = true;
            }
        }

    }

    public static void printContactList() {
        myPhone.printContactList();
    }

    public static void printOptions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To Print choice options.");
        System.out.println("\t 1 - To Print list of contacts.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To modify a contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search a contact.");
        System.out.println("\t 6 - To exit from the list.");
    }

    public static void addContact() {
        System.out.println("please enter the contact name : ");
        String contactName = scanner.nextLine();
        System.out.println("Please enter the number");
        String contactNumber = scanner.nextLine();
        Contact contact = Contact.createContact(contactName, contactNumber);
        if (myPhone.addContact(contact)) {
            System.out.println("Contact added successfully");
        } else {
            System.out.println("This contact exists already");
        }

    }


    public static void updateMobileContact() {
        System.out.println("please enter the contact name you want to update ");
        String contactName = scanner.nextLine();
        Contact existingContactRecord = myPhone.queryContact(contactName);
        if (existingContactRecord == null) {
            System.out.println("This contact doesn't exists");
            return;
        }
        System.out.println("enter the new contact name");
        String newContactName = scanner.nextLine();
        System.out.println("enter the new contact number");
        String newContactNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newContactName, newContactNumber);
        if (myPhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated contact");
        } else {
            System.out.println("Error updating the contact");
        }
    }

    public static void removeContact() {
        System.out.println("please enter the contact name you want to remove ");
        String contactName = scanner.nextLine();
        Contact existingContactRecord = myPhone.queryContact(contactName);
        if (existingContactRecord == null) {
            System.out.println("This contact doesn't exists");
            return;
        }
        if (myPhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    public static void findContact() {
        System.out.println("enter the contact name to find");
        String contactName = scanner.nextLine();
        Contact existingContactRecord = myPhone.queryContact(contactName);
        if (existingContactRecord == null) {
            System.out.println("This contact doesn't exists");
            return;
        }
        System.out.println("contact name : " + existingContactRecord.getName());
        System.out.println("contact number : " + existingContactRecord.getPhoneNumber());
    }
}