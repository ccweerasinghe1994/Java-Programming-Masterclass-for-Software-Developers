public class Main {
    public static void main(String[] args) {
        GearBox maclaren = new GearBox(6);

        maclaren.setClutchIn(true);
        maclaren.changeGear(1);
        maclaren.setClutchIn(false);
        System.out.println("Wheel Speed: " + maclaren.wheelSpeed(3000));
        maclaren.changeGear(2);
        System.out.println("Wheel Speed: " + maclaren.wheelSpeed(6000));
        maclaren.setClutchIn(true);
        maclaren.changeGear(3);
        maclaren.setClutchIn(false);
        System.out.println("Wheel Speed: " + maclaren.wheelSpeed(9000));

//        as we can see we are now not using the Gear Class


    }
}