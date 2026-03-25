/*
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

To determine whether a year is a leap year, follow these steps: 
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

Another way to put is:
A leap year is a year that is divisible by 4 but not 100.
If it's divisible by 100, it has to be divisible by 400.
*/

package Section5_statements_codeBlocks;

import java.util.Scanner;

public class P12_Challenge5 {

     // Creating a new Function here 
     public static boolean isLeapYear(int year) {
          if (year >= 1 && year <= 9999) {
               if ((year % 4.0 == 0) && (year % 100.0 != 0)) {
                    return true;
               }
               if (year % 100.0 == 0) {
                    if (year % 400.0 == 0) {
                         return true;
                    }
                    return false;
               }
               return false;

          } else {
               return false;
          }
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Please enter the number you need to check: ");
          int year = sc.nextInt();

          if (isLeapYear(year)) {
               System.out.println("This is a leap year!");
          } else {
               System.out.println("This is not a leap year!");
          }
          sc.close();
     }
}
