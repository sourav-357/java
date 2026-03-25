package Section9_10_Arrays.Minimum_Element_Challenge;

import java.util.Scanner;

/*
* 3-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

* -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
-Finally, print the minimum element in the array.
Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name eMinElementChallengef
* */
public class Main {
     private static Scanner amountEl = new Scanner(System.in);

     public static void main(String[] args) {
          int size;

          System.out.println("Enter how many elements you wish an array to consist: ");
          size = amountEl.nextInt();
          amountEl.nextLine(); // has to do with "enter" key like in C lang scanf a char

          int[] myArray = readIntegers(size);
          System.out.println(findMin(myArray));
     }

     static int[] readIntegers(int count) {
          System.out.println("Please, enter " + count + " numbers into the array");
          int[] intArray = new int[count];
          Scanner scanInt = new Scanner(System.in);
          for (int i = 0; i < intArray.length; i++) {
               intArray[i] = scanInt.nextInt();

          }
          scanInt.close();
          return intArray;
     }

     static int findMin(int[] array) {
          int minValue = Integer.MAX_VALUE; // entering the biggest value in order to compare.
                                            // also possible to enter the 1st element: minValue = array[0]
          System.out.println("The minimum value of the current array is ");
          for (int i = 0; i < array.length; i++) {
               if (minValue > array[i]) {
                    minValue = array[i];
               }
          }
          return minValue;
     }
}
