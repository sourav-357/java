// the reserved keywords and expressions

package Section5_statements_codeBlocks;

public class P01_expressions_keywords {
     public static void main(String[] args) {
          // int int = 5; // wrong -->> as int is a reserved keywords

          int int2 = 5;
          System.out.println(int2);
          System.out.println("Hello from the Code");

          int highscore = 50;
          if (highscore > 25) {
               highscore = highscore + 1000; // Bonus points added
          }
          System.out.println("Your score is " + highscore);

          int health = 90;
          if ((health < 25) && (health > 1000)) {
               highscore = highscore - 1000;
          }
          System.out.println("Your score now is " + highscore);
     }
}
