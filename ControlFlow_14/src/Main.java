public class Main {
    public static void main(String[] args) {
        int value = 6;

        switch (value) {
            case 1-> System.out.println("Value is 1");
            case 2-> System.out.println("Value is 2");
            case 3, 4, 5-> System.out.println("Value is 3, 4 or 5");
            default-> System.out.println("Value is neither 1 nor 2,3,4,5");
        }
        System.out.println(getQuarter("January"));
        System.out.println(getQuarter("April"));
        System.out.println(getQuarter("July"));
        System.out.println(getQuarter("October"));
        System.out.println(getQuarter("December"));
        System.out.println(getQuarter("Unknown"));

        System.out.println(getNatoAlphabet("Hello"));

    }

    public static String getQuarter(String month){
        return switch (month) {
            case "January", "February", "March" -> "First Quarter";
            case "April", "May", "June" -> "Second Quarter";
            case "July", "August", "September" -> "Third Quarter";
            case "October", "November", "December" -> "Fourth Quarter";
            default -> {
                System.out.println("Unknown month: " + month);
                yield "Unknown Quarter";
            }
        };
    }

//    Write a method that takes a String and returns the NATO phonetic alphabet for each letter in the String.
//    Example: getNatoAlphabet("Hello") -> "Hotel Echo Lima Lima Oscar"
//    Example: getNatoAlphabet("Hi") -> "Hotel India"


    public static String getNatoAlphabet(String word){
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += switch (word.charAt(i)) {
                case 'A', 'a' -> "Alpha ";
                case 'B', 'b' -> "Bravo ";
                case 'C', 'c' -> "Charlie ";
                case 'D', 'd' -> "Delta ";
                case 'E', 'e' -> "Echo ";
                case 'F', 'f' -> "Foxtrot ";
                case 'G', 'g' -> "Golf ";
                case 'H', 'h' -> "Hotel ";
                case 'I', 'i' -> "India ";
                case 'J', 'j' -> "Juliet ";
                case 'K', 'k' -> "Kilo ";
                case 'L', 'l' -> "Lima ";
                case 'M', 'm' -> "Mike ";
                case 'N', 'n' -> "November ";
                case 'O', 'o' -> "Oscar ";
                case 'P', 'p' -> "Papa ";
                case 'Q', 'q' -> "Quebec ";
                case 'R', 'r' -> "Romeo ";
                case 'S', 's' -> "Sierra ";
                case 'T', 't' -> "Tango ";
                case 'U', 'u' -> "Uniform ";
                case 'V', 'v' -> "Victor ";
                case 'W', 'w' -> "Whiskey ";
                case 'X', 'x' -> "X-ray ";
                case 'Y', 'y' -> "Yankee ";
                case 'Z', 'z' -> "Zulu ";
                default -> "Unknown ";
            };
        }
        return result;

    }
}
