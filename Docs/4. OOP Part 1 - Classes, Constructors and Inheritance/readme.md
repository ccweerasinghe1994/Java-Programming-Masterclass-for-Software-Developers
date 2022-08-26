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

### Challenge

#### Question

#### Answer

##### Code

```java
public class Bank {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("your current balance is : $" + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("insufficient funds");
        } else {
            this.balance -= amount;
            System.out.println("your current balance is : $" + this.balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setCustomerName("Chamara");
        bank.setEmail("ccweerasinghe1994@gmail.com");
        bank.setPhoneNumber("0767199431");
        bank.setAccountNumber(123456789);

        bank.deposit(1200);
        bank.withdraw(422);
        bank.withdraw(422);
        bank.withdraw(422);
    }
}

```

###### output

```shell
your current balance is : $1200.0
your current balance is : $778.0
your current balance is : $356.0
insufficient funds
```


### Code Example

#### code
```java
public class Bank {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank() {
        this(00000000000,0000,"default name","default email","000000000");
        System.out.println("Empty Constructor is called");
    }

    public Bank(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Bank Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("your current balance is : $" + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("insufficient funds");
        } else {
            this.balance -= amount;
            System.out.println("your current balance is : $" + this.balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("name "+bank.getCustomerName());
        System.out.println("email "+bank.getEmail());

        bank.deposit(1200);
        bank.withdraw(422);
        bank.withdraw(422);
        bank.withdraw(422);
    }
}

```

#### output

```shell
Bank Constructor with parameters called
Empty Constructor is called
name default name
email default email
your current balance is : $1200.0
your current balance is : $778.0
your current balance is : $356.0
insufficient funds
```

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
