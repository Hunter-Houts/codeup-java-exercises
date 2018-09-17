import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);
        System.out.print("Enter a whole number: ");
        int userInput = scanner.nextInt();
        System.out.format("You entered %d%n", userInput);
        System.out.println();
        //ask user to enter three words then print them back out to the user
        System.out.print("Enter word 1/3: ");
        String word1 = scanner.next();
        System.out.print("Enter word 2/3: ");
        String word2 = scanner.next();
        System.out.print("Enter word 3/3: ");
        String word3 = scanner.next();
        System.out.println("Your 1st word was: " + word1);
        System.out.println("Your 2nd word was: " + word2);
        System.out.println("Your 3rd word was: " + word3);
        //ask user to enter a sentence
        System.out.println();
        System.out.print("Enter a Sentence: ");
        scanner.nextLine();
        String userSentence = scanner.nextLine();
        System.out.println("You entered: " + userSentence);
        //Calculate perimeter of room
        System.out.println();
        System.out.print("Enter width of room: ");
        int width = scanner.nextInt();
        System.out.print("Enter length of room: ");
        int length = scanner.nextInt();
        int perimeter = (width * 2) + (length * 2);
        System.out.println("The perimeter of the room is : " + perimeter);


    }
}
