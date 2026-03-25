/*
Write a method named isPerfectNumber with one parameter of type int named number. 
If number is < 1, the method should return false.
The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, it should return false. 
*/
package Section6_conditional_logics;

public class P21_Challenge23 {
     public static boolean isPerfectNumber(int number) {
          if (number < 1) {
               return false; // Invalid input
          }
          int sum = 0;
          // Check all numbers from 1 to number - 1
          for (int i = 1; i < number; i++) {
               if (number % i == 0) {
                    sum += i;
               }
          }
          return sum == number;
     }
     public static void main(String[] args) {
          System.out.println(isPerfectNumber(6));    // true (1 + 2 + 3 = 6)
          System.out.println(isPerfectNumber(28));   // true (1 + 2 + 4 + 7 + 14 = 28)
          System.out.println(isPerfectNumber(5));    // false
          System.out.println(isPerfectNumber(-1));   // false
     }
}
