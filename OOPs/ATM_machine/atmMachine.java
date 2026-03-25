

package OOPs.ATM_machine;

import java.util.*;

class atm {

    double balance;
    int PIN = 6791;
    Scanner sc = new Scanner(System.in);

    // check pin method
    void checkPin() {
        System.out.print("\n\nPlease enter your 4 digit pin: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Invalid pin entered by the user");
            checkPin();
        }
    }

    // menu method
    void menu() {
        System.out.println("\n\nchoose your option number: ");
        System.out.println("1. check your bank balance");
        System.out.println("2. withdraw money");
        System.out.println("3. deposit money");
        System.out.println("4. exit");

        int userChoice = sc.nextInt();
        switch (userChoice) {
            case 1:
                checkBalance();
                break;

            case 2:
                withdraw();
                break;

            case 3:
                deposit();
                break;

            case 4:
                exit();
                break;

            default:
                System.out.println("Please enter a valid choice");
                menu();
                break;
        }
    }

    void checkBalance() {
        System.out.println("\n\nYour current balance is " + this.balance);
        menu();
    }

    void withdraw() {
        System.out.println("\n\nEnter amount you want to withdraw: ");
        double enteredAmount = sc.nextDouble();

        if (enteredAmount <= this.balance) {
            System.out.println("Your amount of " + enteredAmount + " is successfully withdrawn");
            balance -= enteredAmount;
            menu();
        } else if (enteredAmount < 0) {
            System.out.println("enter the correct amount");
            menu();
        } else {
            System.out.println("You couldn't withdraw more than your balance");
            menu();
        }
    }

    void deposit() {
        System.out.println("\n\nEnter the amount you want to deposit");
        double enteredAmount = sc.nextDouble();

        if (enteredAmount < 0) {
            System.out.println("Please enter the valid amount");
            menu();
        } else {
            System.out.println("Your amount of " + enteredAmount + " is successfully deposited");
            balance += enteredAmount;
            menu();
        }
    }

    void exit() {
        System.out.println("\n\nThank you for using our bank!\n\n");
        return;
    }
}

public class atmMachine {
    public static void main(String[] args) {
        
        atm a1 = new atm();
        a1.checkPin();
    }

}