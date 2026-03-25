package Section8_Encapsulation_polymorphism.LastChallenge;

public class Hamburger {

     // We want to create a base hamburger, but also two other types of hamburgers
     // that are popular ones in Bills store.
     // The basic hamburger should have the following items.
     // Bread roll type, meat and up to 4 additional additions (things like lettuce,
     // tomato, carrot, etc) that
     // the customer can select to be added to the burger.

     private String burgerName;
     private float burgerPrice;
     private String meat;

     private String addition1Name;
     private float addition1Price;

     private String addition2Name;
     private float addition2Price;

     private String addition3Name;
     private float addition3Price;

     private String addition4Name;
     private float addition4Price;

     public Hamburger(String burgerName, float burgerPrice, String meat) {
          this.burgerName = burgerName;
          this.burgerPrice = burgerPrice;
          this.meat = meat;
     }

     public String getBurgerName() {
          return burgerName;
     }

     public void addAdditional1(String addition1Name, float addition1Price) {
          this.addition1Name = addition1Name;
          this.addition1Price = addition1Price;
     }

     public void addAdditional2(String addition2Name, float addition2Price) {
          this.addition2Name = addition2Name;
          this.addition2Price = addition2Price;
     }

     public void addAdditional3(String addition3Name, float addition3Price) {
          this.addition3Name = addition3Name;
          this.addition3Price = addition3Price;
     }

     public void addAdditional4(String addition1Name, float addition1Price) {
          this.addition4Name = addition4Name;
          this.addition4Price = addition4Price;
     }

     public float getBurgerPrice() {
          return burgerPrice;
     }

     public void updateBurgerPrice(float burgerPrice) {
          this.burgerPrice += burgerPrice;
     }

     public void printingBurgerInfo() {
          System.out.println(
                    "Your burger with " + meat + " is called " + burgerName + ". Current price: " + burgerPrice + "\n");

          if (addition1Name != null) {
               this.burgerPrice += addition1Price;
               System.out.println("Added " + addition1Name + " at price " + addition1Price + ".\nGrand total price is "
                         + this.burgerPrice + "\n");
          }
          if (addition2Name != null) {
               this.burgerPrice += addition2Price;
               System.out.println("Added " + addition2Name + " at price " + addition2Price + ".\nGrand total price is "
                         + this.burgerPrice + "\n");
          }
          if (addition3Name != null) {
               this.burgerPrice += addition3Price;
               System.out.println("Added " + addition3Name + " at price " + addition3Price + ".\nGrand total price is "
                         + this.burgerPrice + "\n");
          }
          if (addition4Name != null) {
               this.burgerPrice += addition4Price;
               System.out.println("Added " + addition4Name + " at price " + addition4Price + ".\nGrand total price is "
                         + this.burgerPrice + "\n");
          }
     }

}
