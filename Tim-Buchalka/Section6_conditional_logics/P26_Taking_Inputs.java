package Section6_conditional_logics;

public class P26_Taking_Inputs {

     // The main file to run the codes
     public static void main(String[] args) {
          int currentYear = 2022;
          System.out.println(getInputFromConsole(currentYear));
          System.out.println(getInputFromScanner(currentYear));
     }
     // Creating the first method to take inputs from the console
     public static String getInputFromConsole(int currentYear) {
          String name = System.console().readLine("Hi, What's your Name? ");   // Taking inputs
          System.out.println("Hi " + name + ", Thanks for taking the course!");  // Printing the taken inputs
          String dateOfBirth = System.console().readLine("What year were you born? ");   // Taking inputs
          int age = currentYear - Integer.parseInt(dateOfBirth);  
          return "So you are " + age + " years old";   // Printing the taken inputs
     }
     public static String getInputFromScanner(int currentYear) {
          return "";
     }
}
