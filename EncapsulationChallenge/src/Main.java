public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(true);
        printer.printPage(200);
        System.out.println("Toner Level :"+printer.getTonerLevel());
        System.out.println("Pages Printed :"+printer.getNumberOfPagesPrinted());
        printer.printPage(100);
        System.out.println("Toner Level :"+printer.getTonerLevel());
        System.out.println("Pages Printed :"+printer.getNumberOfPagesPrinted());
    }
}