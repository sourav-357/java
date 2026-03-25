/*
Write a method called printNumberInWord. The method has one parameter number which is the whole number. 
The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" 
if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. 
You can use if-else statement or switch statement whatever is easier for you.
*/

package Section6_conditional_logics;

public class P05_Challenge13 {
     public static void main(String[] args) {
          
     }
     public static void printNumberInWord(int number) {
        String numberInWord;
        switch (number) {
            case 0 -> numberInWord = "ZERO";
            case 1 -> numberInWord = "ONE";
            case 2 -> numberInWord = "TWO";
            case 3 -> numberInWord = "THREE";
            case 4 -> numberInWord = "FOUR";
            case 5 -> numberInWord = "FIVE";
            case 6 -> numberInWord = "SIX";
            case 7 -> numberInWord = "SEVEN";
            case 8 -> numberInWord = "EIGHT";
            case 9 -> numberInWord = "NINE";
            default -> numberInWord = "OTHER";
        }
        System.out.println(numberInWord);
    }
}
