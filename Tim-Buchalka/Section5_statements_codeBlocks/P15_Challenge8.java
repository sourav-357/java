/*
We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
Write a method named hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

Write another method named isTeen with 1 parameter of type int.
The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
*/
package Section5_statements_codeBlocks;

public class P15_Challenge8 {

     public static boolean hasTeen(int num1, int num2, int num3) {
          if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
               return true;
          } else {
               return false;
          }
     }

     public static boolean isTeen(int num1) {
          if (num1 >= 13 && num1 <= 19) {
               return true;
          } else {
               return false;
          }
     }
     public static void main(String[] args) {
          
     }
}
