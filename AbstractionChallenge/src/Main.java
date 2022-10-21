import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList<MyListItem> listItems = new LinkedList<>();


    public static void main(String[] args) {
        boolean quit = false;
        String value;
        printInstruction();
        while (!quit) {
            System.out.println("please enter a option 📀 -> 🪲☠️🔥(PRESS 2 -> SEE THE OPTIONS 🔥) OR 0 TO EXIT 🏃‍");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0 -> {
                    System.out.println("EXITING THE APPLICATION ☹️😥");
                    quit = true;
                }
                case 1 -> {
                    System.out.println("🌵 please enter a name to add to the 📜");
                    value = scanner.nextLine();
                    addToTheList(value);
                }
                case 2 -> {
                    printInstruction();
                }
            }
        }
    }

    public static void printInstruction() {
        System.out.println("""
                press
                0 -> ☠️ exit the application
                1 -> 🪲 enter a value
                2 -> 🔥 to see the options
                """);
    }

    public static boolean addToTheList(String value) {
        if (listItems.isEmpty()) {
            listItems.add(new MyListItem(value));
        } else {
            if (findItem(value) == null) {
                System.out.println("😮 this item already exists in the list");
                return false;
            }
            ListIterator<MyListItem> iterator = listItems.listIterator();
            if (iterator.hasPrevious()) {
                iterator.next().setPreviousItem(iterator.previous());
            }
            if (iterator.hasNext()) {
                iterator.previous().setNextItem(iterator.next());
            }
        }
        return true;
    }

    public static MyListItem findItem(String value) {
        MyListItem myListItem = new MyListItem(value);
        if (listItems.contains(myListItem)) {
            return myListItem;
        }
        return null;
    }
}