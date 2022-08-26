public class Main {
    public static void main(String[] args) {
        VipCustomer elon = new VipCustomer();
        System.out.println(elon.getName() +
                " is a vip customer and his email is " + elon.getEmail() + ". and has a credit limit of " + elon.getCreditLimit());
        VipCustomer brain = new VipCustomer("andrew", 200000);
        System.out.println(brain.getName() +
                " is a vip customer and his email is " + brain.getEmail() + ". and has a credit limit of " + brain.getCreditLimit());
        VipCustomer andrew = new VipCustomer("andrew", 30000, "andrew@gmail.com");
        System.out.println(andrew.getName() +
                " is a vip customer and his email is " + andrew.getEmail() + ". and has a credit limit of " + andrew.getCreditLimit());

    }
}