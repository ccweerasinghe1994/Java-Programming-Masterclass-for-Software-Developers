public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Banking App");
        Bank bank = new Bank("HNB");
        System.out.println("Welcome to the " + bank.getName()+ " Bank");
        Branch colomboBranch = bank.createBranch("COLOMBO");
//        bank.createBranch("B");
//        bank.printBranchList();
        bank.addCustomer("COLOMBO","chamara",1200);
        bank.addCustomer("COLOMBO","gagani",1500);
        bank.addCustomer("COLOMBO","gagani",1500);
//        bank.addCustomer("COLOMBO","chamara2",1200);
//        bank.addCustomer("COLOMBO","chamara3",1200);
//        bank.addCustomer("COLOMBO","chamara4",1200);
//        bank.addTransAction("chamara",100);
//        bank.addTransAction("chamara",150);
//        bank.addTransAction("chamara",400);
//        bank.addTransAction("chamara",600);
//        System.out.println("---------- BRANCH LEVEL ------------------");
//        System.out.println("branch -> "+colomboBranch.getName());
//        colomboBranch.addCustomer("gagani",500);
//        System.out.println("---------------- BRANCH CUSTOMER DETAILS ------------------");
//        colomboBranch.printCustomers();
    }
}