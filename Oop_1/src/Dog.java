public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        super(type, size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    //    bark()
    public static void bark() {
        System.out.println("Dog.bark() called");
        System.out.println("Dog is barking");
    }

    //    run()
    public static void run() {
        System.out.println("Dog.run() called");
        System.out.println("Dog is running");
    }

    //    walk()
    public static void walk() {
        System.out.println("Dog.walk() called");
        System.out.println("Dog is walking");
    }

    //    wagTail()}
    public static void wagTail() {
        System.out.println("Dog.wagTail() called");
        System.out.println("Dog is wagging tail");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog.makeNoise() called");
        System.out.println("Dog is making noise");
    }
}
