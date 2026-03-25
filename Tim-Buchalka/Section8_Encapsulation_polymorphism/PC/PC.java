package Section8_Encapsulation_polymorphism.PC;

//class that is comprised from ohter classes (composition)
public class PC {
    private Motherboard theMotherboard;
    private Case theCase;
    private Monitor theMonitor;

    public PC(Motherboard theMotherboard, Case theCase, Monitor theMonitor) {
        this.theMotherboard = theMotherboard;
        this.theCase = theCase;
        this.theMonitor = theMonitor;
    }

    public void powerUp() {
        theCase.pressPowerButton();
    }

    public void launchingMinecraft() {
        getTheMotherboard().loadingProgram("Minecraft");
    }

    private Motherboard getTheMotherboard() {
        return theMotherboard;
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getTheMonitor() {
        return theMonitor;
    }
}
