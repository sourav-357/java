package Section8_Encapsulation_polymorphism.PC;

public class Main {

    public static void main(String[] args) {

        Dimension dimension = new Dimension(5, 23, 131);
        Resolution resolution = new Resolution(230, 180);

        Case theCase = new Case("Grey", "230W", dimension);
        Monitor monitor = new Monitor("Asus", "KV-2", 3000, resolution);
        Motherboard motherboard = new Motherboard("LG", "Qwarantine Special", 2, 4, "Lenovo");

        PC Mac = new PC(motherboard, theCase, monitor);

        // important
        // System.out.println(Mac.getTheMonitor().drawPixels(2,3,"Red"));

        Mac.powerUp();// it is equal to
        theCase.pressPowerButton();

        Mac.launchingMinecraft();
        motherboard.loadingProgram("Firefox Web");

        System.out.println(monitor.drawPixels(21, 32, "Pink\n"));

        Test yell = new Test();
        // without sout it wont print
        System.out.println(yell.test());

    }
}
