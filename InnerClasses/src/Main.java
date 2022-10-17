public class Main {
    public static void main(String[] args) {
        GearBox maclaren = new GearBox(6);

        GearBox.Gear first = maclaren.new Gear(1,12.3);
//        u can't do this
//        GearBox.Gear second = new GearBox.Gear(3,12.1);
//        GearBox.Gear third = new maclaren.Gear(3,12.1);
//        this inner class we should keep private.
//        we don't want to interact with the individual gears when we are driving.



        double speed = first.driveSpeed(1000);
        System.out.println(speed);
    }
}