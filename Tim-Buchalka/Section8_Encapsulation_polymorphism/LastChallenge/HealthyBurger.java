package Section8_Encapsulation_polymorphism.LastChallenge;

public class HealthyBurger extends Hamburger {
     private String addAdditionalHealth1;
     private float addAdditionalHealthPrice1;

     private String addAdditionalHealth2;
     private float addAdditionalHealthPrice2;

     public HealthyBurger(float burgerPrice, String meat) {
          super("Healthy", burgerPrice, meat);
     }

     public void addHealthyAdditional1(String name, float price) {
          this.addAdditionalHealth1 = name;
          this.addAdditionalHealthPrice1 = price;
     }

     public void addHealthyAdditional2(String name, float price) {
          this.addAdditionalHealth2 = name;
          this.addAdditionalHealthPrice2 = price;
     }

     @Override
     public void printingBurgerInfo() {
          super.printingBurgerInfo();
          if (this.addAdditionalHealth1 != null) {
               super.updateBurgerPrice(addAdditionalHealthPrice1);
               System.out.println(
                         "Added " + this.addAdditionalHealth1 + " for an extra " + this.addAdditionalHealthPrice1);
               System.out.println("Grand total price for " + getBurgerName() + " is " + getBurgerPrice());
          }
          if (this.addAdditionalHealth2 != null) {
               super.updateBurgerPrice(addAdditionalHealthPrice2);
               System.out.println(
                         "Added " + this.addAdditionalHealth2 + " for an extra " + this.addAdditionalHealthPrice2);
               System.out.println("Grand total price for " + getBurgerName() + " is " + getBurgerPrice());
          }
     }
}

/*
 * Also create two extra varieties of Hamburgers (subclasses) to cater for
 * a) Healthy burger (on a brown rye bread roll), plus two addition items that
 * can be added.
 * The healthy burger can have 6 items (Additions) in total.
 * hint: you probably want to process the two additional items in this new class
 * (subclass of Hamburger),
 * not the base class (Hamburger), since the two additions are only appropriate
 * for this new class
 * (in other words new burger type).
 */