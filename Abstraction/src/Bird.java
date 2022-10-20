public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is pecking and eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName()+ "is breathing");
    }

    @Override
    public void fly() {
        System.out.println("flapping it's wings");
    }
}
