import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private String name;
    private final ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Branch createBranch(String branchName) {
        if(findBranch(branchName) != null){
            System.out.println("cannot create the branch. branch already exists !");
            return null;
        }
        Branch branch = new Branch(branchName);
        branches.add(branch);
        return branch;
    }
    private Branch findBranch(String branchName) {
        for (Branch branch:branches){
            if(Objects.equals(branch.getName(), branchName)){
                return branch;
            }
        }
        return null;
    }
    private int findBranch(Branch branch) {
        int index = branches.indexOf(branch);
        if (index > 0) {
            System.out.println("This branch already exists");
            return -1;
        }

        return index;
    }

    public void printBranchList(){
        System.out.println("these are the branches of bank "+ this.name);
        for (Branch branch:branches){
            System.out.println(branch.getName());
        }
    }

    public void addCustomer(String branchName,String customerName,double initialDeposit){
        Branch findBranch = findBranch(branchName);
        if(findBranch == null){
            System.out.println("please enter a valid branch");
            return;
        }
        findBranch.addCustomer(customerName,initialDeposit);

    }

    public void addTransAction(String customerName,double amount){
        for (Branch branch:branches){
            Customer customer = branch.findCustomer(customerName);
            if(customer!=null){
                customer.addTransaction(amount);
            }
        }
    }




}
