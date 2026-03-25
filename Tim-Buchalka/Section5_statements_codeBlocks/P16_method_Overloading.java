
// The method overloading in details
package Section5_statements_codeBlocks;

public class P16_method_Overloading {
     public static void main(String[] args) {

          // Using the first method we just created
          System.out.println("New score is " + calculateScore("abc", 500));

          // using the second method we created with different parameters -->> Method overloading
          System.out.println("New Score for the unnamed player is " + calculateScore(200));

          // using the third method we created with different parameters -->> Method overloading
          System.out.println("New Score for the unnamed player is " + calculateScore(200));
     }

     // now creating a new method 
     public static int calculateScore(String playerName, int score) {
          System.out.println("\nPlayer " + playerName + " scored " + score + " points");
          return score * 1000;
     }

     // again creating a new method with same name -->> Method overloading
     public static int calculateScore(int score) {
          System.out.println("\nUnnamed player scored " + score + " points");
          return score * 1000;
     }

     // again creating a new method with same name -->> Method overloading
     public static int calculateScore() {
          System.out.println("\nNo player name, no player score");
          return 0;
     }
}