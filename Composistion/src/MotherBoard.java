public class MotherBoard {
    private String manufacturer;
    private String model;
    private int ramSlots;
    private String bios;

    public MotherBoard(String manufacturer, String model, int ramSlots, String bios) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgramme(String programName) {
        System.out.println("Program " + programName + " is loading");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getBios() {
        return bios;
    }
}
