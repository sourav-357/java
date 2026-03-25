/*
We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
Write a method shouldWakeUp that has 2 parameters.
1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
In all other cases return false.
If the hourOfDay parameter is less than 0 or greater than 23 return false.
*/

package Section5_statements_codeBlocks;
import java.util.Scanner;

public class P11_Challenge4 {

     // defining a function named shouldWakeUp
     public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
          if (hourOfDay < 0 || hourOfDay > 23) {
               return false;
          }
          return (barking && (hourOfDay < 8 || hourOfDay >= 23));
     }
     public static void main(String[] args) {

          // Taking inputs from users
          Scanner sc = new Scanner(System.in);
          System.out.print("Please enter the hours of the day: ");
          int hours = sc.nextInt();
          System.out.print("Please tell if the dog is barking: ");
          boolean barking = sc.nextBoolean();

          // Printing the value after crosscheck
          if (shouldWakeUp(barking, hours)) {
               System.out.println("Please wake up the dog is barking");
          } else {
               System.out.println("The dog is barking but you need to sleep");
          }
          sc.close();
     }
}
