/*
Write a method named printFactors with one parameter of type int named number. 
If number is < 1, the method should print "Invalid Value".
The method should print all factors of the number. A factor of a number is an integer which divides that number wholly.
For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.
*/
package Section6_conditional_logics;

public class P19_Challenge21 {
     public static void printFactors(int number) {
          if (number < 1) {
               System.out.println("Invalid Value");
               return;
          }
          for (int i = 1; i <= number; i++) {
               if (number % i == 0) {
                    System.out.println(i);
               }
          }
     }
     public static void main(String[] args) {
          printFactors(6);
          // Output: 1, 2, 3, 6
          printFactors(32);
          // Output: 1, 2, 4, 8, 16, 32
          printFactors(-1);
          // Output: Invalid Value
     }
}
