/*
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
*/
package Section5_statements_codeBlocks;

public class P13_Challenge6 {

     public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
          return (((long)(num1 * 1000)) == ((long)(num2 * 1000)));
     }
     public static void main(String[] args) {
          boolean isTrue = areEqualByThreeDecimalPlaces(1.998, 1.998);
          System.out.println(isTrue);
     }
}
