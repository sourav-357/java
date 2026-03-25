package Section9_10_Arrays.AutoBoxingBankApp;

import java.util.ArrayList;

public class Branch {
     private ArrayList<Customer> customers;
     private String branchName;

     public Branch(String branchName) {
          this.branchName = branchName;
          this.customers = new ArrayList<Customer>();

     }

     public ArrayList<Customer> getCustomers() {
          return customers;
     }

     public String getBranchName() {
          return branchName;
     }

     // 3rd inner

     public boolean addingCustomer(String name, double initAmount) {
          if (findCustomer(name) == null) {
               this.customers.add(new Customer(name, initAmount)); // initializing a customer in the parenthesis !
               return true;
          }
          return false;
     }

     private Customer findCustomer(String searchedCustomer) { // private because this method is used only internally in
                                                              // this class
          // treat Customer as a data type
          for (int i = 0; i < this.customers.size(); i++) {
               Customer foundOne = this.customers.get(i); // treat Customer as a data type
               if (foundOne.getCustomerName().equals(searchedCustomer)) {
                    return foundOne;
               }
          }
          return null;
     }

     // 4th inner

     public boolean addingTransaction(String customerName, double addTransaction) {
          Customer existingCustomer = findCustomer(customerName);
          if (existingCustomer != null) {
               existingCustomer.getTransactions().add(addTransaction); // adding a new transaction
               return true;
          }
          return false;
     }
}
