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

### 4. Interfaces Challenge Part 2

### 5. Inner classes Part 1

### 6. Inner Classes Part 2

### 7. Inner Classes Challenge

### 8. Abstract Classes Part 1

### 9. Abstract Classes Part 2

### 10. Interface vs Abstract Class

### 11. Abstract Class Challenge Part 1

### 12. Abstract Class Challenge Part 2

### 13. Abstract Class Challenge Part 3 (includes recursion)
