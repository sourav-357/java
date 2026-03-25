package Section5_statements_codeBlocks;

public class P04_if_else_Challenge {
     public static void main(String[] args) {
          
          boolean gameOver = true;
          int score = 800;
          int levelCompleted = 5;
          int bonus = 100;

          int finalScore = score;
          if (gameOver) {
               finalScore += (levelCompleted * bonus);
               System.out.println("Your final Score was " + finalScore);
          }

          //-------------------- replacing the variables with new values --------------------//
          
          score = 10000; // we don't have to re-define these variables
          levelCompleted = 8; // we don't have to re-define these variables
          bonus = 200; // we don't have to re-define these variables

          if (gameOver) {
               finalScore += (levelCompleted * bonus);
               System.out.println("Your final Score now is " + finalScore);
          }
     }
}
