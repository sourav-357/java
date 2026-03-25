package Section5_statements_codeBlocks;

public class P05_Methods_Intro {

     public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

          int finalScore = score;
          if (gameOver) {
               finalScore += (levelCompleted * bonus);
               System.out.println("Your final Score was " + finalScore);
          }
     }
     public static void main(String[] args) {
          
          boolean gameOver = true;
          int score = 800;
          int levelCompleted = 5;
          int bonus = 100;
          
          // Callimg the method we just created
          System.out.println("This is the first method of calculating scores");
          calculateScore(gameOver, score, levelCompleted, bonus);

          // Calling the same method again 
          System.out.println("This is for the second values of calculating scores");
          calculateScore(true, 1000, 10, 200);
     }
}
