/*
Write a method named hasSharedDigit with two parameters of type int. 
Each number should be within the range of 10 (inclusive) - 99 (inclusive). 
If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
*/
package Section6_conditional_logics;

public class P17_Challenge19 {
     public static boolean hasSharedDigit(int num1, int num2) {
          // Check if both numbers are within the valid range
          if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
               return false;
          }
          int num1FirstDigit = num1 / 10;
          int num1LastDigit = num1 % 10;
          int num2FirstDigit = num2 / 10;
          int num2LastDigit = num2 % 10;
          // Check for any shared digit
          return (num1FirstDigit == num2FirstDigit || num1FirstDigit == num2LastDigit || num1LastDigit == num2FirstDigit || num1LastDigit == num2LastDigit);
     }
     public static void main(String[] args) {
          System.out.println(hasSharedDigit(12, 23));
          System.out.println(hasSharedDigit(15, 55)); 
          System.out.println(hasSharedDigit(19, 91)); 
          System.out.println(hasSharedDigit(12, 45)); 
          System.out.println(hasSharedDigit(9, 99));  
     }
}
