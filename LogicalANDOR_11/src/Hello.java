public class Hello {
    public static void main(String[] args) {
     int topScore = 90;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }
     int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }


        //    logical OR operator
        boolean isFirst = false;
        boolean secondValue = true;
        if (isFirst || secondValue) {
            System.out.println("Value is true");
        }

//        Terinary operator
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }else {
            System.out.println("wasCar is false");
        }
    }


}
