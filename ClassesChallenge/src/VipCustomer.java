public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;


    public VipCustomer() {
        this("default name", 10000000, "default email");
        System.out.println("Empty Constructor is called");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default email");
        System.out.println("Constructor with two parameters is called");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        System.out.println("Constructor with full parameters is called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
