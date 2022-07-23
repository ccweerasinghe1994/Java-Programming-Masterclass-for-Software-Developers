# Java Tutorial Expressions, Statements, Code blocks, Methods and more

- [Java Tutorial Expressions, Statements, Code blocks, Methods and more](#java-tutorial-expressions-statements-code-blocks-methods-and-more)
  - [2. Keywords And Expressions](#2-keywords-and-expressions)
    - [Code Example](#code-example)
      - [code](#code)
      - [output](#output)
    - [Challenge](#challenge)
      - [Question](#question)
      - [Answer](#answer)
        - [Code](#code-1)
  - [3. Statements, Whitespace and Indentation (Code Organization)](#3-statements-whitespace-and-indentation-code-organization)
  - [4. Code Blocks And The If Then Else Control Statements](#4-code-blocks-and-the-if-then-else-control-statements)
    - [if condition](#if-condition)
    - [Code Example](#code-example-1)
      - [code](#code-2)
      - [output](#output-1)
    - [Code Example](#code-example-2)
      - [code](#code-3)
      - [output](#output-2)
    - [Code Example](#code-example-3)
      - [code](#code-4)
      - [output](#output-3)
    - [Code Example](#code-example-4)
      - [code](#code-5)
      - [output](#output-4)
    - [Else block](#else-block)
    - [Code Example](#code-example-5)
      - [code](#code-6)
      - [output](#output-5)
    - [Else If](#else-if)
    - [Code Example](#code-example-6)
      - [code](#code-7)
      - [output](#output-6)
    - [Code Blocks](#code-blocks)
    - [Code Example](#code-example-7)
      - [code](#code-8)
      - [output](#output-7)
    - [Scope](#scope)
    - [Challenge](#challenge-1)
      - [Question](#question-1)
      - [Answer](#answer-1)
        - [Code](#code-9)
          - [output](#output-8)
  - [5. if then else Recap](#5-if-then-else-recap)
    - [If then else recap](#if-then-else-recap)
    - [Code Example](#code-example-8)
      - [code](#code-10)
  - [6. Methods In Java](#6-methods-in-java)
    - [Code Example](#code-example-9)
      - [code](#code-11)
      - [output](#output-9)
    - [Code Example](#code-example-10)
      - [code](#code-12)
      - [output](#output-10)
  - [7. More On Methods And A Challenge](#7-more-on-methods-and-a-challenge)
    - [Challenge](#challenge-2)
      - [Question](#question-2)
      - [Answer](#answer-2)
        - [Code](#code-13)
          - [output](#output-11)
  - [8. Method Challenge - Final Code Changes](#8-method-challenge---final-code-changes)
        - [Code](#code-14)
          - [output](#output-12)
  - [9. DiffMerge Tool Introduction](#9-diffmerge-tool-introduction)
  - [10. Install DiffMerge](#10-install-diffmerge)
  - [11. Using DiffMerge](#11-using-diffmerge)
  - [12. Coding Exercises](#12-coding-exercises)
  - [13. Coding Exercises Example Part 1](#13-coding-exercises-example-part-1)
  - [14. Coding Exercises Example Part 2](#14-coding-exercises-example-part-2)
  - [15. Coding Exercises Example Part 3](#15-coding-exercises-example-part-3)
  - [23. Method Overloading](#23-method-overloading)
    - [Code Example](#code-example-11)
      - [code](#code-15)
      - [output](#output-13)
  - [24. Method Overloading Recap](#24-method-overloading-recap)
    - [Code Example](#code-example-12)
      - [code](#code-16)
      - [output](#output-14)
  - [25. Seconds and Minutes Challenge](#25-seconds-and-minutes-challenge)
  - [26. Bonus Challenge Solution](#26-bonus-challenge-solution)

## 2. Keywords And Expressions

[list of java key words](https://en.wikipedia.org/wiki/List_of_Java_keywords)
key words are highlighted in color on most browsers.

expressions are building blocks that will build programs.
there are consist of variables, literals, operators, and more.

### Code Example

#### code

```java
public class Main {
    public static void main(String[] args) {
//        this is the expression kilometers = (100*1.6)
//        with the data type we are creating a valid java statement
        double kilometers = (100*1.6);
        int highScore = 50;
//        anything inside the bracket is also an expression
        if(highScore==50){
//            values inside a quotes are also expressions
//            this is the expression "This is an expression"
            System.out.println("This is an expression");
        }
    }
}

```

#### output

```shell
This is an expression
```

### Challenge

#### Question

```java
public class Main {
    public static void main(String[] args) {
// coding challenge
//        find the expressions
        int score = 100;
        if(score >99){
            System.out.println("you got the high score");
            score = 0;
        }
    }
}

```

#### Answer

##### Code

```text
//  Answer
//  score = 100
//  score >99
//  "you got the high score"
//  score = 0;

```

## 3. Statements, Whitespace and Indentation (Code Organization)

So we will talk about statements, white spaces and indentation in this Section.

## 4. Code Blocks And The If Then Else Control Statements

### if condition

### Code Example

#### code

```java
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("You score was 5000");
        }
    }
}
```

#### output

```shell
You score was 5000
```

Or we can use without the curly brasses.

### Code Example

#### code

```java
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000)
            System.out.println("You score was 5000");

    }
}
```

#### output

```shell
You score was 5000
```

but

When we are using an if conditions without the curly braces it only consider the first line only. whatever comes after the first line will not include as  inside of the if condition it will execute no matter what.

### Code Example

#### code

```java
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 6000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000)
            System.out.println("You score was 5000");
        System.out.println("This is not inside the if condition");
    }
}

```

#### output

```shell
This is not inside the if condition
```

So if we want to execute multiple lines inside if condition, we have to use curly braces.

### Code Example

#### code

```java

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("You score was 5000");
            System.out.println("This is not inside the if condition");
        }
    }
}
```

#### output

```shell
You score was 5000
This is not inside the if condition
```

### Else block

### Code Example

#### code

```java
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 6000) {
            System.out.println("You score was 5000");
            System.out.println("This is not inside the if condition");
        } else {
            System.out.println("this is the else block");
        }
    }
}

```

#### output

```shell
this is the else block
```

In the above example, discovery is equal to 5000, so the first tip condition will fail. Then the code looks for another condition. So when that happens. We have the else condition, so if the if condition is not satisfied then it will look for the else condition so it will execute got here as output.

### Else If

We can expand this further with else if.
If you have more than one condition to test, we can use else if.

### Code Example

#### code

```java
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;

        if (score > 1000 && score < 5000) {
            System.out.println("You score was 5000");
            System.out.println("This is not inside the if condition");
        } else if (score < 1000) {
            System.out.println("your Score is less than 1000");
        } else {
            System.out.println("this is the else block");
        }
    }
}

```

#### output

```shell
your Score is less than 1000
```

### Code Blocks

### Code Example

#### code

```java
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your Final Score is : " + finalScore);
        }
    }
}

```

#### output

```shell
your Final Score is : 1000
```

So here we have created a final score variable inside the if conditions code block. So the scope of this final score will be limited to the if conditions code block. So you cannot access the final score outside of the if condition code block. As soon as the condition executed. Final score variable will be destroyed.
So the variables declared inside a code block is limited to that code block.
Side note.

```java
if (gameOver) { .....
```

### Scope

So the concept of adding variables inside curly braces are called Scope.

Side Note ⚠️
When considering if conditions. We can abbreviate the conditions to short syntax. So instead of writing the whole game over, equals equals true. We can just put the variable. Java view. Compare. The game over value to be truthy.

### Challenge

#### Question

![challenge ](../img/59.png)

#### Answer

##### Code

```java
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your Final Score is : " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your Final Score is : " + finalScore);
        }

    }
}
```

###### output

```shell
your Final Score is : 1000
Your Final Score is : 11600
```

Side Note ⚠️

A side note here.Check the above example.We can see the printing part has been duplicated.Let's say in the future.We want to change the final score formula.If you only change it once.And forget to change the other places.We will get faulty values.So for this kind of implementation, we have to Think about a better solution.

## 5. if then else Recap

### If then else recap

- The if statement identified which statement or code block to run based on the value of an expression. in other words based on a specific condition.
- Inside the code block defined by curly braces {and} we can have one or multiple statements
- We can use the else statement after the if. In that case, when the condition is false, the S block will be executed.

- We can also add elsif to test multiple conditions.
- The following is the basic structure of the if then else statement.

### Code Example

#### code

```java
if(condition){

// if statement codeblock

}else{

// else statement codeblock

}
```

![if then else](../img/60.png)
![if then else](../img/61.png)
![if then else](../img/62.png)

## 6. Methods In Java

Let's refactor this code to use Java methods.

### Code Example

#### code

```java
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your Final Score is : " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your Final Score is : " + finalScore);
        }
    }
}

```

#### output

```shell
your Final Score is : 1000
your Final Score is : 11600
```

Next, refactor this code to use methods.

### Code Example

#### code

```java
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;
        System.out.println("Your Final Score is: " + calculateScore(gameOver, score, levelCompleted, bonus));


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("Your Final Score is: " + calculateScore(gameOver, score, levelCompleted, bonus));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += bonus;
            return finalScore;
        }
        return -1;
    }
}

```

#### output

```shell
Your Final Score is: 1100
Your Final Score is: 11800
```

Side note.Here we are returning minus one because.Minus one is considered faulty in programming and algorithms Look for that.

## 7. More On Methods And A Challenge

We can assign methods to variables.

### Challenge

#### Question

![question](../img/63.png)

#### Answer

##### Code

```java
public class Main {
    public static void main(String[] args) {
        String name = "chamara";

        int score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        score = 900;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        score = 400;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " Manage to get position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 ) {
            return 2;
        } else if (score >= 100 ) {
            return 3;
        } else {
            return 4;
        }
    }
}
```

###### output

```shell
chamara Manage to get position 1 on the high score table
chamara Manage to get position 2 on the high score table
chamara Manage to get position 3 on the high score table
chamara Manage to get position 4 on the high score table
```

## 8. Method Challenge - Final Code Changes

we can write the above challenge in many ways.

##### Code

```java
public class Main {
    public static void main(String[] args) {
        String name = "chamara";

        int score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        score = 900;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        score = 400;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " Manage to get position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;

    }
}
```

###### output

```shell
chamara Manage to get position 1 on the high score table
chamara Manage to get position 2 on the high score table
chamara Manage to get position 3 on the high score table
chamara Manage to get position 4 on the high score table
```

## 9. DiffMerge Tool Introduction

## 10. Install DiffMerge

## 11. Using DiffMerge

## 12. Coding Exercises

## 13. Coding Exercises Example Part 1

## 14. Coding Exercises Example Part 2

## 15. Coding Exercises Example Part 3

## 23. Method Overloading

### Code Example

#### code

```java


```

#### output

```shell

```

## 24. Method Overloading Recap

### Code Example

#### code

```java


```

#### output

```shell

```

## 25. Seconds and Minutes Challenge

## 26. Bonus Challenge Solution

![image](../img/59.png)
![image](../img/60.png)
![image](../img/61.png)
![image](../img/62.png)
![image](../img/63.png)
![image](../img/64.png)
![image](../img/65.png)
![image](../img/66.png)
![image](../img/67.png)
![image](../img/68.png)
![image](../img/69.png)
![image](../img/70.png)
![image](../img/71.png)
![image](../img/72.png)
![image](../img/73.png)
![image](../img/74.png)
![image](../img/75.png)
![image](../img/76.png)
![image](../img/77.png)
![image](../img/78.png)
![image](../img/79.png)
![image](../img/80.png)
![image](../img/81.png)
![image](../img/82.png)
![image](../img/83.png)
![image](../img/84.png)
![image](../img/85.png)
![image](../img/86.png)
![image](../img/87.png)
![image](../img/88.png)
![image](../img/89.png)
![image](../img/90.png)
![image](../img/91.png)
![image](../img/92.png)
![image](../img/93.png)
![image](../img/94.png)
![image](../img/95.png)
![image](../img/96.png)
![image](../img/97.png)
![image](../img/98.png)
![image](../img/99.png)
