import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "colombo");
        addInOrder(placesToVisit, "nuwaraeliya");
        addInOrder(placesToVisit, "polonnaruwa");
        addInOrder(placesToVisit, "damulla");
        addInOrder(placesToVisit, "anuradhapura");
        addInOrder(placesToVisit, "negambo");
        addInOrder(placesToVisit, "kandy");
        addInOrder(placesToVisit, "badulla");
        addInOrder(placesToVisit, "kurunagala");
        addInOrder(placesToVisit, "alla");
        printPlaces(placesToVisit);
        addInOrder(placesToVisit, "alla");
        printPlaces(placesToVisit);

        visit(placesToVisit);
//        adding and element to the list
        placesToVisit.add(1, "Gampha");
        printPlaces(placesToVisit);
//        removing a element from the list
        placesToVisit.remove(1);
        printPlaces(placesToVisit);
    }

    public static void printPlaces(LinkedList<String> list) {
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println("now visiting -> "+ iterator.next());
//        }
        for (String s : list) {
            System.out.println("now visiting -> " + s);
        }
        System.out.println("------------- END -----------------------");
    }

    public static boolean addInOrder(LinkedList<String> stringLinkedList, String newCity) {
        ListIterator<String> stringListIterator = stringLinkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println("already in the list");
                return false;
            } else if (comparison > 0) {
//                new city should appear before this one
//                brisbane -> adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
//                move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("There are no cities in the list");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0 -> {
                    System.out.println("Holiday is over");
                    quit = true;
                }
                case 1 -> {
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        ;
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("now visiting " + listIterator.next());
                    } else {
                        System.out.println("reach the end of the list");
                        goingForward = false;
                    }
                }
                case 2 -> {
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        ;
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("now visiting " + listIterator.previous());
                    } else {
                        System.out.println("we are at the start of the list");
                        goingForward = true;
                    }
                }
                case 3 -> {
                    printMenu();
                }
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available Actions\npress");
        System.out.println("""
                0- to quit
                1 - to next city
                2 - to previous city
                3 - to see the options
                """);
    }

}

