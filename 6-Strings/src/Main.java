public class Main {
    public static void main(String[] args) {
        String myString = "this is a String";
//        we can also add more String literals to the string variable
        myString = myString + " this is more";
        System.out.println(myString);
//        we can add uni codes as well
        myString = myString + " \u00A9 2019";
        System.out.println(myString);

        String numberString = "2323";
        numberString = numberString + "23";
//        this is not going to return sum
//        because this is string concatenation
        System.out.println(numberString);

        String lastString = "12";
        int myInt = 12;
//        int was converted to a string
        lastString = lastString + myInt;
        System.out.println("lastString " + lastString);

    }
}