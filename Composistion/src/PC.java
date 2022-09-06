public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void drawLogo(){
//        fancy graphics
        monitor.drawingPixels(12,23,"red");
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

}
