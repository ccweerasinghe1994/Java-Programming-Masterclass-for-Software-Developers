import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("chamara", 12.23);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(45.23);

        System.out.println("customer balance : " + customer.getBalance());

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(34);
        arrayList.add(1);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + " : " + arrayList.get(i));
        }
        System.out.println("-------- ADDING A ELEMENT TO A ARRAY LIST --------");
        arrayList.add(1, 2);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + " : " + arrayList.get(i));
        }
//         this way is ok for a small array list.
//        but if we have millions of records this process will be slow.
    }
}