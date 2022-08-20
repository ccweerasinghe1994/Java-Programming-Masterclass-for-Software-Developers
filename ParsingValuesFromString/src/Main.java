public class Main {
    public static void main(String[] args) {
        String numberAsString = "2121";
        System.out.println("number as string : "+numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number "+number);

        numberAsString+=1;
        number+=1;
        System.out.println("number as string : "+numberAsString);
        System.out.println("number "+number);


    }
}