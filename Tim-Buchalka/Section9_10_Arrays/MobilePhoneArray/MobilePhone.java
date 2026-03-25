package Section9_10_Arrays.MobilePhoneArray;

import java.util.ArrayList;

/*CrrayList object is in this class
we also have have Contact class here

idea:
!we operate with the amount of contact by using the ArrayList of objects of the class Contact

object of class Contact has 2 fields. in methods I assign those fields with constructor and add them to this ArrayList

!!!Contact class is a blueprint for this  myContacts  ArrayList;
 */
public class MobilePhone {
     private ArrayList<Contact> myContacts; // Contacs in <> is like a data type of Class Contact the ArrayList
     private String myPhoneNumber;

     public MobilePhone(String myPhoneNumber) {
          this.myPhoneNumber = myPhoneNumber;
          this.myContacts = new ArrayList<>();
     }

     public boolean addNewContact(Contact contact) {
          if (findContact(contact.getName()) < 0) {
               return this.myContacts.add(contact); // add method returns boolean
          }
          return false;
     }

     public boolean updateContact(Contact oldContact, Contact newContact) {
          int objectPositionInArrayList = findContact(oldContact.getName());
          if (objectPositionInArrayList >= 0) {
               this.myContacts.set(objectPositionInArrayList, newContact);
               return true;
          }
          return false;
     }

     public boolean removeContact(Contact contact) {
          return this.myContacts.remove(contact); // remove method returns boolean
     }

     public void printContacts() {
          System.out.println("Printing all contacts");
          if (myContacts.size() == 0) {
               System.out.println("NO CONTACTS");
          } else {
               for (int i = 0; i < myContacts.size(); i++) {
                    System.out.println((i + 1) + ". " + myContacts.get(i).getName()
                              + " -> " + myContacts.get(i).getPhoneNumber());
               }
          }
          // get(i) gets the object (name, number). to retrieve a name I need to have
          // .getContactName() also.
          // get(i) without .getContactName() will give me only the address to an object
     }

     private int findContact(String searchedContact) {
          for (int i = 0; i < this.myContacts.size(); i++) {
               Contact contact = this.myContacts.get(i);
               if (contact.getName().equals(searchedContact)) {
                    return i;
               }
          }
          return -1;
     }

     // basically find method for public. it allows to manipulate this myContacts
     // from Main class
     public Contact queryContact(String contactName) {
          int index = findContact(contactName);
          if (findContact(contactName) >= 0) {
               return myContacts.get(index); // which Contact instance
          }
          return null;
     }

}
