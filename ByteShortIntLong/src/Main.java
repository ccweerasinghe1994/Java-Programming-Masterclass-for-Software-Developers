public class Main {
    public static void main(String[] args) {
        int myIntValue = 122_323;
        // this INTEGER is a wrapper class
        // wrapper class is a class that allows us to treat primitive types as objects
        int maxIntValue = Integer.MAX_VALUE;
        // output: 2147483647
        int minIntValue = Integer.MIN_VALUE;
        // output: -2_147_483_648
        System.out.println("Minimum Integer value : " + minIntValue);
        // output: Minimum Integer value : -2147483648
        System.out.println("Maximum Integer value : " + maxIntValue);
        // output: Maximum Integer value : 2147483647
        System.out.println("Busted Max Value " + (maxIntValue + 1));
        // output: Busted Max Value -2147483648
        System.out.println("Busted Min Value " + (minIntValue - 1));
        // output: Busted Min Value 2147483647
        int maxIntValueTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        // output: Minimum Byte value : -128
        byte myMaxByteValue = Byte.MAX_VALUE;
        // output: Maximum Byte value : 127
        System.out.println("Minimum Byte value : " + myMaxByteValue);
        // output: Minimum Byte value : 127
        System.out.println("Maximum Byte value : " + myMinByteValue);
        // output: Maximum Byte value : -128
        short myMinShortValue = Short.MIN_VALUE;
        // output: Minimum Short value : -32768
        short myMaxShortValue = Short.MAX_VALUE;
        // output: Maximum Short value : 32767
        System.out.println("Minimum Short value : " + myMaxShortValue);
        // output: Minimum Short value : 32767
        System.out.println("Maximum Short value : " + myMinShortValue);
        // output: Maximum Short value : -32768
        long myLongValue = 121212L;
        long myMinLongValue = Long.MIN_VALUE;
        // output: Minimum Long value : -9223372036854775808
        long myMaxLongValue = Long.MAX_VALUE;
        // output: Maximum Long value : 9223372036854775807
        System.out.println("Minimum Long value : " + myMaxLongValue);
        // output: Minimum Long value : 9223372036854775807
        System.out.println("Maximum Long value : " + myMinLongValue);
        // output: Maximum Long value : -9223372036854775808
        long bigLongValue = 2147483647121212L;
        // output: 2147483647121212
        System.out.println(bigLongValue);
        // output: 2147483647121212
        int myIntValueNew = maxIntValue / 2;
        byte myTestByteValue = (byte) (myMaxByteValue / 2);
        short myNewShortValue = (short) (myMaxShortValue / 2);
        System.out.println(myNewShortValue);

    }
}