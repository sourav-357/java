package Section8_Encapsulation_polymorphism.PC;

public class Case {
    private String color;
    private String powerSupply;
    private Dimension dimension;

    public Case(String color, String powerSupply, Dimension dimension) {
        this.color = color;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getColor() {
        return color;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
