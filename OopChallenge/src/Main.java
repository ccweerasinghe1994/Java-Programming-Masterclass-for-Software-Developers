public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("normal", "white", "sousage", 3.23);
        hamburger.addOption1("Tomato", 0.21);
        hamburger.addOption2("lettuce", 0.21);
        hamburger.addOption3("carrot", 0.21);
        hamburger.addOption4("onion", 0.21);
        double price = hamburger.getTotalBill();
        System.out.println("Total Price for the burger " + price);


        HealthyBurger healthyBurger = new HealthyBurger("sousage", 3.23);
        healthyBurger.addOption1("Tomato", 0.21);
        healthyBurger.addOption2("lettuce", 0.21);
        healthyBurger.addOption3("carrot", 0.21);
        healthyBurger.addOption4("onion", 0.21);
        healthyBurger.addHealthyOption1("bisil", 12.1);
        healthyBurger.addHealthyOption2("olive", 12.1);

        double Newprice = healthyBurger.getTotalBill();
        System.out.println("Total Price for the burger " + Newprice);

        DeluxeBurger deluxeBurger = new DeluxeBurger("pork", 12);
        deluxeBurger.addOption1("Tomato", 0.21);
        deluxeBurger.addOption2("lettuce", 0.21);
        deluxeBurger.addOption3("carrot", 0.21);
        deluxeBurger.addOption4("onion", 0.21);
        double deluxeBurgerTotalBill = deluxeBurger.getTotalBill();
        System.out.println("Total Price for the burger " + deluxeBurgerTotalBill);
    }
}