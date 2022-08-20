public class Main {
    public static void main(String[] args) {
        int count = 1;
        while (count != 7) {
            System.out.println("count is : " + count);
            count++;
        }
        System.out.println("****************** for loop comparison **********************");
        for (int i = 1; i != 7; i++) {
            System.out.println("count is : " + i);
        }

        System.out.println("****************** while true **********************");
        count = 1;
        while (true) {
            if (count == 7) {
                break;
            }
            System.out.println("count is : " + count);
            count++;
        }
        System.out.println("****************** Do while **********************");
        count = 1;
        do {
            System.out.println("count is : " + count);
            count++;
        } while (count != 7);
        System.out.println("****************** Do while challenge **********************");
        int number = 1;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            evenNumbersFound++;
            System.out.println("Even Number : " + number);
            if(evenNumbersFound == 5){
                break;
            }
        }
        System.out.println("Total numbers of even numbers found : "+evenNumbersFound);

    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    }
}