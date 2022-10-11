import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (Objects.equals(branch.getName(), branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialDeposit) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return existingBranch.newCustomer(customerName, initialDeposit);
        }
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double deposit) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return existingBranch.addTransaction(customerName, deposit);
        }
        return false;
    }

    public boolean listCustomer(String branchName, boolean listTransactions) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            ArrayList<Customer> customers = existingBranch.getCustomers();
            System.out.println("<------ Customer List -----> ");
            customers.forEach(customer -> {
                System.out.println("Customer Name: " + customer.getName());
                if (listTransactions) {
                    System.out.println("<------ transaction List -----> ");
                    ArrayList<Double> transactions = customer.getTransactions();
                    transactions.forEach(aTransaction -> {
                        System.out.println("transaction -> " + aTransaction);
                    });
                }
            });
            return true;
        } else {
            return false;
        }
    }

}
