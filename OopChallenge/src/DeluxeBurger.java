public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String meat, double price) {
        super("deluxe", "white", meat, price);
        super.addOption1("chips", 2);
        super.addOption2("drink", 4);
    }

    @Override
    public void addOption1(String option, double price) {
        System.out.println("cannot add extras");
    }

    @Override
    public void addOption2(String option, double price) {
        System.out.println("cannot add extras");
    }

    @Override
    public void addOption3(String option, double price) {
        System.out.println("cannot add extras");
    }

    @Override
    public void addOption4(String option, double price) {
        System.out.println("cannot add extras");
    }

}
