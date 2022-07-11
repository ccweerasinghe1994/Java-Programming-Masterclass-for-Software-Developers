public class Main {
    public static void main(String[] args) {

        int newValue = 12;
        if (newValue == 12) {
            System.out.println("These are the same");
        }

        boolean isCar = true;
        if (isCar) {
            System.out.println("This is not suppose to happen");
        }

        int number = isCar ? 12 : 10;
        System.out.println(number);
    }
}