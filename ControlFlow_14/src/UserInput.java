import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int currentYear = 2023;
        try {
            getUserInputFromConsole(currentYear);
        } catch (Exception e) {
            getUserInputFromScanner(currentYear);
        }
    }

    public static void getUserInputFromConsole(int currentYear) {

        String name = System.console().readLine("Enter your name: ");
        System.out.println("Hello " + name);

        int yearOfBirth = Integer.parseInt(System.console().readLine("Enter your year of birth: "));
        System.out.println("You are " + (currentYear - yearOfBirth) + " years old");
    }

    public static void getUserInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter your year of birth: ");
        boolean validInput = false;
        int min = currentYear - 100;
        int max = currentYear + 100;
        do {

            System.out.println("Please enter a valid year of birth between " + min + " : " + max);
            try {
                int yearOfBirth = scanner.nextInt();
                if (yearOfBirth <= max && yearOfBirth >= min) {
                    System.out.println("You are " + (currentYear - yearOfBirth) + " years old");
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
            }

        } while (!validInput);
    }
}
