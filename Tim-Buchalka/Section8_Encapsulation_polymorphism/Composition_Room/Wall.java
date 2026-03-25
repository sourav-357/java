package Section8_Encapsulation_polymorphism.Composition_Room;

public class Wall {
     private int amount;
     private String material;
     private String color;
     private boolean isNoiceProtected;

     public Wall(int amount, String material, String color, boolean isNoiceProtected) {
          this.amount = amount;
          this.material = material;
          this.color = color;
          this.isNoiceProtected = isNoiceProtected;
     }

     public void punchWall() {
          System.out.println("Making warning to a neighbour by punching a wall");
     }

     public int getAmount() {
          return amount;
     }

     public String getMaterial() {
          return material;
     }

     public String getColor() {
          return color;
     }

     public boolean isNoiceProtected() {
          return isNoiceProtected;
     }
}
