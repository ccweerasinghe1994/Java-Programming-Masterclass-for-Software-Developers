public class StaticExample {
    private static String name;

    public StaticExample(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }
}
