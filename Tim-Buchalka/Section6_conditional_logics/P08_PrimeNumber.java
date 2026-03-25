package Section6_conditional_logics;

public class P08_PrimeNumber {
     public static void main(String[] args) {

        int count = 0;
        // Writting the for block for the following codes
        for (int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }
    }
    // Writting the method to check out if the number is a prime number or not
    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2 || wholeNumber == 1);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
