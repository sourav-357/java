/*
Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
Check that number is > 0, if it is not return false.
If number is odd return true, otherwise return false.

Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
It should call the method isOdd to check if each number is odd.

The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
If those conditions are not satisfied return -1 from the method to indicate invalid input.
*/
package Section6_conditional_logics;

public class P10_CodingChallenge15 {
     // writting the main class here 
     public static void main(String[] args) {
          // Nothing here
     }
     // The first method here isOdd to check if the number is odd or not 
     public static boolean isOdd (int number) {
          if (number > 0) {
               if (number % 2.0 != 0.0) {
                    return true;
               } else {
                    return false;
               }
          } else {
               return false;
          }
     }
     // The second method to check teh sum of the numbers between a specified range
     public static int sumOdd(int start, int end) {
          if (start < 0 || end < 0 || end < start) {
               return -1;
          }
          int sum = 0;
          for (int i = start; i <= end; i++) {
               if (isOdd(i)) {
                    sum += i;
               }
          }
          return sum;
    }
}
