package Section8_Encapsulation_polymorphism.Composition_Room;

public class Lights {
     private int amountBulbs;
     private String temparatureK;
     private GarlandLights garlandLights;

     public Lights(int amountBulbs, String temparatureK, GarlandLights garlandLights) {
          this.amountBulbs = amountBulbs;
          this.temparatureK = temparatureK;
          this.garlandLights = garlandLights;
     }

     public void onOff(boolean value) {
          if (value == true) {
               System.out.println("Lights are on");
          } else
               System.out.println("Lights are off");
     }

     public int getAmountBulbs() {
          return amountBulbs;
     }

     public String getTemparatureK() {
          return temparatureK;
     }

     public GarlandLights getGarlandLights() {
          return garlandLights;
     }
}
