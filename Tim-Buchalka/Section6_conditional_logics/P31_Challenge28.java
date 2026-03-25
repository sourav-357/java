/*
Write a method called inputThenPrintSumAndAverage that does not have any parameters.
The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long. 
*/
package Section6_conditional_logics;
import java.util.Scanner;

public class P31_Challenge28 {

     public static void inputThenPrintSumAndAverage() {
          Scanner scanner = new Scanner(System.in);
          
          int sum = 0;
          int count = 0;

          while (true) {
               if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    sum += number;
                    count++;
               } else {
                    break;
               }
          }

          long average = (count == 0) ? 0 : Math.round((double) sum / count);
          System.out.println("SUM = " + sum + " AVG = " + average);
          scanner.close();
     }

     public static void main(String[] args) {
          inputThenPrintSumAndAverage();
     }
}
