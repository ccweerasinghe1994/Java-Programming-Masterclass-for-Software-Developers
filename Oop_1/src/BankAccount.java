public class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;
    private String email;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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

    public void desposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " and new balance is " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Insufficient funds");
            return;
        }
        this.balance -= amount;
        System.out.println("Withdrew " + amount + " and new balance is " + this.balance);
    }
}
