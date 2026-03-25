/*
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false. 
Check the tips below for more info about palindromes.
*/
package Section6_conditional_logics;

public class P14_Challenge16 {

     public static boolean isPalindrome(int number) {
          int originalNumber = number;
          int reversed = 0;

          // Make the number positive for reversal logic
          number = Math.abs(number);
          while (number > 0) {
               int lastDigit = number % 10;
               reversed = reversed * 10 + lastDigit;
               number /= 10;
          }
          // Compare reversed with original number (ignoring sign)
          return Math.abs(originalNumber) == reversed;
     }
     public static void main(String[] args) {
          System.out.println(isPalindrome(121));   // true
          System.out.println(isPalindrome(-121));  // true
          System.out.println(isPalindrome(123));   // false
     }
}
