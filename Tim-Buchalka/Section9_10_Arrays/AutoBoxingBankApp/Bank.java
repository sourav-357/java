package Section9_10_Arrays.AutoBoxingBankApp;

import java.util.ArrayList;

public class Bank {
     private ArrayList<Branch> branches;
     private String bankName;

     public String getBankName() {
          return bankName;
     }

     public ArrayList<Branch> getBranches() {
          return branches;
     }

     public Bank(String bankName) {
          this.bankName = bankName;
          this.branches = new ArrayList<Branch>();
     }

     public boolean addingBranch(String branchName) {
          if (findBranch(branchName) == null) {
               this.branches.add(new Branch(branchName)); // initialazing a customer in the parenthesis !
               return true;
          }
          return false;
     }

     public boolean addingCustomer(String branchName, String customerName, double initAmount) {
          // since it is adding customer from this class, i have to specify the branch
          // name, customer new name, and init value
          Branch findOne = findBranch(branchName);
          if (findOne != null) {
               return findOne.addingCustomer(customerName, initAmount); // it will return true of false depending on the
                                                                        // inner class
          }
          return false;
     }

     public boolean addingTransaction(String branchName, String customerName, double addTransaction) {
          // since it is adding Transaction from this class, i have to specify the branch
          // name, customer name, and Transaction
          // it is like a матрёшка
          Branch findOne = findBranch(branchName);
          if (findOne != null) {
               return findOne.addingTransaction(customerName, addTransaction);
          }
          return false;
     }

     private Branch findBranch(String searchedBranch) { // private because this method is used only internally in this
                                                        // class
          for (int i = 0; i < this.branches.size(); i++) {
               Branch foundOne = this.branches.get(i);
               if (foundOne.getBranchName().equals(searchedBranch)) {
                    return foundOne;
               }
          }
          return null;
     }

     public boolean listCustomers(String branchName, boolean showTransactions) {
          Branch foundBranch = findBranch(branchName);
          if (foundBranch != null) {
               ArrayList<Customer> branchCustomers = foundBranch.getCustomers();
               System.out.println("Client names for " + foundBranch.getBranchName() + " branch are");
               for (int i = 0; i < branchCustomers.size(); i++) {
                    Customer branchCustomer = branchCustomers.get(i);
                    System.out.println(branchCustomer.getCustomerName());

                    if (showTransactions) {
                         System.out.println("Transactions for " + branchCustomer.getCustomerName() + " customer is");
                         ArrayList<Double> transactions = branchCustomer.getTransactions();
                         for (int j = 0; j < transactions.size(); j++) {
                              System.out.println("[" + (j + 1) + "] " + transactions.get(j));
                         }
                    }
               }
               return true;
          }
          return false;
     }

     public void listBranches() {
          System.out.println("Listing all branches:");
          for (int i = 0; i < getBranches().size(); i++) {
               Branch branch = branches.get(i);
               System.out.println(branch.getBranchName());
          }
     }

}