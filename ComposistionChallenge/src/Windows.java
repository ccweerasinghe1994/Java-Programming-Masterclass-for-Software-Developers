public class Windows {
    private int width;
    private int height;

    public Windows(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void open(){
        System.out.println("window is opening");
    }

}
