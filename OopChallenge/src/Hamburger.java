public class Hamburger {
    private String name;
    private String breadRole;
    private String meat;
    private double price;

    private String option1;
    private double option1Price;
    private String option2;
    private double option2Price;
    private String option3;
    private double option3Price;
    private String option4;
    private double option4Price;

    public Hamburger(String name, String breadRole, String meat, double price) {
        this.name = name;
        this.breadRole = breadRole;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBreadRole() {
        return breadRole;
    }

    public String getMeat() {
        return meat;
    }

    public double getTotalBill() {
        double hamburgerPrice = this.price;
        System.out.println("Your " + this.name + " burger with " + this.meat + ", " + this.breadRole + " is " + this.price);
        if (this.option1 != null) {
            System.out.println("extra " + this.option1 + " is added for " + this.option1Price);
            hamburgerPrice += this.option1Price;
        }
        if (this.option2 != null) {
            System.out.println("extra " + this.option2 + " is added for " + this.option2Price);
            hamburgerPrice += this.option2Price;
        }
        if (this.option3 != null) {
            System.out.println("extra " + this.option3 + " is added for " + this.option3Price);
            hamburgerPrice += this.option3Price;
        }
        if (this.option4 != null) {
            System.out.println("extra " + this.option4 + " is added for " + this.option4Price);
            hamburgerPrice += this.option4Price;
        }
        return hamburgerPrice;
    }

    public void addOption1(String option, double price) {
        this.option1 = option;
        this.option1Price = price;
    }

    public void addOption2(String option, double price) {
        this.option2 = option;
        this.option2Price = price;
    }

    public void addOption3(String option, double price) {
        this.option3 = option;
        this.option3Price = price;
    }

    public void addOption4(String option, double price) {
        this.option4 = option;
        this.option4Price = price;
    }

}
