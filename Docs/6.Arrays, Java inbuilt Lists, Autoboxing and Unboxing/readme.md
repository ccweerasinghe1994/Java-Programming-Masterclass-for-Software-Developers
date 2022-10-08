# Arrays, Java inbuilt Lists, Autoboxing and Unboxing

## 1. Arrays

### Code Example

#### code

```java
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

```

#### output

```shell
1
2
3
5
Iteration 0, value 0
Iteration 1, value 10
Iteration 2, value 20
Iteration 3, value 30
Iteration 4, value 40
Iteration 5, value 50
Iteration 6, value 60
Iteration 7, value 70
Iteration 8, value 80
Iteration 9, value 90
```

### Code Example

#### code

```java

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntValues = getIntegerValues(5);
        printArray(myIntValues);
        System.out.println("average is " + getAverage(myIntValues));

    }

    private static int[] getIntegerValues(int i) {
        int[] value = new int[i];
        System.out.println("please enter " + i + " values\r");
        for (int j = 0; j < i; j++) {
            value[j] = scanner.nextInt();
        }
        return value;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Iteration " + i + ", value " + array[i]);
        }
    }

    public static double getAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / (double) numbers.length;
    }
}

```

#### output

```shell
please enter 5 values
12
12
12
12
12
Iteration 0, value 12
Iteration 1, value 12
Iteration 2, value 12
Iteration 3, value 12
Iteration 4, value 12
average is 12.0

```

## 2. Arrays (Challenge Exercise)

### Challenge

My Answer

#### Question

![img](../img/79.png)

#### Answer

##### Code

```java
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("please enter values to sort\r");
        printArray(sortArray(getArrayFromUser(4)));
    }

    public static int[] getArrayFromUser(int value) {
        int[] array = new int[value];
        for (int i = 0; i < value; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (max < array[j]) {
                    int temp = array[j];
                    array[j] = max;
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element index " + i + ", value = " + array[i]);
        }
    }
}
```

###### output

```shell
34
2
5
1
Element index 0, value = 34
Element index 1, value = 5
Element index 2, value = 2
Element index 3, value = 1
```

---

### Challenge

second answer

#### Answer

##### Code

```java
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        printArray(sortArray(getArrayFromUser(4)));
    }

    public static int[] getArrayFromUser(int value) {
        System.out.println("please enter values to sort\r");
        int[] array = new int[value];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element index " + i + ", value = " + array[i]);
        }
    }
}
```

###### output

```shell
please enter values to sort
33
4
167
1
Element index 0, value = 167
Element index 1, value = 33
Element index 2, value = 4
Element index 3, value = 1
```

## 4. Arrays Recap

## 5. References Types vs Value Types

## 6. Minimum Element Challenge

## 7. Reverse Array Challenge

## 8. List and ArrayList Part 1

## 9. ArrayList Part 2

## 10. ArrayList Part 3

## 11. ArrayList Challenge Part 1

## 12. ArrayList Challenge Part 2

## 13. ArrayList Challenge Part 3

## 14. Bug Fix for ArrayList Challenge

## 15. Autoboxing and Unboxing

## 16. Autoboxing & Unboxing (Challenge Exercise) - Part 1

## 17. Autoboxing & Unboxing (Challenge Exercise) - Part 2

## 18. Autoboxing & Unboxing (Challenge Exercise) - Part 3

## 19. LinkedList Part 1

## 20. LinkedList Part 2

## 21. LinkedList Part 3

## 22. LinkedList Challenge Part 1

## 23. Bug Fix for Track 1 Error

## 24. LinkedList Challenge Part 2

## 25. LinkedList Challenge Part 3 (Final video)
