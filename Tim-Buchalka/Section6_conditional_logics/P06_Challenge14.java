/*
Write a method isLeapYear with a parameter of type int named year. 
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false. 
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. 
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.
If parameter month is < 1 or > 12 return -1. ​
If parameter year is < 1 or > 9999 then return -1.
This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear described above.
*/
package Section6_conditional_logics;

public class P06_Challenge14 {
    public static void main(String[] args) {
        
    }    
    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9_999) {
            return -1;
        }
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;  
            case 2 -> isLeapYear(year) ? 29 : 28; 
            case 4, 6, 9, 11 -> 30; // return 30 for the following months
            default -> -1; // return -1 if the month parameter is not between 1 and 12.
        };
    }
    public static boolean isLeapYear(int year) {
        
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) { 
            if (year % 100 != 0) { 
                return true;
            } else { 
                if (year % 400 == 0) { 
                    return true;
                } else { 
                    return false;
                }
            }
        } else { 
            return false;
        }
    }
}
