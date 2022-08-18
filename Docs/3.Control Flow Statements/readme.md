# Control Flow Statements

- [Control Flow Statements](#control-flow-statements)
  - [The switch statement (+Challenge Exercise)](#the-switch-statement-challenge-exercise)
    - [Code Example](#code-example)
      - [code](#code)
      - [output](#output)
    - [Challenge](#challenge)
      - [Question](#question)
      - [Answer](#answer)
        - [Code](#code-1)
          - [output](#output-1)
    - [Code Example](#code-example-1)
      - [code](#code-2)
      - [output](#output-2)
  - [Day of the Week Challenge](#day-of-the-week-challenge)
  - [The for Statement (+Challenge Exercise)](#the-for-statement-challenge-exercise)
  - [For Loop Recap](#for-loop-recap)
  - [Sum 3 and 5 Challenge](#sum-3-and-5-challenge)
  - [The while and do while statements (+Challenge Exercise)](#the-while-and-do-while-statements-challenge-exercise)
  - [While and Do While Recap](#while-and-do-while-recap)
  - [Digit Sum Challenge](#digit-sum-challenge)
  - [Parsing Values from a String](#parsing-values-from-a-string)
  - [Reading User Input](#reading-user-input)
  - [Problems and Solutions](#problems-and-solutions)
  - [Reading User Input Challenge](#reading-user-input-challenge)
  - [Min and Max Challenge](#min-and-max-challenge)

## The switch statement (+Challenge Exercise)

### Code Example

#### code

```java
// only works with byte, short, int, char,
// by using the break statement we are
// stopping the app from going to the next case
// we can use multiple case statements combined
public class Main {
    public static void main(String[] args) {
        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("value is one");
                break;
            case 2:
                System.out.println("value is two");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("was it 3 or 4 or 5");
                System.out.println("Actual value is "+switchValue);
                break;
            default:
                System.out.println("Value is not 1 or 2");
                break;
//                we don't need to put the break here but just to be consistent we can leave it there
        }
    }
}

```

#### output

```shell
was it 3 or 4 or 5
Actual value is 4
```

### Challenge

#### Question

![img](./img/1.png)

#### Answer

##### Code

```java

public class Main {
    public static void main(String[] args) {
        char character = 'A';
        switch (character) {
            case 'A':
                System.out.println("Character is : " + character);
                break;
            case 'B':
                System.out.println("Character is : " + character);
                break;
            case 'C':
                System.out.println("Character is : " + character);
                break;
            case 'D':
                System.out.println("Character is : " + character);
                break;
            case 'E':
                System.out.println("Character is : " + character);
                break;
            default:
                System.out.println("Character is not A,B,C,D,E");
                break;
        }

    }
}
```

###### output

```shell
🔥 -> Character is : A
```

now we can use Strings with switch statements too

### Code Example

#### code

```java
public class Main {
    public static void main(String[] args) {
        String character = "A";
        switch (character.toLowerCase()) {
            case "a":
                System.out.println("Character is : " + character);
                break;
            case "b":
                System.out.println("Character is : " + character);
                break;
            case "c":
                System.out.println("Character is : " + character);
                break;
            case "d":
                System.out.println("Character is : " + character);
                break;
            case "e":
                System.out.println("Character is : " + character);
                break;
            default:
                System.out.println("Character is not A,B,C,D,E");
                break;
        }

    }
}
```

#### output

```shell
Character is : a
```

## Day of the Week Challenge

## The for Statement (+Challenge Exercise)

## For Loop Recap

## Sum 3 and 5 Challenge

## The while and do while statements (+Challenge Exercise)

## While and Do While Recap

## Digit Sum Challenge

## Parsing Values from a String

## Reading User Input

## Problems and Solutions

## Reading User Input Challenge

## Min and Max Challenge
