public class Main {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(157);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0) {
            System.out.println("invalid input");
            return -1;
        }
        if (inches < 0 || inches > 12) {
            System.out.println("invalid input");
            return -1;
        }
        double convertedCmValue = 2.54 * ((feet * 12) + inches);
        System.out.println(feet + " feat and " + inches + " inches equal to " + convertedCmValue + " cm");
        return convertedCmValue;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("invalid input");
            return -1;
        }

        double feet = (int) (inches / 12);
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches equals " + feet + " feet and " + remainingInches + " inches");
        double convertedCmValue = calcFeetAndInchesToCentimeters(feet, remainingInches);
        return convertedCmValue;
    }

}