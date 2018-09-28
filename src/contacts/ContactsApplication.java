package contacts;

import util.Input;
public class ContactsApplication {
    static Input scan = new Input();
    public static void main(String[] args) {
        Contact theContacts = new Contact();
        theContacts.setContacts();
        while(true) {
            System.out.println("1. View contacts");
            System.out.println("2. Add a new contact.");
            System.out.println("3. Search contact by name.");
            System.out.println("4. Delete an existing contact.");
            System.out.println("5. Exit.");
            System.out.println("Enter an option (1, 2, 3, 4, 5):");
            int userChoice = scan.getInt();
            if (userChoice == 1) {
                theContacts.showAllContacts();
            } else if (userChoice == 2) {
                System.out.println("Enter name:");
                scan.getString();
                String name = scan.getString();
                System.out.println("Enter Number:");
                String number = scan.getString();
                theContacts.addContact(name, number);
            } else if (userChoice == 3) {
                System.out.println("Enter a name to get information:");
                scan.getString();
                String search = scan.getString();
                theContacts.searchContact(search);
            } else if (userChoice == 4) {
                System.out.println("Enter a name to delete:");
                scan.getString();
                String delete = scan.getString();
                theContacts.deleteContact(delete);
            } else if (userChoice == 5) {
                System.out.println("Goodbye!");
                theContacts.writeContacts();
                System.exit(0);
            } else {
                System.out.println("Not a valid choice!\nTry again!");
            }
            System.out.println();
        }
    }
}
