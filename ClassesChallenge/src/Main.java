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