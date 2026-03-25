package Section9_10_Arrays.Reverse_Element_Challenge;

import java.util.*;
import java.util.Scanner;

/*
* -Write a method called reverse() with an int array as a parameter.
-The method should not return any value. In other words, the method is allowed to modify the array parameter.
-In main() test the reverse() method and print the array both reversed and non-reversed.
-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
*/

public class Main {

     public static void main(String[] args) {
          int size = 4;
          int[] myArray = readIntegers(size);

          reverse(myArray);
          System.out.println("After reverse() array is " + Arrays.toString(myArray));
     }
     /*
      * public static void main(String[] args) {
      * 
      * int[] array = { 1, 5, 3, 7, 11, 9};
      * 
      * System.out.println("Array = " + Arrays.toString(array));
      * 
      * reverse(array);
      * 
      * System.out.println("Reversed array = " + Arrays.toString(array));
      * }
      */

     static void reverse(int[] arr) {
          int[] arrTemp = new int[arr.length];

          int j = 0;
          for (int i = arr.length - 1; i >= 0; i--) {
               arrTemp[j] = arr[i];
               j++;
          }

          for (int i = 0; i < arr.length; i++) {
               arr[i] = arrTemp[i];
          }
          // arr = Arrays.copyOf(arrTemp, arr.length);
     }

     static int[] reverseWithoutAnotherArray(int[] arr) {
          int arrSize = arr.length - 1;
          int arrHalfSize = arrSize / 2;

          for (int i = 0; i < arrHalfSize; i++) {
               int temp = arr[i];
               arr[i] = arr[arrSize - i];
               arr[arrSize - i] = temp;
          }

          return arr;
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
}