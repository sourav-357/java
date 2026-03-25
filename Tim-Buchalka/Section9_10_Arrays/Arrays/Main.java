package Section9_10_Arrays.Arrays;

import java.util.Scanner;

public class Main {
     static Scanner scanArray = new Scanner(System.in);

     static int[] getIntegers(int size) { // user's chosen array size
          int[] newArr = new int[size];
          System.out.println("Enter array values:\r");

          for (int i = 0; i < newArr.length; i++) {
               newArr[i] = scanArray.nextInt();
          }

          return newArr;
     }

     static void printArray(int[] arr) {
          for (int i = 0; i < arr.length; i++) {
               System.out.println(i + 1 + " index is " + arr[i]);
          }
     }

     // bubble sort
     static int[] bubbleSort(int[] array) {
          for (int i = 0; i <= array.length; i++) {
               for (int j = i + 1; j < array.length; j++) {
                    int temp;
                    if (array[i] < array[j]) {
                         temp = array[i];
                         array[i] = array[j];
                         array[j] = temp;
                    }
               }
          }
          return array;
     }

     public static void main(String[] args) {
          System.out.println("how many numbers do you wish to hold in the array: ");
          Scanner arraySize = new Scanner(System.in);
          int size = arraySize.nextInt();
          arraySize.close();

          int[] array = getIntegers(size);
          bubbleSort(array);
          printArray(array);
     }
}
