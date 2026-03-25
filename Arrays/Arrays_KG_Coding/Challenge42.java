package Arrays_KG_Coding;

import java.util.Scanner;

public class Challenge42 {

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
          int min = arr[0];
          int max = arr[0];

          for (int i = 0; i < arr.length; i++) {
               if (arr[i] < min)
                    min = arr[i];
               i++;
          }
          System.out.println("The minimumm among all the elements of this array is " + min);

          for (int i = 0; i < arr.length; i++) {
               if (arr[i] > max)
                    max = arr[i];
               i++;
          }
          System.out.println("The maximum among all the elements of this array is " + max);
     }
}
