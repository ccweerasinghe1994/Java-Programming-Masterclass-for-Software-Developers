public class Main {
    public static void main(String[] args) {
//        2 operators -> = +
//        operands 1,2
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult " + previousResult);

        result = result - 1;
        System.out.println("3 -1 = " + result);
        System.out.println("previousResult " + previousResult);
        //multiplication
        result = result * 10;
        System.out.println("2 * 10 = " + result);

        //division
        result = result / 10;
        System.out.println("20/10 = " + result);

//        modules operators
        result = result % 2;
        System.out.println("2%2 = " + result);

//        result = result + 1;
        result++;
        System.out.println("0+1 = " + result);
        result--;
        System.out.println("1-1 = " + result);
        result += 2;
        System.out.println("0+2 = " + result);
//        result = result*10;
        result *= 10;
        System.out.println("2*10 = " + result);
        result /= 10;
        System.out.println("20/10 = " + result);
        result -= 2;
        System.out.println("2-2 = " + result);
    }
}