import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone myPhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choise;
        printOptions();
        while (!quit) {
            System.out.println("please enter a option !");
            choise = scanner.nextInt();
            scanner.nextLine();
            switch (choise) {
                case 0 -> printOptions();
                case 1 -> myPhone.printContactList();
                case 2 -> addContact();
                case 3 -> updateContact();
                case 4 -> removeContact();
                case 5 -> findContact();
                case 6 -> quit = true;
            }
        }

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
        int contactNumber = scanner.nextInt();
        myPhone.addContactToList(contactName, contactNumber);
    }

    public static void updateContact() {

        boolean innerQuit = false;
        System.out.println("please enter a contact name to update: ");
        while (!innerQuit) {
            String contactToUpdate = scanner.nextLine();
            System.out.println("please enter a choice to update ? 1 : for name, 2 : for number, 3 : for quit");
            int innerChoice = scanner.nextInt();
            switch (innerChoice) {
                case 1 -> updateContactName(contactToUpdate);
                case 2 -> updateContactNumber(contactToUpdate);
                case 3 -> innerQuit = true;
            }
        }

    }

    public static void updateContactName(String contactToUpdate) {
        System.out.println("please enter the new contact name ");
        String newContactNumber = scanner.nextLine();
        myPhone.updateContact(contactToUpdate, newContactNumber, null);
    }

    public static void updateContactNumber(String contactToUpdate) {
        System.out.println("please enter the new contact number ");
        int newContactNumber = scanner.nextInt();
        myPhone.updateContact(contactToUpdate, null, newContactNumber);
    }

    public static void removeContact() {
        System.out.println("please enter the contact name you want to remove :");
        String contactToRemove = scanner.nextLine();
        myPhone.removeContact(contactToRemove);
    }

    public static void findContact() {
        System.out.println("please enter the contact name you want to look for: ");
        String contactName = scanner.nextLine();
        myPhone.findContact(contactName);
    }


}