package Arrays_KG_Coding;

import java.util.Scanner;

public class Challenge40 {

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

          int arr[] = inputArray();
          int sum = 0;
          int i = 0;
          while (i < arr.length) {
               sum += arr[i];
               i++;
          }
          System.out.println("The sum of all the elements of the array is: " + sum);
          System.out.println("The average of all the elements of the array is: " + (sum / arr.length));
     }
}