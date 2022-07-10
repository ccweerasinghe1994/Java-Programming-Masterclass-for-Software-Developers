public class Main {
    public static void main(String[] args) {
        byte anyByteValue = 122;
        short anyShortValue = 12222;
        int anyIntValue = 12222;

        long total = 50000L + 10L *(anyByteValue+anyIntValue+anyShortValue);
        System.out.println("Total Value : " + total);
//      if we use short value we have to cast
//      values inside the parentheses are considered as integers
        short totalShort = (short) (1000 + 10*(anyByteValue+anyIntValue+anyShortValue));
//      integer is the best value to use as a
//      variable because java handles the casting default
    }
}