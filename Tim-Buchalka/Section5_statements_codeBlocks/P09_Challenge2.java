/*
1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the calculation of type long.
If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.
*/

/*
2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
Then it needs to print a message in the format "XX km/h = YY mi/h".
XX represents the original value kilometersPerHour.
YY represents the rounded milesPerHour from the kilometersPerHour parameter.
If the parameter kilometersPerHour is < 0 then print the text "Invalid Value"
 */

package Section5_statements_codeBlocks;

public class P09_Challenge2 {

     // Writing the first method toMilesPerHour
     public static long toMilesPerHour(double kilometersPerHour) {
          if (kilometersPerHour > 0) {
               double answer = kilometersPerHour * 0.621371;
               return Math.round(answer);
          } else {
               return -1;
          }
     }

     // Creating another method here 
     public static void printConversion(double kilometersPerHour) {
          if (kilometersPerHour < 0) {
               System.out.println("Invalid Value");
          } else {
               System.out.println(kilometersPerHour + " km/h = " + (kilometersPerHour * 0.621371) + " mi/h");
          }
     }
     public static void main(String[] args) {
          
          System.out.println(toMilesPerHour(10.25));
          printConversion(10.25);

     }
}
