public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("red");
        Wall wall2 = new Wall("red");
        Wall wall3 = new Wall("red");
        Wall wall4 = new Wall("red");
        Windows windows = new Windows(12,12);
        Couch couch = new Couch("sdfsdf");
        Tv tv = new Tv("sdfsdlhf");

        Room room = new Room(wall1,wall2,wall3,wall4,windows,couch,tv);

        room.OpenWindow();
    }
}