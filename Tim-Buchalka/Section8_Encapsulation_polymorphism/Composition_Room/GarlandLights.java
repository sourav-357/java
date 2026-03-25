package Section8_Encapsulation_polymorphism.Composition_Room;

public class GarlandLights {
     private String color;
     private boolean isWorking;
     private float length;

     public GarlandLights(String color, boolean isWorking, float length) {
          this.color = color;
          this.isWorking = isWorking;
          this.length = length;
     }

     public void pplsReaction() {
          System.out.println("Girls go squiiiirt!");
     }

     public String getColor() {
          return color;
     }

     public boolean isWorking() {
          return isWorking;
     }

     public float getLength() {
          return length;
     }
}
