package Section8_Encapsulation_polymorphism.PC;

public class Monitor {
    private String manufacturer;
    private String model;
    private int size;
    private Resolution resolution;

    public Monitor(String manufacturer, String model, int size, Resolution resolution) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }

    // method
    public String drawPixels(int x, int y, String color) {
        return "Drawing pixels at " + x + " and " + y + " in color " + color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
