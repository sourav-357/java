/*
Write a method called checkNumber with an int parameter named number.
The method should not return any value, and it needs to print out:
- "positive" if the parameter number is > 0
- "negative" if the parameter number is < 0
- "zero" if the parameter number is equal to 0
*/

package Section5_statements_codeBlocks;
import java.util.Scanner;

public class P08_Challenge1 {

     // Creating a method to check the number 
     public static void checkNumber(int number) {
          if (number > 0) {
               System.out.println("Positive");
          } else if(number < 0) {
               System.out.println("negative");
          } else {
               System.out.println("zero");
          }
     }
     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Please enter the number you need to check: ");
          int num = sc.nextInt();
          checkNumber(num);
          sc.close();
     }
}
