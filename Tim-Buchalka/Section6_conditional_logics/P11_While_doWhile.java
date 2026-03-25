package Section6_conditional_logics;

public class P11_While_doWhile {
     public static void main(String[] args) {
          for (int i = 1; i <= 5; i++) {
               System.out.println(i);
          }
          int j = 1;
          boolean isReady = false;

          // This is the do while loops
          do {
               if (j > 5) {
                    break;
               }
               System.out.println(j);
               j++;
               isReady = (j > 0);
          } while (isReady);

          // Now comes the while loops
          int number = 0;
          while (number < 50) {
               number += 5;
               if (number % 25 == 0) {
                    continue;
               }
               System.out.print(number + "_");
          }
     }
}
