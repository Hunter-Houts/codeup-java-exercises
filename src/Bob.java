import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("Say something to Bob (exit to quit):");
            userInput = s.nextLine();
            if (userInput.equals("")) {
                System.out.println("Bob: Fine. be that way!");
            } else if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else {
                System.out.println("Bob: Whatever.");
            }
        } while(!userInput.equalsIgnoreCase("exit"));
    }
}
