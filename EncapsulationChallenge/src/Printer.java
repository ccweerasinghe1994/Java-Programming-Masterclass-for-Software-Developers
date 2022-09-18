public class Printer {
    private double tonerLevel = 100;
    private int numberOfPagesPrinted = 0;
    private boolean isDuplex = false;

    public Printer(boolean isDuplex) {
        this.isDuplex = isDuplex;
    }

    public void printPage(int noOfPages) {

        if (this.tonerLevel - (noOfPages / 10) <= 0) {
            System.out.println("Sorry Cannot print this many pages");
        } else {
            this.tonerLevel -= noOfPages / 10 + noOfPages % 2;
            if (isDuplex) {
                System.out.println("this printer is a duplex printer");
                this.numberOfPagesPrinted += noOfPages / 2 + noOfPages % 2;
            } else {
                this.numberOfPagesPrinted += noOfPages;
            }
        }
    }

    public void fillTheToner(int amount) {
        if (this.tonerLevel + amount > 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel += amount;
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
