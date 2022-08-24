public class Main {
    public static void main(String[] args) {
        System.out.println("sum of digits in number 4563 : "+sumDigits(4563));
        System.out.println("sum of digits in number -1 : "+sumDigits(-1));
        System.out.println("sum of digits in number 9 : "+sumDigits(9));
        System.out.println("sum of digits in number 10 : "+sumDigits(10));
    }
    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum = 0;
        while(number>0){
            int lastNumber = number%10;
            sum+=lastNumber;
            number = number/10;
        }
        return sum;
    }
}