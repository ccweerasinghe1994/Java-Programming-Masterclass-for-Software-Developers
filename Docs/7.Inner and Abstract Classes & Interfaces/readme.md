# [🏠 HOME PAGE](../../README.md)

## Inner and Abstract Classes & Interfaces

### 1. Interfaces

```java
public interface ITelephone {
    //    these are called signatures
    public void powerOn();

    public void dail(int phoneNumber);

    public void answer();

    public boolean callPhone(int phoneNumber);

    public boolean isRinging();
}

public class DeskPhone implements ITelephone {
    private final int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("no action taken. desk phone don't have a power button");
    }

    @Override
    public void dail(int phoneNumber) {
        System.out.println("no ringing " + phoneNumber + " on the desk phone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("answering the desk phone");
            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber) {
            this.isRinging = true;
            System.out.println("Ring Ring");
        } else {
            this.isRinging = false;
        }
        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}


public class Main {
    public static void main(String[] args) {
        ITelephone deskPhone;
        deskPhone = new DeskPhone(121212);
        deskPhone.powerOn();
        deskPhone.dail(121212);
        deskPhone.isRinging();
        deskPhone.callPhone(121212);
        if (deskPhone.isRinging()) {
            System.out.println("your phone is ringing");
        }
        ;
    }
}
```

```bash
no action taken. desk phone don't have a power button
no ringing 121212 on the desk phone
Ring Ring
your phone is ringing
```

### 2. Interfaces Part 2

let's create a mobile phone class.

```java
public class MobilePhone implements ITelephone {
    private final int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("mobile phone powered on");
    }

    @Override
    public void dail(int phoneNumber) {
        if (isOn) {
            System.out.println("no ringing " + phoneNumber + " on the mobile phone");
        } else {
            System.out.println("phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("answering the mobile phone");
            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber && isOn) {
            this.isRinging = true;
            System.out.println("Melody" +
                    " Ring");
        } else {
            this.isRinging = false;
            System.out.println("Mobile phone is not on");
        }
        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }

}

```

and test the object.

```java
public class Main {
    public static void main(String[] args) {
        ITelephone deskPhone;
        deskPhone = new DeskPhone(121212);
        deskPhone.powerOn();
        deskPhone.dail(121212);
        deskPhone.isRinging();
        deskPhone.callPhone(121212);
        if (deskPhone.isRinging()) {
            System.out.println("your phone is ringing");
        }
        System.out.println("--------------------- mobile phone -------------------");
        ITelephone chamara = new MobilePhone(123);
        chamara.callPhone(123);
        chamara.answer();
    }
}

```

```bash
no action taken. desk phone don't have a power button
no ringing 121212 on the desk phone
Ring Ring
your phone is ringing
--------------------- mobile phone -------------------
Mobile phone is not on
```

let's revisit the linked list challenge.

### 3. Interfaces Challenge Part 1

```java
import java.util.List;

public interface ISavable {
    List<String> write();

    void read(List<String> list);
}
```

```java
import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" + "name='" + name + '\'' + ", hitPoints=" + hitPoints + ", strength=" + strength + ", weapon='" + weapon + '\'' + '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, String.valueOf(this.hitPoints));
        values.add(2, String.valueOf(this.strength));
        values.add(3, this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}

```

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Player tim = new Player("chamara",12,100);
        System.out.println(tim.toString());

        tim.setHitPoints(122);
        System.out.println(tim.toString());

        tim.setWeapon("Storm bringer");
        System.out.println(tim.toString());
        System.out.println("---------------------------------------------------------------");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim.toString());



    }

    public static ArrayList<String> readvalues(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();
        boolean quit = false;
        int choice;
        printInstruction();
        int index = 0;
        while (!quit){
            System.out.println("please enter choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0 ->{
                    quit = true;
                }
                case 1->{
                    System.out.println("please enter a name");
                    String value = scanner.nextLine();
                    values.add(index,value);
                    index++;
                }
            }
        }
        return values;
    }

    public static void printInstruction(){
        System.out.println("""
                press
                0 - to exit
                1 - to enter a value
                """);
    }

    public static void saveObject(ISavable objectToSave){
        for(String item:objectToSave.write()){
            System.out.println("saving "+item+" to the storage device");
        }
    }

    public static void loadObject(ISavable objectTLoad){
        ArrayList<String> values = readvalues();
        objectTLoad.read(values);
    }
}
```

### 4. Interfaces Challenge Part 2

```java
import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, String.valueOf(this.strength));
        values.add(2, String.valueOf(this.hitPoints));
        return values;
    }

    @Override
    public void read(List<String> list) {
        if (list != null && list.size() > 0) {
            this.name = list.get(0);
            this.strength = Integer.parseInt(list.get(1));
            this.hitPoints = Integer.parseInt(list.get(2));
        }
    }
}


```

````java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player tim = new Player("chamara", 12, 100);
        System.out.println(tim);

        tim.setHitPoints(122);
        System.out.println(tim);

        tim.setWeapon("Storm bringer");
        System.out.println(tim);
        System.out.println("---------------------------------------------------------------");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim);

        System.out.println("----------- Monster section----------------------------");

        ISavable wearwolf = new Monster("wearwolf", 12, 12);
//         here we can cast the object to the Monster or use the monster instead;
        System.out.println(((Monster) wearwolf).getName());
        saveObject(wearwolf);

    }

    public static ArrayList<String> readvalues() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();
        boolean quit = false;
        int choice;
        printInstruction();
        int index = 0;
        while (!quit) {
            System.out.println("please enter choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 -> {
                    quit = true;
                }
                case 1 -> {
                    System.out.println("please enter a name");
                    String value = scanner.nextLine();
                    values.add(index, value);
                    index++;
                }
            }
        }
        return values;
    }

    public static void printInstruction() {
        System.out.println("""
                press
                0 - to exit
                1 - to enter a choice
                """);
    }

    public static void saveObject(ISavable objectToSave) {
        for (String item : objectToSave.write()) {
            System.out.println("saving " + item + " to the storage device");
        }
    }

    public static void loadObject(ISavable objectTLoad) {
        ArrayList<String> values = readvalues();
        objectTLoad.read(values);
    }
}
```


### 5. Inner classes Part 1

### 6. Inner Classes Part 2

### 7. Inner Classes Challenge

### 8. Abstract Classes Part 1

### 9. Abstract Classes Part 2

### 10. Interface vs Abstract Class

### 11. Abstract Class Challenge Part 1

### 12. Abstract Class Challenge Part 2

### 13. Abstract Class Challenge Part 3 (includes recursion)
