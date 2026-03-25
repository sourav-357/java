package Section9_10_Arrays.IterativeList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class List extends Traveler {
     private LinkedList<String> linkedList;
     private String tripName;

     public List(String travelerName, int travelerAge, String tripName) {// it has to have same amount of parameters or
                                                                         // more with super constructor!
          super(travelerName, travelerAge);
          this.tripName = tripName;
          this.linkedList = new LinkedList<>();
     }

     public List() {
     } // it has to have same amount of parameters or more with super constructor!

     public LinkedList<String> getLinkedList() {
          return linkedList;
     }

     public String getTripName() {
          return tripName;
     }

     private void removeCity(LinkedList<String> cityList, String deletedCity) {
          if (cityList.remove(deletedCity)) {
               System.out.println(deletedCity + " has been removed");
          } else
               System.out.println("Could not find the city you want to remove");

          List.navigate(cityList);
     }

     // adds a new city and update the list without an error
     private void noExceptionError(LinkedList<String> listOfCities, String cityName) {
          ListIterator<String> listIterator = listOfCities.listIterator();

          while ((listIterator.hasNext())) {
               int comparison = listIterator.next().compareTo(cityName);
               if (comparison == 0) {
                    System.out.println(cityName + " has been already added to the list");
                    return;
               } else if (comparison > 0) {
                    listIterator.previous();
                    break;
               }
          }
          listIterator.add(cityName);

          List.navigate(listOfCities);
     }

     private void loadToList(LinkedList<String> listOfCities) {
          alphabeticallyAdd(listOfCities, "Poznan");
          alphabeticallyAdd(listOfCities, "Gdansk");
          alphabeticallyAdd(listOfCities, "Szczeczin");
          alphabeticallyAdd(listOfCities, "Warszawa");
          alphabeticallyAdd(listOfCities, "Lodz");
          alphabeticallyAdd(listOfCities, "Wroclaw");

          List.navigate(listOfCities);
     }

     private void alphabeticallyAdd(LinkedList<String> listOfCities, String cityName) {
          ListIterator<String> listIterator = listOfCities.listIterator(); // just a setup; doesn't point to the 1st
                                                                           // element

          while ((listIterator.hasNext())) {
               // if value is greater, the word that is in the list is alphabetically bigger,
               // thus, put it before the list element
               // if equal, it is duplicate! return false
               // else it is less, thus, we have to move further in the list
               int comparison = listIterator.next().compareTo(cityName); // retrieves the 1st value and goes to the next
               if (comparison == 0) {
                    System.out.println(cityName + " has been already added to the list");
                    return;
               } else if (comparison > 0) {
                    listIterator.previous(); // because we've used .next() in the int comparison initialization
                    listIterator.add(cityName); // don't use linkedList.add because it doesn't know the int comparison,
                                                // so cannot properly add!!!
                    return;
               }
          }
          listIterator.add(cityName); // adding at the end of the list
     }

     public static void navigate(LinkedList<String> listOfCities) {
          Scanner userChoice = new Scanner(System.in);
          List travelListObject = new List();

          ListIterator<String> listIterator = listOfCities.listIterator();
          boolean goingForward = true;

          while (true) {
               Main.menu();
               int choice = userChoice.nextInt();
               userChoice.nextLine(); // takes care of enter key problem
               switch (choice) {
                    case 0:
                         System.out.println("Goodbye");
                         userChoice.close();
                         System.exit(0);
                    case 1: // moving forward
                         if (!goingForward) {
                              if (listIterator.hasNext()) {
                                   listIterator.next();
                              }
                         }
                         if (listIterator.hasNext()) {
                              System.out.println(listIterator.next());
                              Traveler.setNumberVisitedCities(Traveler.getNumberVisitedCities() + 1);
                              goingForward = true;
                         } else {
                              System.out.println("No more cities in the list");
                              goingForward = false;
                         }
                         break;
                    case 2: // moving back
                         if (goingForward) {
                              if (listIterator.hasPrevious()) {
                                   listIterator.previous();
                              }
                              goingForward = false;
                         }
                         if (listIterator.hasPrevious()) {
                              Traveler.setNumberVisitedCities(Traveler.getNumberVisitedCities() + 1);
                              System.out.println(listIterator.previous());
                         } else {
                              System.out.println("You're at the beginning of the list");
                              goingForward = true;
                         }
                         break;
                    case 3:
                         Main.printCities(listOfCities);
                         break;
                    case 4:
                         break;
                    case 5:
                         System.out.println("Write new city");
                         String addedCity = userChoice.next();
                         travelListObject.noExceptionError(listOfCities, addedCity);
                         break;
                    case 6:
                         System.out.println("Write the city you want to delete");
                         String deletedCity = userChoice.next();
                         travelListObject.removeCity(listOfCities, deletedCity);
                         break;
                    case 7:
                         System.out.println(
                                   "You have been in " + Traveler.getNumberVisitedCities() + " cities in total");
                         break;
                    case 9:
                         travelListObject.loadToList(listOfCities);
                         break;
                    default:
                         System.out.println("Something weird happened. Try to choose an option again");
               }
          }
     }
}
