/*
Write a method named area with one double parameter named radius.
The method needs to return a double value that represents the area of a circle.
If the parameter radius is negative then return -1.0 to represent an invalid value.

Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.

The method needs to return an area of a rectangle.
If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
*/
package Section5_statements_codeBlocks;

import java.util.Scanner;

public class P20_Challenge9 {
     public static void main(String[] args) {
          
          // Creating the scanner class here 
          Scanner sc = new Scanner(System.in);
          System.out.println();

          // using the first method here
          System.out.print("Please enter the radius of the circle: ");
          System.out.println("The area of the circle is " + area(sc.nextDouble()));
          System.out.println("\n");

          // using the second method here
          System.out.print("Please enter the length of the rectangle: ");
          double length = sc.nextDouble();
          System.out.print("Please enter the width of the rectangle: ");
          double width = sc.nextDouble();
          System.out.println("The area of the rectangle is " + area(length, width));
          
          // closing the Scanner class 
          System.out.println();
          sc.close();
     }

     // Creating the first method with double radius parameters
     public static double area (double radius) {
          if (radius < 0) {
               return -1.0;
          } else {
               return (radius * radius * (22.0/7.0));
          }
     }

     // Creating the second method here with another parameters
     public static double area (double x, double y) {
          if ((x < 0) || (y < 0)) {
               return -1.0;
          } else {
               return x * y;
          }
     }
}
