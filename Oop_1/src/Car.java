public class Car {
    private String make = "Porsche";
    private String model = "Carrera";
    private String color = "Red";

    private int doors = 2;

    private boolean convertible = false;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describe() {
        System.out.println("This is a car");
        System.out.println("this car make is " +
                this.make + " and model is " +
                this.model + " and color is "
                + this.color
                + " and doors are " + this.doors
                + " and convertible is " + this.convertible
        );
    }
}
