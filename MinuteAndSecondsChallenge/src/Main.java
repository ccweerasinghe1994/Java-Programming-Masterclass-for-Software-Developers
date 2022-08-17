public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(5,45));
        System.out.println(getDurationString(60,60));
        System.out.println(getDurationString(115,145));
        System.out.println(getDurationString(45,59));
        System.out.println(getDurationString(200));
        System.out.println(getDurationString(11200));

    }

    public static String getDurationString(long minutes, long seconds) {
        String message = "Invalid Values";
        long hoursCalculated, minutesCalculated;
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return message;
        }
        hoursCalculated = minutes / 60;
        minutesCalculated = minutes % 60;
        return hoursCalculated + "h " + minutesCalculated + "m " + seconds + "s";
    }

    public static String getDurationString(long seconds) {
        String message = "Invalid Values";
        long calculatedMinutes, calculatedSeconds;
        if (seconds < 0) {
            return message;
        }
        calculatedMinutes = seconds / 60;
        calculatedSeconds = seconds % 60;
        return getDurationString(calculatedMinutes, calculatedSeconds);
    }
}