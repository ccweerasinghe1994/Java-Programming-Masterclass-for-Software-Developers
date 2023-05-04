public class DayChallenge {
    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(0));
        System.out.println(dayOfTheWeek(1));
        System.out.println(dayOfTheWeek(2));
        System.out.println(dayOfTheWeek(3));
        System.out.println(dayOfTheWeek(4));
        System.out.println(dayOfTheWeek(5));
        System.out.println(dayOfTheWeek(6));
        System.out.println(dayOfTheWeek(7));

    }

    public static String dayOfTheWeek(int day){
        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
    }
}
