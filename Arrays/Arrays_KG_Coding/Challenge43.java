package Arrays_KG_Coding;

import java.util.Scanner;

public class Challenge43 {

     static Scanner sc = new Scanner(System.in);

     public static int[] inputArray() {
          System.out.print("\nplease enter the number of element in your array: ");
          int size = sc.nextInt();
          int arr[] = new int[size];

          int i = 0;
          while (i < size) {
               System.out.print("Please enter the element " + (i + 1) + ": ");
               arr[i] = sc.nextInt();
               i++;
          }
          System.out.print("The array is: ");
          for (int j = 0; j < arr.length; j++) {
               System.out.print(arr[j] + " ");
          }
          System.out.println();
          return arr;
     }

     public static void main(String[] args) {

          int[] arr = inputArray();

          if (arr[0] < arr[1]) {
               for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] <= arr[i + 1]) {
                         i++;
                    } else {
                         System.out.println("The array is not sorted!");
                         return;
                    }
                    System.out.println("The array is sorted in the ascending order!");
               }
          } else if (arr[0] > arr[1]) {
               for (int i = 0; i < arr.length + 1; i++) {
                    
               }
          }
     }
}
