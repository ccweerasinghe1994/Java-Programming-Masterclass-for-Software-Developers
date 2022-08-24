import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while (counter <= 10) {
            System.out.println("Enter Number #" + counter);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                counter++;

            }else{
                System.out.println("Enter a number");
            }
            scanner.nextLine();
        }
        if (counter > 10) {
            System.out.println("Sum of numbers : " + sum);
        }
        scanner.close();

    }
}