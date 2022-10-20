public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("i am not very good at this can i go for a swim instead");
    }
}
