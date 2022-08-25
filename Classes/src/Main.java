public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("911");
        System.out.println("Model is "+porsche.getModel());

        porsche.setModel("carrera");
        System.out.println("Model is "+porsche.getModel());

        porsche.setModel("commodore");
        System.out.println("Model is "+porsche.getModel());

    }
}