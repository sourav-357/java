/* 
Accurate MegaBytes Converter For Mastering Integer Math In Java
Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.

For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
If the parameter kiloBytes is less than 0 then print the text "Invalid Value"
*/

package Section5_statements_codeBlocks;

import java.util.Scanner;

public class P10_Challenge3 {

     public static void printMegaBytesAndKiloBytes(int kiloBytes) {
          if (kiloBytes < 0) {
               System.out.println("Invalid Value");
          } else {
               System.out.print(kiloBytes + " KB = ");
               int megabytes = kiloBytes/1000;
               kiloBytes -= (megabytes*1000);
               System.out.println(megabytes + " MB and " + kiloBytes + " KB");
          }
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Please enter the total in KB: ");
          int kb = sc.nextInt();
          printMegaBytesAndKiloBytes(kb);
          sc.close();
     }
}
