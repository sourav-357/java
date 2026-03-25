package Section9_10_Arrays.Reference_Value;

import java.util.Arrays;

public class Main {
     public static void main(String[] args) {
          int[] myIntArray = new int[5];
          int[] anotherArray = myIntArray;
          System.out.println("myIntArray= " + Arrays.toString(myIntArray));
          System.out.println("anotherArray= " + Arrays.toString(anotherArray));

          modifyArray(myIntArray);
          System.out.println("after modify, myIntArray = " + Arrays.toString(myIntArray));
          System.out.println("after modify, anotherArray= " + Arrays.toString(anotherArray));
     }

     private static void modifyArray(int[] array) {
          array[0] = 2;
          array = new int[] { 1, 2, 3, 4, 5 };
     }
}
