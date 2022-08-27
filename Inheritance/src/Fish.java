public class Fish extends Animal {
    private int gils;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gils, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gils = gils;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFins() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFins();
        move(speed);
    }
}
