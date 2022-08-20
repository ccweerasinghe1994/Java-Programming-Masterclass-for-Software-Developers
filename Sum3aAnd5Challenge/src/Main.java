public class Main {
    public static void main(String[] args) {
        long numberCount = 0;
        long sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("This number is divided by 3 and 5 : " + i);
                sum+=i;
                numberCount++;
            }
            if(numberCount==5){
                break;
            }
        }
        System.out.println("SUM : "+sum);
    }
}