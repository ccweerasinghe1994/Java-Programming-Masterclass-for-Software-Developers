import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player tim = new Player("chamara", 12, 100);
        System.out.println(tim);

        tim.setHitPoints(122);
        System.out.println(tim);

        tim.setWeapon("Storm bringer");
        System.out.println(tim);
        System.out.println("---------------------------------------------------------------");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim);

        System.out.println("----------- Monster section----------------------------");

        ISavable wearwolf = new Monster("wearwolf", 12, 12);
//         here we can cast the object to the Monster or use the monster instead;
        System.out.println(((Monster) wearwolf).getName());
        saveObject(wearwolf);

    }

    public static ArrayList<String> readvalues() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();
        boolean quit = false;
        int choice;
        printInstruction();
        int index = 0;
        while (!quit) {
            System.out.println("please enter choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 -> {
                    quit = true;
                }
                case 1 -> {
                    System.out.println("please enter a name");
                    String value = scanner.nextLine();
                    values.add(index, value);
                    index++;
                }
            }
        }
        return values;
    }

    public static void printInstruction() {
        System.out.println("""
                press
                0 - to exit
                1 - to enter a choice
                """);
    }

    public static void saveObject(ISavable objectToSave) {
        for (String item : objectToSave.write()) {
            System.out.println("saving " + item + " to the storage device");
        }
    }

    public static void loadObject(ISavable objectTLoad) {
        ArrayList<String> values = readvalues();
        objectTLoad.read(values);
    }
}