/*
Write a method named sumFirstAndLastDigit with one parameter of type int called number. 
The method needs to find the first and the last digit of the parameter number passed to the method, 
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
*/
package Section6_conditional_logics;

public class P15_Challenge17 {
     public static int sumFirstAndLastDigit(int number) {
          if (number < 0) {
               return -1; // Invalid input
          }
          int lastDigit = number % 10;
          int firstDigit = number;
          while (firstDigit >= 10) {
               firstDigit /= 10;
          }
          return firstDigit + lastDigit;
     }
     public static void main(String[] args) {
          System.out.println(sumFirstAndLastDigit(252));  // 2 + 2 = 4
          System.out.println(sumFirstAndLastDigit(257));  // 2 + 7 = 9
          System.out.println(sumFirstAndLastDigit(0));    // 0 + 0 = 0
          System.out.println(sumFirstAndLastDigit(5));    // 5 + 5 = 10
          System.out.println(sumFirstAndLastDigit(-10));  // -1 (invalid)
     }
}
