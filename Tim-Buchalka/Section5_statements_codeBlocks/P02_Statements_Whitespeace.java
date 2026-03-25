package Section5_statements_codeBlocks;

public class P02_Statements_Whitespeace {
     public static void main(String[] args) {
          
          // Defining a new variable
          int myvariable = 50;
          myvariable--;
          myvariable++;

          // the expression is still executable
          System.out.println("This is a test");
          System.out.println("This is just " + 
          "another " + 
          "Test");

          // White Spacing in Java
          System.out.println
          (
               "the variable is " + myvariable
               )
               ;

          // Giving multiple expressions on a single line 
          int anotherVariable = 50; myvariable--; System.out.println("my variable " + myvariable + " and another variable " + anotherVariable);
     }
}
