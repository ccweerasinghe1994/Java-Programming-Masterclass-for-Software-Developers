public class HealthyBurger extends Hamburger {
    private String healthyOption1;
    private double healthyOption1Price;
    private String healthyOption2;
    private double healthyOption2Price;

    public HealthyBurger(String meat, double price) {
        super("healthy", "rye", meat, price);
    }

    public void addHealthyOption1(String option, double price) {
        this.healthyOption1 = option;
        this.healthyOption1Price = price;
    }

    public void addHealthyOption2(String option, double price) {
        this.healthyOption2 = option;
        this.healthyOption2Price = price;
    }

    @Override
    public double getTotalBill() {
        double price = super.getTotalBill();
        if (this.healthyOption1 != null) {
            System.out.println("extra " + this.healthyOption1 + " is added for " + this.healthyOption1Price);
            price += this.healthyOption1Price;
        }
        if (this.healthyOption2 != null) {
            System.out.println("extra " + this.healthyOption2 + " is added for " + this.healthyOption2Price);
            price += this.healthyOption2Price;
        }
        return price;
    }
}
