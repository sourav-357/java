package Section7_Classes_Objects.Constructor_part2;

public class Main {
    public static void main(String[] args) {

        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);
        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getNumber() + "; name " + timsAccount.getCustomerName());
    }
}
