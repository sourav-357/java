package Arrays_KG_Coding;

import java.util.Scanner;

public class Challenge41 {

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

          int num = sc.nextInt();
          System.out.print("\nPlease enter the number you want to check: ");
          int occourances = 0;

          int[] arr = inputArray();
          int i = 0;
          while (i < arr.length) {
               if (arr[i] == num) {
                    occourances++;
               }
               i++;
          }

          System.out.println("The entered Number " + num + " is entered " + occourances + " times in the array!");
     }
}