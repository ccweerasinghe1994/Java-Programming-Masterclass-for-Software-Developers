import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear;
    private boolean isClutchIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void setClutchIn(boolean in) {
        this.isClutchIn = in;
    }

    public void addGear(int gearNumber, double ratio) {
        if (gearNumber > 0 && gearNumber <= this.maxGears) {
            this.gears.add(new Gear(gearNumber, ratio));
        }
    }

    public void changeGear(int gear) {
        if (gear >= 0 && gear < this.gears.size() && this.isClutchIn) {
            this.currentGear = gear;
            System.out.println("Gear " + gear + " selected");
        } else {
            System.out.println("Grind");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (isClutchIn) {
            System.out.println("Scream !");
            return 0.0;
        } else {
            return revs * gears.get(currentGear).ratio;
        }
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}
