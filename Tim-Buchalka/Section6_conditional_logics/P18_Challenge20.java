/*
Write a method named hasSameLastDigit with three parameters of type int. 
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). 
If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

Write another method named isValid with one parameter of type int.
The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
*/
package Section6_conditional_logics;

public class P18_Challenge20 {
     public static boolean hasSameLastDigit(int num1, int num2, int num3) {
          // Validate input ranges
          if (! isValid(num1) || ! isValid(num2) || ! isValid(num3)) {
               return false;
          }
          int lastDigit1 = num1 % 10;
          int lastDigit2 = num2 % 10;
          int lastDigit3 = num3 % 10;
          return (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3);
     }
     // Helper method to check valid range
     public static boolean isValid(int number) {
          return number >= 10 && number <= 1000;
     }
     public static void main(String[] args) {
          System.out.println(hasSameLastDigit(41, 22, 71));  // true (1 is common)
          System.out.println(hasSameLastDigit(23, 32, 42));  // false
          System.out.println(hasSameLastDigit(9, 99, 999));  // false (9 is out of range)
          System.out.println(hasSameLastDigit(101, 201, 301)); // true (1 is common)
     }
}
