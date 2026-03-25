/*

*/
package Section6_conditional_logics;

public class P25_Challenge27 {
     public static void printSquareStar(int number) {
          if (number < 5) {
               System.out.println("Invalid Value");
               return;
          }
          for (int row = 1; row <= number; row++) {
               for (int col = 1; col <= number; col++) {
                    if (
                         row == 1 ||                       // Top border
                         row == number ||                 // Bottom border
                         col == 1 ||                      // Left border
                         col == number ||                 // Right border
                         row == col ||                    // Primary diagonal
                         col == (number - row + 1)        // Secondary diagonal
                    ) {
                         System.out.print("*");
                    } else {
                         System.out.print(" ");
                    }
               }
               System.out.println(); // Move to next row
          }
     }
     public static void main(String[] args) {
          printSquareStar(5);
          printSquareStar(8);
     }
}
