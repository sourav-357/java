package Section8_Encapsulation_polymorphism.Coding_exercise_37;

public class Lamp {
     private String style;
     private boolean battery;
     private int globRating;

     public Lamp(String style, boolean battery, int globRating) {
          this.style = style;
          this.battery = battery;
          this.globRating = globRating;
     }

     public void turnOn() {
          System.out.println("Lamp -> turning on | ");
     }

     public boolean isBattery() {
          return battery;
     }

     public String getStyle() {
          return style;
     }

     public int getGlobRating() {
          return globRating;
     }
}
