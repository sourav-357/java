/*
Write a method named getLargestPrime with one parameter of type int named number. 
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it. 
*/
package Section6_conditional_logics;

public class P24_Challenge26 {
     public static int getLargestPrime(int number) {
          if (number <= 1) {
               return -1;
          }
          int largestPrime = -1;
          // Divide out all factors of 2
          while (number % 2 == 0) {
               largestPrime = 2;
               number /= 2;
          }
          // Check for odd prime factors
          for (int i = 3; i <= number; i += 2) {
               while (number % i == 0) {
                    largestPrime = i;
                    number /= i;
               }
          }
          return largestPrime;
     }
     public static void main(String[] args) {
          System.out.println(getLargestPrime(21));  // 7
          System.out.println(getLargestPrime(217)); // 31
          System.out.println(getLargestPrime(0));   // -1
          System.out.println(getLargestPrime(45));  // 5
          System.out.println(getLargestPrime(-1));  // -1
     }
}
