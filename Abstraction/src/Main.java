public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("cutie");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("humming");
        parrot.breathe();
        parrot.eat();
        parrot.breathe();

        Penguin penguin = new Penguin("mike");
        penguin.fly();
    }
}