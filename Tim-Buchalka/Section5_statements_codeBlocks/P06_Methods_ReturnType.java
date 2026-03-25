package Section5_statements_codeBlocks;

public class P06_Methods_ReturnType {

     // defining a method for calculating the scores
     public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

          int finalScore = score; // Calculating the score
          if (gameOver) {
               finalScore += (levelCompleted * bonus);
               return finalScore; // return the calculated score
          }
          return -1; // if the game is not over then default return value 
     }
     public static void main(String[] args) {
          
          // Defining the variables
          boolean gameOver = true;
          int score = 800;
          int levelCompleted = 5;
          int bonus = 100;
          
          // Callimg the method we just created
          System.out.println("This is the first method of calculating scores");
          // Printing the return of the calculated score
          System.out.println("The score is " + calculateScore(gameOver, score, levelCompleted, bonus));
     }
}
