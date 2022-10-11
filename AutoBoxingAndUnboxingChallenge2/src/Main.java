public class Main {
    public static void main(String[] args) {
        Bank hnbBank = new Bank("HNB BANK");

        hnbBank.addBranch("COLOMBO");
        hnbBank.addCustomer("COLOMBO", "chamara", 12.34);
        hnbBank.addCustomer("COLOMBO", "shan", 112.34);

        hnbBank.addBranch("NEGAMBO");
        hnbBank.addCustomer("NEGAMBO", "gagani", 1232.34);
        hnbBank.addCustomer("NEGAMBO", "dilshan", 432.34);

        hnbBank.addTransaction("COLOMBO", "chamara", 1200);
        hnbBank.addTransaction("COLOMBO", "chamara", 1200);
        hnbBank.addTransaction("COLOMBO", "shan", 1200);
        hnbBank.addTransaction("NEGAMBO", "dilshan", 1200);

        hnbBank.listCustomer("COLOMBO", true);
        hnbBank.listCustomer("NEGAMBO", true);

        hnbBank.addBranch("KI");

        if (!hnbBank.addCustomer("KI", "chamara", 1212.234)) {
            System.out.println("Sorry KI branch doesn't exist");
        }

        if (!hnbBank.addBranch("KI")) {
            System.out.println("KI branch already exists");
        }

        if (!hnbBank.addTransaction("COLOMBO", "achamara", 1200)) {
            System.out.println("customer doesn't exist");
        }

        if (!hnbBank.addCustomer("NEGAMBO", "dilshan", 432.34)) {
            System.out.println("this customer already exists");
        }
    }
}