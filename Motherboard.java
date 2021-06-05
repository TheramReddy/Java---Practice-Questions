package Composition;

public class Motherboard {

    private String model;
    private String manufacture;
    private int ramslots;
    private int cardslot;
    private int bios;

    public Motherboard(String model, String manufacture, int ramslots, int cardslot, int bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramslots = ramslots;
        this.cardslot = cardslot;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " +programName+" is now loading.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getRamslots() {
        return ramslots;
    }

    public int getCardslot() {
        return cardslot;
    }

    public int getBios() {
        return bios;
    }

}
