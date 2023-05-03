public class Main {
    public static void main(String[] args) {

        Car porsche = new Car();
        porsche.describe();
        System.out.println(porsche.getMake());
        System.out.println(porsche.getModel());
        System.out.println(porsche.getColor());
        System.out.println(porsche.getDoors());
        System.out.println(porsche.isConvertible());
    }
}
