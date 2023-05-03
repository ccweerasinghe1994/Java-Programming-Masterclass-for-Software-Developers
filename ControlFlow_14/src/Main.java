public class Main {
    public static void main(String[] args) {
        int value = 6;

        switch (value) {
            case 1-> System.out.println("Value is 1");
            case 2-> System.out.println("Value is 2");
            case 3, 4, 5-> System.out.println("Value is 3, 4 or 5");
            default-> System.out.println("Value is neither 1 nor 2,3,4,5");
        }

    }
}
