package Section8_Encapsulation_polymorphism.PolymorphismCar;

public class Holden extends Car {
     public Holden(int cylinders, String name) {
          super(cylinders, name);
     }

     @Override
     public String startEngine() {
          return "Holden start";
     }

     @Override
     public String accelerate() {
          return "Holden faster";
     }

     @Override
     public String brake() {
          return "Holden stop";
     }
}