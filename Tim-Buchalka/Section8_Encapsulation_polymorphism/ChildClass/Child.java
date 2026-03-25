package Section8_Encapsulation_polymorphism.ChildClass;

// Child class
class Cat extends Animal {
     public void greeting() {
          System.out.println("The cat meows.");
     }

     public void voice2() {
          System.out.println("Meow");
     }

     public static void main(String[] args) {
          Animal cat1 = new Cat(); // Cat object
          cat1.greeting(); // prints "The cat meows." from current class, BUT:
          cat1.voice1(); // if methods are different i can access only the parent method!!
     }
}