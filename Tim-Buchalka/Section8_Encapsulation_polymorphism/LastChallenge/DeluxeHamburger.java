package Section8_Encapsulation_polymorphism.LastChallenge;

// Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made

public class DeluxeHamburger extends Hamburger {
     private boolean chips;
     private boolean drinks;

     public DeluxeHamburger(String burgerName, float burgerPrice, String meat, boolean chips, boolean drinks) {
          super(burgerName, burgerPrice, meat);
          this.chips = chips;
          this.drinks = drinks;
     }

     @Override
     public float getBurgerPrice() {
          System.out.println("The Deluxe price is");
          return super.getBurgerPrice() + 3;
     }

}