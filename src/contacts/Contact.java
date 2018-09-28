package contacts;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class Contact {
    private String name;
    private String number;
    private HashMap<String,String> contacts;
    private String directory = "/Users/ohm/Code/codeup-java-exercises/src/contacts";
    private String filename = "contacts.txt";
    private Path FilePath = Paths.get(directory, filename);

    Contact(){
        this.contacts = new HashMap<>();
    }

    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void setContacts(){
        FilePath = Paths.get(directory,filename);
        try {
            List <String> read = Files.readAllLines(FilePath);
            for(int i = 0; i < read.size() -1; i+=2){

                contacts.put(read.get(i),read.get(i + 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void showAllContacts(){
        ArrayList<String> names = new ArrayList<>(contacts.keySet());
        ArrayList<String> numbers = new ArrayList<>(contacts.values());
        System.out.println("Name | Number");
        System.out.println("-------------");
        for(int i = 0; i < names.size(); i++){
            System.out.printf("%s | %s%n",names.get(i),numbers.get(i));
//            System.out.println(names.get(i));
//            System.out.println(numbers.get(i));
        }

    }

    public void addContact(String name, String number){
        contacts.put(name,number);
    }
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
            System.out.println("This was a triumph");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void searchContact(String name){
        if(contacts.containsKey(name)){
            System.out.printf("%s | %s%n",name,contacts.get(name));
        } else{
            System.out.println("Invalid name");
        }
    }



    public static void main(String[] args) {
        Contact test = new Contact();
        test.setContacts();
        test.showAllContacts();
        test.addContact("test","4564564");
        test.showAllContacts();
        test.writeContacts();
        test.searchContact("test");

    }
}
