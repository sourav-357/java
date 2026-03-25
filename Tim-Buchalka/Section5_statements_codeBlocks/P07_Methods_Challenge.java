package Section5_statements_codeBlocks;

public class P07_Methods_Challenge {
     // Creating the first method 
     public static void displayHighScoreposition ( String playerName, int playerPosition) {
          System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
     }

     // creating the second method
     public static int calculateHighScoreposition (int playerScore) {
          if (playerScore >= 1000) {
               return 1;
          } else if ((playerScore >= 500 ) & (playerScore < 1000)) {
               return 2;
          } else if ((playerScore >= 100) && (playerScore < 500)) {
               return 3;
          } else {
               return 4;
          }
     }

     // Defining a method to call the two methods
     public static void answers (int score) {
          // Using the two methods
          int position = calculateHighScoreposition(score);
          displayHighScoreposition("sourav", position);
     }
     public static void main(String[] args) {
          
          // calling the answers by different values
          answers(1500);
          answers(1000);
          answers(500);
          answers(100);
          answers(25);
     }
}
