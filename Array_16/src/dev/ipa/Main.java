package dev.ipa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[]{1,2,3,4,5,6,7,8,9,10,11};

        int length = myIntArray.length;
        System.out.println("length of the array is "+length);

        System.out.println(myIntArray[3]);


        double[] myDoubleArray = new double[10];

        myDoubleArray[0] = 45.5;

        System.out.println(myDoubleArray[0]);

        String[] myStringArray = new String[]{"Hello", "World"};

        System.out.println(myStringArray[myStringArray.length-1]);

        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }

    }
}