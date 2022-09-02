# Composition, Encapsulation, and Polymorphism

## Composition

we use composition when we have to have the has a relation ship.

### Code Example

#### code

```java
public class MotherBoard {
    private String manufacturer;
    private String model;
    private int ramSlots;
    private String bios;

    public MotherBoard(String manufacturer, String model, int ramSlots, String bios) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgramme(String programName) {
        System.out.println("Program " + programName + " is loading");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getBios() {
        return bios;
    }
}

public class Monitor {
    private String model;
    private String manufacture;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacture, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawingPixels(int x, int y, String color) {
        System.out.println("Drawing pixels at x: " + x + " y: " + " with color " + color);
    }
}

public class Case {
    private String model;
    private String manufacturer;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button is pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

public class Dimensions {
    private int width;
    private int height;
    private int depth;

    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}

public class Resolution {
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(23,18,3);
        Case theCase = new Case("23b","Dell",dimensions);
        Resolution nativeResolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("abc","Dell",12,nativeResolution);
        MotherBoard motherBoard = new MotherBoard("sdsd","Dell",4,"sdjfsjdfg");

        PC pc = new PC(theCase,monitor,motherBoard);

        pc.getMonitor().drawingPixels(12,45,"red");
        pc.getMotherBoard().loadProgramme("windows 1.0");
        pc.getTheCase().pressPowerButton();

    }
}


```

#### output

```shell

```

## Composition Part 2 (+Challenge Exercise)

## Encapsulation

## Encapsulation (+Challenge Exercise)

## Polymorphism

## Polymorphism (+Challenge Exercise)

## OOP Master Challenge Exercise

## OOP Challenge - Solution
