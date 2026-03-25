package Section6_conditional_logics;

public class P01_SwitchStatements {
     public static void main(String[] args) {

        // Normal way to do is the use of if else statements
       int value = 3;
       if (value == 1) {
           System.out.println("Value was 1");
       } else if (value == 2) {
           System.out.println("Value was 2");
       } else {
           System.out.println("Was not 1 or 2");
       }

        int switchValue = 3;
        // Using the switch case here to get the desired output 
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }
    }
}
