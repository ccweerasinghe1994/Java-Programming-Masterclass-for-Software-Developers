import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minimumNumber = 0, maximumNumber = 0;
        while (true) {
            System.out.println("Enter the number");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (minimumNumber == 0){
                    minimumNumber = number;
                    maximumNumber = number;
                } else {
                  if(number<minimumNumber){
                      minimumNumber = number;
                  } else if (number>maximumNumber) {
                      maximumNumber = number;
                  }
                }
            } else {
                System.out.println("maximum number : " + maximumNumber);
                System.out.println("minimum number : " + minimumNumber);
                break;
            }

        }
        scanner.close();
    }
}