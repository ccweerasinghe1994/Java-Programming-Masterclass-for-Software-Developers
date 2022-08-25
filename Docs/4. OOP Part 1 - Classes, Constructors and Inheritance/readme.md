# OOP Part 1 - Classes, Constructors and Inheritance

## Classes Part 1

### Code Example

#### code

```java
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
}

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

    }
}

```

## Classes Part 2

### Code Example

#### code

```java
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("911");
        System.out.println("Model is "+porsche.getModel());

        porsche.setModel("carrera");
        System.out.println("Model is "+porsche.getModel());

        porsche.setModel("commodore");
        System.out.println("Model is "+porsche.getModel());

    }
}

```

#### output

```shell
Model is Unknown
Model is carrera
Model is commodore
```

## Constructors - Part 1 (+Challenge Exercise)

## Constructors - Part 2 (+Challenge Exercise)

## Inheritance - Part 1

## Inheritance - Part 2

## Reference vs Object vs Instance vs Class

## this vs super

## Method Overloading vs Overriding Recap

## Static vs Instance Methods

## Static vs Instance Variables

## Inheritance Challenge Part 1 (+Challenge Exercise)

## Inheritance Challenge Part 2
