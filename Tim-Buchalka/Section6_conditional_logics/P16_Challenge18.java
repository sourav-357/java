/*
Write a method named getEvenDigitSum with one parameter of type int called number. 
The method should return the sum of the even digits within the number. 
If the number is negative, the method should return -1 to indicate an invalid value.
*/
package Section6_conditional_logics;

public class P16_Challenge18 {
     public static int getEvenDigitSum(int number) {
          if (number < 0) {
               return -1; // Invalid input
          }
          int sum = 0;
          while (number > 0) {
               int digit = number % 10;
               if (digit % 2 == 0) {
                    sum += digit;
               }
               number /= 10;
          }
          return sum;
     }
     public static void main(String[] args) {
          System.out.println(getEvenDigitSum(123456789)); // 2 + 4 + 6 + 8 = 20
          System.out.println(getEvenDigitSum(252));       // 2 + 2 = 4
          System.out.println(getEvenDigitSum(-22));       // -1 (invalid)
     }
}
