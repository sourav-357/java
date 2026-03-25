package Section8_Encapsulation_polymorphism.PolymorphismCar;

public class Car {
     private boolean engine;
     private int cylinders;
     private String name;
     private int wheels;

     public Car(int cylinders, String name) {
          this.cylinders = cylinders;
          this.name = name;
          this.wheels = 4;
          this.engine = true;
     }

     public String startEngine() {
          return "Car starts engine";
     }

     public String accelerate() {
          return "Car is accelerating";
     }

     public String brake() {
          return "Car is breaking";
     }

     public int getCylinders() {
          return cylinders;
     }

     public String getName() {
          return name;
     }

     public static void main(String[] args) {
          Car car = new Car(8, "Base car");

          System.out.println(car.startEngine());
          System.out.println(car.accelerate());
          System.out.println(car.brake());

          Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4hD");
          System.out.println(mitsubishi.startEngine());
          System.out.println(mitsubishi.accelerate());
          System.out.println(mitsubishi.brake());

          Ford ford = new Ford(6, "Ford Falcon");
          System.out.println(ford.startEngine());
          System.out.println(ford.accelerate());
          System.out.println(ford.brake());

          Holden holden = new Holden(6, "Holden Commodore");
          System.out.println(holden.startEngine());
          System.out.println(holden.accelerate());
          System.out.println(holden.brake());
     }
}
