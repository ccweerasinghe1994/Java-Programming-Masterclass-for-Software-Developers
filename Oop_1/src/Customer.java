public class Customer {
    private String name;
    private String email;

    private double creditLimit;

    public Customer() {
        this("Default name", "Default email", 1000.00);
        System.out.println("Empty constructor called");
    }

    public Customer(String name, String email) {
        this(name, email, 0.00);
    }

    public Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
