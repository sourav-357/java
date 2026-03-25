package Section9_10_Arrays.MobilePhoneArray;

//Class, that holds all methods which could had been placed in the Main Class; makes Main class cleaner

public class Method extends Main {

     public static void find() {
          System.out.println("Enter name of existing contact name that you want to find:");
          String personName = scanner.nextLine();
          Contact toFind = getMobilePhone().queryContact(personName);

          if (toFind == null) {
               System.out.println("Contact is not found");
          } else {
               System.out.println("Contact is found");
               System.out.println(toFind.getName() + " -> " + toFind.getPhoneNumber());
          }
     }

     public static void remove() {
          System.out.println("Enter name of existing contact name that you want to remove:");
          String personName = scanner.nextLine();
          Contact toRemove = getMobilePhone().queryContact(personName);

          if (toRemove == null) {
               System.out.println("Contact not found");
               return;
          }
          getMobilePhone().removeContact(toRemove);
     }

     public static void update() {
          System.out.println("Enter name of existing contact:");
          String personName = scanner.nextLine();
          Contact oldContact = getMobilePhone().queryContact(personName);

          if (oldContact == null) {
               System.out.println("Contact not found");
               return;
          }

          System.out.println("Enter a new contact name");
          personName = scanner.nextLine();

          System.out.println("Enter a new contact phone");
          String personPhone = scanner.nextLine();

          Contact newContact = Contact.createContact(personName, personPhone);
          getMobilePhone().updateContact(oldContact, newContact);
     }

     public static void add() {
          System.out.println("add name");
          String personName = scanner.nextLine();
          System.out.println("add number");
          String personPhone = scanner.nextLine();

          Contact newContact = Contact.createContact(personName, personPhone);
          getMobilePhone().addNewContact(newContact);
          System.out.println(
                    "New contact with " + personName + " name, and (" + personPhone + ") phone number was added");
     }

     static public void menu() {
          System.out.println("\nPress any of the following keys in order to manage your contacs:");
          System.out.println("0 -- to review this menu");

          System.out.println("1 -- to print contacts");
          System.out.println("2 -- to update");
          System.out.println("3 -- to add");
          System.out.println("4 -- to remove");
          System.out.println("5 -- to find");

          System.out.println("6 -- to quit");
     }
}
