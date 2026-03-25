package Section8_Encapsulation_polymorphism.PolymorphismCar;

public class Ford extends Car {
     public Ford(int cylinders, String name) {
          super(cylinders, name);
     }

     @Override
     public String startEngine() {
          return "Ford start";
     }

     @Override
     public String accelerate() {
          return "Ford faster";
     }

     @Override
     public String brake() {
          return "Ford stop";
     }
}