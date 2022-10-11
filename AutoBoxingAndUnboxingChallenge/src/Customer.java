import java.util.ArrayList;

public class Customer {
    private final String name;
    private final ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialTransactionAmount) {
        this.name = name;
        transactions.add(Double.valueOf(initialTransactionAmount));
    }

    public String getName() {
        return name;
    }

    public static Customer createNewCustomer(String name, double amount){

        return new Customer(name,amount) ;
    }

    public void addTransaction(double transaction){
        transactions.add(Double.valueOf(transaction));
    }

    public void printBankStatement(){
        System.out.println("Customer name: " + this.name+ " bank statement");

        for (Double transaction:transactions){
            System.out.println("made a traction -> "+ transaction.doubleValue());
        }
    }
}
