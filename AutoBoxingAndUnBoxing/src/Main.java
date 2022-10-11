import java.util.ArrayList;

class MyInt {
    private int myInt;

    public MyInt(int myInt) {
        this.myInt = myInt;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }
}

public class Main {
    public static void main(String[] args) {
//        we can create arrays like this.
        int[] intArray = new int[12];
        double[] myDoubleArray = new double[12];
        String[] myStringArray = new String[12];

//        let's create  a ArrayList
        ArrayList<String> myArrayList = new ArrayList<>();
//        let's try to create a array list with a primitive type.
//        ArrayList<int> myIntArrayList = new ArrayList<int>();
//        so we get an error when we try to do that.
//        what we can do is to create an int class
        ArrayList<MyInt> myIntArrayList = new ArrayList<>();
        myIntArrayList.add(new MyInt(12));
        myIntArrayList.add(new MyInt(122));

        for (MyInt myInt : myIntArrayList) {
            System.out.println(myInt.getMyInt());
        }
//        we can use Integer class to create a int but this is deprecated.
        Integer myInt = new Integer(12);
        Double myDouble = new Double(223.1);

        System.out.println("---------------------------------------------");

//        let's talk about autoboxing and unboxing
        ArrayList<Integer> myIntegerArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myIntegerArrayList.add(Integer.valueOf(i));
        }

        for (Integer value : myIntegerArrayList) {
            System.out.println(value.intValue());
        }

//        but we do not need to use this autoboxing

        int var = 12; //Integer.valueOf(12);
    }
}