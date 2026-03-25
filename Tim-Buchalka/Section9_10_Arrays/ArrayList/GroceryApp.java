package Section9_10_Arrays.ArrayList;

import java.util.ArrayList;

public class GroceryApp {
     private ArrayList<String> groceryList = new ArrayList<>();
     public static int countObjects;

     public ArrayList<String> getGroceryList() {
          return groceryList;
     }

     public GroceryApp() {
          countObjects++;
     }

     public void printWithEnhance() {
          for (String item : groceryList) {
               System.out.print(item + " ");
          }
     }

     public void printItem() {
          for (int i = 0; i < groceryList.size(); i++) {
               System.out.println((i + 1) + ". " + groceryList.get(i)); // num is like groceryList.get(num)
          }
          if (groceryList.size() == 0) {
               System.out.println("List is empty");
          }
     }

     public void addItem(String name) {
          groceryList.add(name);
     }

     private void updateItem(int index, String name) {
          groceryList.set(index, name);
     }

     public void updateItem(String oldItem, String newItem) {
          int result = groceryList.indexOf(oldItem);
          if (result >= 0) {
               updateItem(result, newItem);
          } else
               System.out.println("No such item");
     }

     private void removeItem(int index) {
          groceryList.remove(index);
     }

     public void removeItem(String toDelete) {
          int result = groceryList.indexOf(toDelete);
          if (result >= 0) {
               removeItem(result);
          }
     }

     private int findItem(String name) {
          return groceryList.indexOf(name);
     }

     // checks if item is present
     public boolean isItem(String name) {
          int result = findItem(name);
          if (result >= 0) {
               return true;
          } else
               return false;
     }
}
