import java.awt.*;

public class Room {
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Windows window;
    private Couch couch;
    private Tv tv;

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Windows window, Couch couch, Tv tv) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.window = window;
        this.couch = couch;
        this.tv = tv;
    }

    public void OpenWindow(){
        window.open();
    }
}
