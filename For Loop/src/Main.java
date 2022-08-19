public class Main {
    public static void main(String[] args) {
//        for (int i = 2; i < 9; i++) {
//            System.out.println("10000 at " + (i) + "% interest is: " + String.format("%.2f", calculateInterest(10000, i)));
//        }
//        System.out.println("***********************************************************");
//        for (int i = 8; i > 1; i--) {
//            System.out.println("10000 at " + (i) + "% interest is: " + String.format("%.2f", calculateInterest(10000, i)));
//        }
        int primeNumberCount = 0;
        for (int i = 5; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.println("prime number : " + i);
                primeNumberCount++;
            }
            if (primeNumberCount == 3) {
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interest) {
        return amount * (interest / 100);
    }

    public static boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}