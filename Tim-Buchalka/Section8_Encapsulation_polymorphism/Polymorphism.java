package Section8_Encapsulation_polymorphism;

class Course {
     private final String courseName;

     public Course(String courseName) {
          this.courseName = courseName;
     }

     public String getCourseName() {
          return courseName;
     }

     // ! default method if no method is specified within the class!
     public String getExplanationNote() {
          return "Just because :)";
     }
}

class AlgorithmsDataStructure extends Course {
     public AlgorithmsDataStructure() {
          super("Algorithms And Data Structure class");
     }

     public String getExplanationNote() {
          return "Study harder";
     }
}

class IntroToComputerScience extends Course {
     public IntroToComputerScience() {
          super("Computer Science class");

     }
}

class OOP extends Course {
     public OOP() {
          super("Object Oriented Programming class");
     }

     @Override
     public String getExplanationNote() {
          return "Don't cheat on the exam";
     }
}

public class Polymorphism {

     public static void main(String[] args) {

          int randX = randomNumber();

          System.out.println("You got warunek: " + warunek(randX).getCourseName());
          System.out.println("\nreason for getting warunek:\n" + warunek(randX).getExplanationNote());
     }

     public static int randomNumber() {
          return (int) (Math.random() * 3) + 1;
     }

     public static Course warunek(int x) {
          switch (x) {
               case 1:
                    return new AlgorithmsDataStructure();
               case 2:
                    return new IntroToComputerScience();
               case 3:
                    return new OOP();
               default:
                    return null;
          }

     }

}
