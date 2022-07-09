public class Main {
    public static void main(String[] args) {
        int myIntValue = 122_323;
        int maxIntValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;
        System.out.println("Minimum Integer value : " + minIntValue);
        System.out.println("Maximum Integer value : " + maxIntValue);

        System.out.println("Busted Max Value " + (maxIntValue + 1));
        System.out.println("Busted Min Value " + (minIntValue - 1));
        int maxIntValueTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum Byte value : " + myMaxByteValue);
        System.out.println("Maximum Byte value : " + myMinByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum Short value : " + myMaxShortValue);
        System.out.println("Maximum Short value : " + myMinShortValue);

        long myLongValue = 121212L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Long value : " + myMaxLongValue);
        System.out.println("Maximum Long value : " + myMinLongValue);
        long bigLongValue = 2147483647121212L;
        System.out.println(bigLongValue);

        int myIntValueNew = maxIntValue / 2;
        byte myTestByteValue = (byte) (myMaxByteValue / 2);
    }
}