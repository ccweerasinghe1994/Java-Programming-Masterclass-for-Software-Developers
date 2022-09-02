public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(23,18,3);
        Case theCase = new Case("23b","Dell",dimensions);
        Resolution nativeResolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("abc","Dell",12,nativeResolution);
        MotherBoard motherBoard = new MotherBoard("sdsd","Dell",4,"sdjfsjdfg");

        PC pc = new PC(theCase,monitor,motherBoard);

        pc.getMonitor().drawingPixels(12,45,"red");
        pc.getMotherBoard().loadProgramme("windows 1.0");
        pc.getTheCase().pressPowerButton();

    }
}