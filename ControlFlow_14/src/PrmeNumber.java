public class PrmeNumber {
    public static void main(String[] args) {
        int primeCounter = 0;

        for(int u = 1; u < 1000; u++){
            if (primeCounter == 3) {
                break;
            }
            if(isPrime(u)){
                primeCounter++;
            }
        }

        System.out.println("Prime numbers found: " + primeCounter);

    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
