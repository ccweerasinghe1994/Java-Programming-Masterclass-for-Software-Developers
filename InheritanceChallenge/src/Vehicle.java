public class Vehicle {

    private String name;
    private String size;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }


    public void steering(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.currentDirection + " degrees");
    }


    public void move(int velocity, int direction) {
        this.currentDirection = direction;
        this.currentSpeed = velocity;
        System.out.println("Vehicle.move() vehicle is moving at " + this.currentSpeed + " in direction " + this.currentDirection);

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentSpeed = 0;
    }
}
