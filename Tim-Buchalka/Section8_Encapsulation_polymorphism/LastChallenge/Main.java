package Section8_Encapsulation_polymorphism.LastChallenge;

public class Main {

     public static void main(String[] args) {

          System.out.println("Welcome to Bills Burgers!");
          Hamburger b1 = new Hamburger("Mraz", 3.6f, "chicken");
          b1.addAdditional1("cheese", 0.5f);
          b1.printingBurgerInfo();

          HealthyBurger hb1 = new HealthyBurger(4f, "pork");
          System.out.println(hb1.getBurgerName() + "at price " + hb1.getBurgerPrice());
          hb1.addAdditional1("Tomato", 0.9f);
          hb1.printingBurgerInfo();
     }
}