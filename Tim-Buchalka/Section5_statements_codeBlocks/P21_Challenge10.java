/*
Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

If the parameter is less than 0, print text "Invalid Value".
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.
*/

package Section5_statements_codeBlocks;

import java.util.Scanner;

public class P21_Challenge10 {
     public static void main(String[] args) {
          
          // taking inputs from Scanner class
          Scanner sc = new Scanner(System.in);
          System.out.print("\n\nPlease enter the number of minutes: ");

          // Taking inputs and Calling the methods
          printYearsAndDays(sc.nextLong());
          sc.close();
          System.out.println();
     }

     // Creating a new method here with return type void
     public static void printYearsAndDays (long minutes) {
          if (minutes < 0) {
               System.out.println("Invalid Value");

          } else {
               // printing input minutes
               System.out.print("\n" + minutes + " min = "); 
               // Calculating years
               long years = minutes / (60 * 24 * 365); 

               // printing years
               System.out.print(years + " y and "); 
               // Calculating number of days 
               long days = ((minutes - (years * 60 * 24 * 365)) / (60 * 24)); 
               // Printing days 
               System.out.print(days + " d"); 
          }
     }
}
