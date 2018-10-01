package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Contact {
    private HashMap<String,String> contacts;
    private String directory = "/Users/ohm/Code/codeup-java-exercises/src/contacts";
    private String filename = "contacts.txt";
    private Path FilePath = Paths.get(directory, filename);
    // Initialize a HashMap on new instance of Contact class
    Contact(){
        this.contacts = new HashMap<>();
    }

    // This reads from the file (contacts.txt) and populates the HashMap with keys and values
    public void setContacts(){
        try {
            List <String> read = Files.readAllLines(FilePath);
            for(int i = 0; i < read.size() -1; i+=2){

                contacts.put(read.get(i),read.get(i + 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    // This throws the keys and values into separate ArrayLists and then shows them to the user
    public void showAllContacts(){
        ArrayList<String> names = new ArrayList<>(contacts.keySet());
        ArrayList<String> numbers = new ArrayList<>(contacts.values());
        System.out.println("Name | Number");
        System.out.println("-------------");
        for(int i = 0; i < names.size(); i++){
            System.out.printf("%s | %s%n",names.get(i),numbers.get(i));

        }

    }
    // This allows the user to add a name, while checking that it doesn't already exist
    public void addContact(String name, String number){
        if(contacts.containsKey(name)){
            System.out.println("Sorry this contact already exists. ");
        } else {
            contacts.put(name, number);
        }
    }
    // this is used to write back to the file (contacts.txt) at the exit
    public void writeContacts(){
        ArrayList<String> names = new ArrayList<>(contacts.keySet());
        ArrayList<String> numbers = new ArrayList<>(contacts.values());
        ArrayList<String> combined = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++){
            combined.add(names.get(i));
            combined.add(numbers.get(i));
        }
        try {
            Files.write(FilePath,combined);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //this searches the HashMap for a key and if it exists, spits out the information to the user for that contact
    public void searchContact(String name){
        if(contacts.containsKey(name)){
            System.out.printf("%s | %s%n",name,contacts.get(name));
        } else{
            System.out.println("Invalid contact name");
        }
    }
    // This allows a user to delete an existing contact.
    public void deleteContact(String name){
        if(contacts.containsKey(name)){
            contacts.remove(name);
            System.out.println("Contact removed");
        } else {
            System.out.println("Invalid contact name");
        }
    }


    // Tested this class below before implementing it in the application.
    public static void main(String[] args) {
        Contact test = new Contact();
        test.setContacts();
        test.showAllContacts();
        test.addContact("test","4564564");
        test.showAllContacts();
        test.writeContacts();
        test.searchContact("test");
        test.deleteContact("test");
        test.showAllContacts();

    }
}
