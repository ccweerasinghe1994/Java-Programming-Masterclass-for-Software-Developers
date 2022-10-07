public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] myVariable;
        myVariable = new int[5];
        myVariable[2] = 12;

        double[] myDoubleArray = new double[3];

        int[] myIntArray = {1, 2, 3, 5};

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[3]);

        int[] myIntArray2 = new int[10];

        for (int i = 0; i < myIntArray2.length; i++) {
            myIntArray2[i] = i * 10;
        }

        printArray(myIntArray2);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Iteration " + i + ", value " + array[i]);
        }
    }
}