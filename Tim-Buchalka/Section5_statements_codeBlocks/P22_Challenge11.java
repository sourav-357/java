/*
Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
If one of the parameters is less than 0, print text "Invalid Value".

If all numbers are equal print text "All numbers are equal"
If all numbers are different print text "All numbers are different".
Otherwise, print "Neither all are equal or different".
*/

package Section5_statements_codeBlocks;

import java.util.Scanner;

public class P22_Challenge11 {
     public static void main(String[] args) {

          // Taking inputs from the user
          Scanner sc = new Scanner(System.in);
          System.out.println();
          System.out.print("Please enter the first number: ");
          int num1 = sc.nextInt();
          System.out.print("Please enter the second number: ");
          int num2 = sc.nextInt();
          System.out.print("Please enter the third number: ");
          int num3 = sc.nextInt();
          printEqual(num1, num2, num3);
          System.out.println();
          sc.close();
     }

     // Creating a method to check if numbers are equal
     public static void printEqual (int num1, int num2, int num3) {
          if (num1 < 0 || num2 < 0 || num3 < 0) {
               System.out.println("Invalid Value");
          } else {
               if (num1 == num2 && num1 == num3) {
               System.out.println("All numbers are equal");
               } else if (num1 != num2 && num2 != num3 && num1 != num3) {
                    System.out.println("All numbers are different");
               } else {
                    System.out.println("Neither all are equal or different");
               }
          }
     }
}
