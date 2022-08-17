public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(249,9));
        System.out.println(getDurationString(5,45));
        System.out.println(getDurationString(1160,0));
        System.out.println(getDurationString(115,145));
        System.out.println(getDurationString(45,59));
        System.out.println(getDurationString(200));
        System.out.println(getDurationString(11200));

    }

    public static String getDurationString(long minutes, long seconds) {
        String message = "Invalid Values";
        long hoursCalculated, minutesCalculated;
        String formattedHourValue= "00";
        String formattedMinuteValue= "00";
        String formattedSecondValue = "00";
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return message;
        }
        hoursCalculated = minutes / 60;
        minutesCalculated = minutes % 60;

        if(hoursCalculated<10){
            formattedHourValue = "0"+hoursCalculated;
        }else{
        formattedHourValue = String.valueOf(hoursCalculated);
        }
        if(minutesCalculated<10){
            formattedMinuteValue = "0"+minutesCalculated;
        }else{
            formattedMinuteValue = String.valueOf(minutesCalculated);
        }
        if(seconds<10){
            formattedSecondValue = "0"+seconds;
        }else{
            formattedSecondValue = String.valueOf(seconds);
        }

        return formattedHourValue + "h " + formattedMinuteValue + "m " + formattedSecondValue + "s";
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