import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseDate = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 digits : \r");
        getInput();
        System.out.println(Arrays.toString(baseDate));
        resizeTheArray();
        baseDate[10] = 12;
        baseDate[11] = 23;
        System.out.println(Arrays.toString(baseDate));
    }

    public static void getInput() {
        for (int i = 0; i < baseDate.length; i++) {
            baseDate[i] = scanner.nextInt();
            scanner.nextLine();
        }
    }

    public static void resizeTheArray(){
        int[] oldArray = baseDate;

        baseDate = new int[12];

        for (int i = 0; i < oldArray.length; i++) {
            baseDate[i] = oldArray[i];
        }
    }
}