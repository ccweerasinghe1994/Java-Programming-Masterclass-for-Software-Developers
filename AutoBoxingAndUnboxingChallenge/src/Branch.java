import java.util.ArrayList;
import java.util.Objects;

public class Branch {
    private final String name;
    private static final ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void getCustomer(Customer customer) {
        int index = findCustomer(customer);
    }

    private int findCustomer(Customer customer) {
        return customers.indexOf(customer);
    }

    public void addCustomer(Customer customer) {
        if (findCustomer(customer) >= 0) {
            System.out.println("this customer already exists");
            return;
        }

        customers.add(customer);
        customer.printBankStatement();
    }

    public void addCustomer(String customerName,double initialAmount){

        Customer newCustomer = Customer.createNewCustomer(customerName,initialAmount);
        addCustomer(newCustomer);
    }

    public Customer findCustomer(String customerName) {

        for (Customer customer : customers) {
            if (Objects.equals(customer.getName(), customerName)) {
                return customer;
            }
        }
        return null;
    }

    public void printCustomers() {
        System.out.println("Customer list for the " + this.name + " Branch");
        for (Customer customer : customers) {
            System.out.println("customer -> " + customer.getName());
            customer.printBankStatement();
        }
    }
}
