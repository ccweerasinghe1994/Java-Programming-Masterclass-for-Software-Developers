public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
