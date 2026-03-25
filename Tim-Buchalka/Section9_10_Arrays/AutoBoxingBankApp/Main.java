package Section9_10_Arrays.AutoBoxingBankApp;

public class Main {
     // You job is to create a simple banking application.
     // There should be a Bank class
     // It should have an arraylist of Branches
     // Class Branch. Each Branch should have an arraylist of Customers
     // The Customer class should have an arraylist of Doubles (transactions)

     // Customer:
     // Name, and the ArrayList of doubles.

     // Branch:
     // Need to be able to add a new customer and initial transaction amount.
     // Also needs to add additional transactions for that customer/branch

     // Bank:
     // Add a new branch
     // Add a customer to that branch with initial transaction
     // Add a transaction for an existing customer for that branch
     // Show a list of customers for a particular branch and optionally a list
     // of their transactions

     /*
      * Scheme
      * ArrayLists: Bank -> Branch -> Customer
      * methods blueprint
      *
      */

     // Demonstration autoboxing and unboxing in your code
     // Hint: Transactions
     // Add data validation.
     // e.g. check if exists, or does not exist, etc.
     // Think about where you are adding the code to perform certain actions

     public static void main(String[] args) {
          Bank bank = new Bank("National Australia Bank");
          System.out.println(bank.getBankName());

          bank.addingBranch("Adelaide");
          bank.addingBranch("Fox");
          bank.addingBranch("BNP");

          System.out.println("\n");

          bank.listBranches();
          System.out.println("\n");

          bank.addingCustomer("Adelaide", "Tim", 50.05);
          bank.addingCustomer("Adelaide", "Mike", 175.34);
          bank.addingCustomer("Adelaide", "Percy", 220.12);

          bank.addingCustomer("Fox", "Egor", 0);
          bank.listCustomers("Adelaide", true);

          bank.addingTransaction("Adelaide", "Tim", 44.22);
          bank.addingTransaction("Adelaide", "Tim", 12.44);
          bank.addingTransaction("Adelaide", "Mike", 1.65);

          System.out.println("\n");
          bank.listCustomers("Adelaide", true);

          System.out.println("\n");
          bank.listBranches();
          System.out.println("\n");
          bank.listCustomers("Fox", true);

          // testing
          if (!bank.addingCustomer("Adelaide", "Tim", 0))
               System.out.println("Customer exists");
          if (!bank.addingBranch("Adelaide"))
               System.out.println("Branch exists");
          if (!bank.addingTransaction("Adelaide", "Roman", 0))
               System.out.println("Oops, customer ain't exists");
          if (!bank.addingBranch("Adelaide"))
               System.out.println("Bank exists");
          if (!bank.addingTransaction("Bank of America", "Roman", 0))
               System.out.println("Oops, bank ain't exists");
          if (!bank.listCustomers("Bank of America", false))
               System.out.println("Oops, bank ain't exists");

     }
}
