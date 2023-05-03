public class Main {
    public static void main(String[] args) {
        double myDouble = 20.00d;
        double secondVar = 80.00d;
        double result = (myDouble + secondVar) * 100;
        System.out.println("result : " + result);
        double reminder = result % 40.00d;
        System.out.println("reminder : " + reminder);
        boolean myBool;
        myBool = reminder == 0;
        System.out.println("My Bool is " + myBool);

        if (!myBool) {
            System.out.println("Got Some Reminder");
        }

    }
}