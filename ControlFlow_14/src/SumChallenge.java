public class SumChallenge {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (isDivisibleBy3And5(i)) {
                counter++;
                if (counter > 5) {
                    break;
                }
                sum += i;
                System.out.println("Number " + i + " is divisible by 3 and 5");
            }
        }

        System.out.println("Sum of the numbers is " + sum);
    }

    public static boolean isDivisibleBy3And5(int n) {
        return n % 3 == 0 && n % 5 == 0;
    }
}
