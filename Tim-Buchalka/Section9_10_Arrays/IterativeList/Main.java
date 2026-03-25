package Section9_10_Arrays.IterativeList;

/*
Implement the list of cities to visit using (finished)
I've implemented
1. Linked lists
2. Iterative concept instead for loops or enhanced for loops
3. Methods that are in menu

Possible ways to improve
Refactor in such way that:
1. Handling ConcurrentModificationException in a different way
    1. Placing the navigate content into main method

IT IS AN EXEMPLARY CODE

Takeaways from this project:
1. Iterative object implementations
2. Methods: removeCity, alphabeticallyAdd, loadToList
3. Traveler class
4. The design of classes! //important
5. System.exit(0)
*/

import java.util.*;

public class Main {

     public static void main(String[] args) {
          List summerPlan = new List("Max", 20, "My best vacation!");
          List.navigate(summerPlan.getLinkedList());
          System.out.println(summerPlan.getTravelerName() + ",");
          System.out.println("You are just " + summerPlan.getTravelerAge() + " years old and using \""
                    + summerPlan.getTripName() + "\" list, you've visited " + Traveler.getNumberVisitedCities()
                    + " cities. Wow!");
          // never access static methods/fields with an instance
          // (summerPlan.getNumberVisitedCities)
          // It is a bad practice!

     }

     public static void printCities(LinkedList<String> city) {
          Iterator<String> iterator = city.iterator(); // to print cities we only need an iterator instead ListIterator!
          int i = 1;
          while (iterator.hasNext()) {
               System.out.println(i + ". " + iterator.next());
               i++;
          }
     }

     public static void menu() {
          System.out.println("Please enter a digit to select one of the following options:");
          System.out.println("0 -> stop program");
          System.out.println("1 -> visit next city");
          System.out.println("2 -> visit prev city");
          System.out.println("3 -> print all cities from your list");
          System.out.println("4 -> print this menu");
          System.out.println("5 -> add a city");
          System.out.println("6 -> removing a city");
          System.out.println("7 -> printing out the amount of visited cities");

          System.out.println("9 -> load the default cities to visit to the list");
     }
}