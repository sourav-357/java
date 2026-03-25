/*
Create a for loop using a range of numbers from 1 to 1000 inclusive.
Sum all the numbers that can be divided by both 3 and 5
Print out the numbers that have met the above conditions
break out of the loop once you have found 5 numbers that met the conditions.
After breaking out of the loop, print the sum of the numbers that met the conditions.
Note: type all code in the main method
*/
package Section6_conditional_logics;

public class P09_ForLoopChallenge {
     public static void main(String[] args) {

        int countOfMatches = 0;
        int sumOfMatches = 0;

        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {
            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
                countOfMatches++;
                sumOfMatches += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }
            if (countOfMatches == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sumOfMatches);
    }
}
