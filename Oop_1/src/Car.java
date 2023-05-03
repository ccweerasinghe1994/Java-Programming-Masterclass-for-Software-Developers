public class Car {
    private String make;
    private String model;
    private String color;

    private int doors;

    private boolean convertible;

    private void describe(){
        System.out.println("This is a car");
        System.out.println("this car make is " + this.make + " and model is " + this.model+ " and color is " + this.color);
    }
}
