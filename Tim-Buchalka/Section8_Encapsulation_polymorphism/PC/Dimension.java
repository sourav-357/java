package Section8_Encapsulation_polymorphism.PC;

public class Dimension {
    private int width;
    private int hight;
    private int depth;

    public Dimension(int width, int hight, int depth) {
        this.width = width;
        this.hight = hight;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHight() {
        return hight;
    }

    public int getDepth() {
        return depth;
    }
}
