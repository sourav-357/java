package Section9_10_Arrays.MobilePhoneArray;

/*Create a program that implements a simple mobile phone with the following capabilities.

1.Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:
Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
And seven methods, they are (their functions are in their names):

addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't exists, or false if the contact already exists.
updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
    findContact(), has one parameter of type Contact and returns an int. The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
findContact(), same as above, only it has one parameter of type String.
queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name and then return the Contact. Return null otherwise.
printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:

Contact List:
1. Bob -> 31415926
2. Alice -> 16180339
3. Tom -> 11235813
4. Jane -> 23571113

2. Implement the Contact class with the following attributes:

Two fields, both String, one called name and the other phoneNumber.
A constructor that takes two Strings, and initialises name and phoneNumber.
And Three methods, they are:
getName(), getter for name.
getPhoneNumber(), getter for phoneNumber.
createContact(), has two parameters of type String (the persons name and phone number) and returns an instance of Contact. This is the only method that is static.

In MobilePhone, use findContact() in the other methods (except printContacts()) to check if it exists before proceeding.
Two Contact objects are equal if they have the same name.
Be extremely careful about spaces in the printed message.

All fields are private.
Constructors should be defined as public.
All methods should be defined as public (except for the two findContact() methods which are private).
Do not add a main method to the solution code.
If you get an error from the Evaluate class, it's most likely the constructor. Check if you've added a constructor or if the constructor has the right arguments.*/

import java.util.Scanner;

public class Main {
     public static Scanner scanner = new Scanner(System.in);
     private static MobilePhone mobilePhone = new MobilePhone("559"); // add a number

     // this getter is needed in order to access the mobilePhone object from the
     // Method Class!
     public static MobilePhone getMobilePhone() {
          return mobilePhone;
     }

     public static void main(String[] args) {
          boolean quit = false;
          while (!quit) {
               Method.menu();
               int choice = scanner.nextInt();
               scanner.nextLine(); // handling "Enter" key
               switch (choice) {
                    case 0:
                         break;
                    case 1:
                         mobilePhone.printContacts();
                         break;
                    case 2:
                         Method.update();
                         break;
                    case 3:
                         Method.add();
                         break;
                    case 4:
                         Method.remove();
                         break;
                    case 5:
                         Method.find();
                         break;
                    case 6:
                         quit = true;
                         break;
                    default:
                         System.out.println("Please select the number from a range 0 - 6");
               }
          }
     }
}